import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class A{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb?user=root&password=1234");
			
			String query = "insert into employees (emp_nm,email,password) value ('mohan','mohan@gmail.com','1234')";
			PreparedStatement pst = con.prepareStatement(query);

			int rowCount = pst.executeUpdate();

			System.out.println(rowCount);
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}catch(SQLException e){
			e.printStackTrace();
		}
	}
}