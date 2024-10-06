import java.sql.*;

class E{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb?user=root&password=1234");
			
			//String query = "update employees set email=? where emp_id=?";
			
			//unsafe -> prone to SQL-Injection Attack
			//String query = "update employees set email='"+args[0]+"' where emp_id="+args[1];
			PreparedStatement pst = con.prepareStatement(query);

			System.out.println(pst);
			
			//Safety from SQL-Injection
			//pst.setString(1,args[0]);
			//pst.setInt(2,Integer.parseInt(args[1]));
			
			System.out.println(pst);

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}