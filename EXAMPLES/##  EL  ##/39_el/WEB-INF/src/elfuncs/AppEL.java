package elfuncs;

import java.util.ArrayList;
import models.Student;

public class AppEL{
	public static String prepareRecordList(ArrayList<Student> students){
		String str = "<table width='70%' border='1'>";

		for(Student st : students){
			str += "<tr><td>"+st.getStudentId()+"</td>";
			str += "<td>"+st.getStudentName()+"</td>";
			str += "<td>"+st.getEmail()+"</td>";
			str += "<td>"+st.getPassword()+"</td></tr>";
		}

		return str;
	}
}