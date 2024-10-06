package listeners;

import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletContextAttributeEvent;

public class AppAttributeListener implements ServletContextAttributeListener{
	public void attributeAdded(ServletContextAttributeEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Addedd~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}
	
	public void attributeRemoved(ServletContextAttributeEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Removed~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent ev){
		System.out.println("~~~~~~~~~~~~Attrib. Replaced~~~~~~~~~~~~~");
		System.out.println("~~~~~~~~~~~~"+ev.getName()+"~~~~~~~~~~~~~"+ev.getValue());
	}
}