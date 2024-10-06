package listeners;

import javax.servlet.*;

import models.State;

import java.util.ArrayList;

public class AppListener implements ServletContextListener{
	public void contextInitialized(ServletContextEvent ev){
		ArrayList<State> states = State.collectStates();
		ServletContext ct = ev.getServletContext();
		ct.setAttribute("states",states);
	}

	public void contextDestroyed(ServletContextEvent ev){
			
	}
}