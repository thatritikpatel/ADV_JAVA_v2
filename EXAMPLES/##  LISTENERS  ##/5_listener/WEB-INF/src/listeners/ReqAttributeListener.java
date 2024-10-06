package listeners;

import javax.servlet.*;

public class ReqAttributeListener implements ServletRequestAttributeListener{
	public void attributeAdded(ServletRequestAttributeEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Addedd~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}
	
	public void attributeRemoved(ServletRequestAttributeEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Removed~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Replaced~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}
}