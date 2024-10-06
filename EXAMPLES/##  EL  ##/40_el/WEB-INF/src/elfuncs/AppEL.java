package elfuncs;

import java.util.ArrayList;
import models.*;

public class AppEL{
	public static String prepareCitiesList(ArrayList<City> cities){
		String str = "<select>";

		for(City city : cities){
			str += "<option>"+city.getCity()+"</option>";
		}

		str += "</select>";

		return str;
	}


	public static String prepareStatesList(ArrayList<State> states){
		String str = "<select>";

		for(State state : states){
			str += "<option>"+state.getState()+"</option>";
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