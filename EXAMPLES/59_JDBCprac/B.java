import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class B{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb?user=root&password=1234");
			
			String query = "insert into employees (emp_nm,email,password) value (?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);
			
			pst.setString(1,args[0]);
			pst.setString(2,args[1]);
			pst.setString(3,args[2]);

			int result = pst.executeUpdate();
			System.out.println(result);
				
			con.close();
		}catch(SQLException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}		
	}
}