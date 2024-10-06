package elfuncs;

public class AppElFactory{
	public static String showData(){
		String str = "<table border='1' width='30%'>";

		String[] arr = {"Mohan","Sohan","Rohan","Ganesh","Suresh","Vighnesh"};

		for(String s : arr){
			str += "<tr><td>"+s+"</td></tr>";
		}

		str += "</table>";

		return str;
	}
}