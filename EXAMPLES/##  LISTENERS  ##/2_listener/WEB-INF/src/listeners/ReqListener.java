package listeners;

import javax.servlet.ServletRequestListener;
import javax.servlet.ServletRequestEvent;

public class ReqListener implements ServletRequestListener{
	public void requestInitialized(ServletRequestEvent ev){
		System.out.println("#########################");
		System.out.println("######## Request Object Created ##########");
		System.out.println(ev.getServletRequest().getParameter("name"));
		System.out.println("#########################");
	}

	public void requestDestroyed(ServletRequestEvent ev){
		System.out.println("#########################");
		System.out.println("######## Request Object will destroy ##########");
		System.out.println("#########################");
	}
}