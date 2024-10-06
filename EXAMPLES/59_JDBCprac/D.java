import java.sql.*;

class D{
	public static void main(String[] args){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeedb?user=root&password=1234");
			
			String query = "select * from employees";
			PreparedStatement pst = con.prepareStatement(query);

			ResultSet rst = pst.executeQuery();

			System.out.println("Emp.ID\tEmp. Name:\tEmail\tPassword\tAge");
			while(rst.next()){
				System.out.println(rst.getInt(1)+"  "+rst.getString(2)+"  "+rst.getString(3)+"  "+rst.getString(4)+"  "+rst.getInt(5));
			}

			con.close();
		}catch(ClassNotFoundException|SQLException e){
			e.printStackTrace();
		}
	}
}