package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import java.util.List;

import models.User;

import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;

public class SignupServlet extends HttpServlet{
	public void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		if(ServletFileUpload.isMultipartContent(request)){
			DiskFileItemFactory dfif = new DiskFileItemFactory();
			ServletFileUpload sfu = new ServletFileUpload(dfif);

			List<FileItem> list = null;
			try{
				list = sfu.parseRequest(request);
			}catch(FileUploadException e){
				e.printStackTrace();
			}
			
			User user = new User();
			for(FileItem fi : list){
				if(fi.isFormField()){
					String fieldName = fi.getFieldName();
					String fieldValue = fi.getString();
					
					if(fieldName.equals("uname")){
						user.setUserName(fieldValue);
					}else if(fieldName.equals("email")){
						user.setEmail(fieldValue);
					}else if(fieldName.equals("passw")){
						user.setPassword(fieldValue);
					}				
					
					//System.out.println(fieldName+" --------- "+fieldValue);
				}else{
					String fileName = fi.getName();
					String uploadPath = getServletContext().getRealPath("/WEB-INF/uploads/"+user.getEmail());

					File f1 = new File(uploadPath);
					f1.mkdir();

					File f2 = new File(f1,fileName);
					
					try{
						fi.write(f2);
						user.setPicPath(fileName);
					}catch(Exception e){
						e.printStackTrace();
					}
					//System.out.println("------"+fi.getName());
				}
			}

			user.signupUser();
		}

		request.getRequestDispatcher("signin.jsp").forward(request,response);
	}
}