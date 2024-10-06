package elfuncs;

import java.util.ArrayList;
import models.*;

public class AppEL{
	public static String prepareDropDown(ArrayList records){
		String str = "<select>";

		for(Object obj : records){
			if(obj instanceof State){
				State state = (State)obj;
				str += "<option>"+state.getState()+"~</option>";
			}else{
				City city = (City)obj;
				str += "<option>"+city.getCity()+"#</option>";
			}
			
		}

		str += "</select>";

		return str;
	}
	
	
	public static String prepareRecordList(ArrayList<Student> students){
		String str = "<table width='70%' border='1'>";

		for(Student st : students){
			str += "<tr><td>"+st.getStudentId()+"</td>";
			str += "<td>"+st.getStudentName()+"</td>";
			str += "<td>"+st.getEmail()+"</td>";
			str += "<td>"+st.getPassword()+"</td></tr>";
		}

		str += "</table>";

		return str;
	}
}