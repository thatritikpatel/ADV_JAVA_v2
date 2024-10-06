import java.sql.*;

class F{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb?user=root&password=1234");
			
			String query = "update employees set email=? where emp_id=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1,args[0]);
			pst.setInt(2,Integer.parseInt(args[1]));

			System.out.println(pst.executeUpdate());

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}