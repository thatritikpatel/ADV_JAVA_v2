package listeners;

import javax.servlet.http.*;

public class SessionAttributeListener implements HttpSessionAttributeListener{
	public void attributeAdded(HttpSessionBindingEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Addedd~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}
	
	public void attributeRemoved(HttpSessionBindingEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Removed~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}

	public void attributeReplaced(HttpSessionBindingEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Replaced~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}
}