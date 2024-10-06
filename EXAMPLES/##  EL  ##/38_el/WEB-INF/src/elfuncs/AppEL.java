package elfuncs;

import java.sql.*;

public class AppEL{
	public static String createUserRecords(){
		String str = "<select>";
		
		Connection con = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/records?user=root&password=1234");

			String query = "select user_name from users";

			PreparedStatement p = con.prepareStatement(query);

			ResultSet r = p.executeQuery();

			while(r.next()){
				str += "<option>"+r.getString(1)+"</option>";
			}

			str += "</select>";
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}

		return str;
	}
}