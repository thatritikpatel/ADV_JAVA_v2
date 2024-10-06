import java.sql.*;

class G{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb?user=root&password=1234");
			
			String query = "delete from employees where emp_id=?";
			
			PreparedStatement pst = con.prepareStatement(query);
			pst.setInt(Integer.parseInt(args[0]));

			System.out.println(pst.executeUpdate());

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}