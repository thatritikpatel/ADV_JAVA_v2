package listeners;

import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;

public class SessionListener implements HttpSessionListener {
	public void sessionCreated(HttpSessionEvent ev){
		System.out.println("####~~~~~~~~~~~~~~~~~~~~~~~~~####");
		System.out.println("----- session created -----");
		System.out.println("####~~~~~~~~~~~~~~~~~~~~~~~~~####");
	}

	public void sessionDestroyed(HttpSessionEvent ev ){
		System.out.println("####~~~~~~~~~~~~~~~~~~~~~~~~~####");
		System.out.println("----- session about to destroy -----");
		System.out.println("####~~~~~~~~~~~~~~~~~~~~~~~~~####");
	}
}