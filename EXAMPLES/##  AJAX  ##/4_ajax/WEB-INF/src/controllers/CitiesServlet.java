package controllers;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;

import models.City;
import java.util.ArrayList;

import com.google.gson.Gson;

public class CitiesServlet extends HttpServlet{
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
		int stateId = Integer.parseInt(request.getParameter("state_id"));

		ArrayList<City> cities = City.collectCities(stateId);

		Gson gson = new Gson();
		String allCitiesStr = gson.toJson(cities);

		System.out.println(allCitiesStr);

		response.getWriter().write(allCitiesStr);
	}
}