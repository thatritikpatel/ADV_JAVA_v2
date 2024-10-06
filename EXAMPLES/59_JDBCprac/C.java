import java.sql.*;
import java.io.Console;

class C{
	public static void main(String[] args){
		Console c = System.console();
		
		System.out.println("Enter your Name: ");
		String name = c.readLine();

		System.out.println("Enter your age: ");
		int age = Integer.parseInt(c.readLine());

		System.out.println("Enter your Email: ");
		String email = c.readLine();

		System.out.println("Enter your password: ");
		String password = new String(c.readPassword());

		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb?user=root&password=1234");
		
			String query = "insert into employees (password,age,email,emp_nm) value (?,?,?,?)";
			PreparedStatement pst = con.prepareStatement(query);

			pst.setString(1,password);
			pst.setInt(2,age);
			pst.setString(3,email);
			pst.setString(4,name);

			System.out.println(pst.executeUpdate());

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}