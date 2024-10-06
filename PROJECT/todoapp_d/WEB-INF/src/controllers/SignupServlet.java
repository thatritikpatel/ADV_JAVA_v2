package controllers;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

import models.*;

import java.net.URL;
import java.net.HttpURLConnection;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonObject;

import utils.TextLocalSMS;
import utils.OTPGenerator;

public class SignupServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{	
		
		String userName = request.getParameter("uname");
		String email = request.getParameter("email");
		String password = request.getParameter("pass");
		String rePassword = request.getParameter("repass");
		int countryId = Integer.parseInt(request.getParameter("country_id"));
		

		System.out.println("################# reCaptcha Code #################");
		String reCaptchaCode = request.getParameter("g-recaptcha-response");
		//System.out.println(reCaptchaCode);
		
		String reCaptchaURL = "https://www.google.com/recaptcha/api/siteverify";
		String params = "secret=6Ld_TPAUAAAAIlaNU-30hI7WXXhHg__G_1OY&response="+reCaptchaCode;
		
		URL url = new URL(reCaptchaURL+"?"+params);
		
		HttpURLConnection con = (HttpURLConnection)url.openConnection();
		con.setRequestMethod("POST");		
		con.setDoOutput(true);
				
		DataOutputStream dos = new DataOutputStream(con.getOutputStream());		
		dos.flush();
		dos.close();	

		JsonReader jr = Json.createReader(con.getInputStream());
		JsonObject jo = jr.readObject();		
		
		boolean flag = jo.getBoolean("success");

		System.out.println("################# reCaptcha Code ##################");


		System.out.println("################# TextLocal OTP SMS Code ##################");
		System.out.println(TextLocalSMS.sendSms(OTPGenerator.newOTP()));
		System.out.println("################# TextLocal OTP SMS Code ##################");
		
		String nextPage = "signup.jsp";
		if(flag){
			User user = new User();
			user.setUserName(userName);
			user.setEmail(email);
			user.setPassword(password);
			user.setCountry(new Country(countryId));
						
			if(user.signupUser()){
				nextPage = "signin.jsp";
			}else{
				request.setAttribute("message","Duplicate Email Address...");
			}		
		}else{
			request.setAttribute("message","Captcha Test Failed...");
		}
		
		request.getRequestDispatcher(nextPage).forward(request,response);				
	}
}