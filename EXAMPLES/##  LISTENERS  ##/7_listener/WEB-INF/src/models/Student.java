package models;

import javax.servlet.http.*;

public class Student implements HttpSessionBindingListener{
	public void valueBound(HttpSessionBindingEvent ev){
		System.out.println("#################");
	}

	public void valueUnbound(HttpSessionBindingEvent ev){
		System.out.println("&&&&&&&&&&&&&&");
	}
}