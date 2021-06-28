import java.sql.*;
import java.util.*;
class MyConnect1
{
	static Connection getMyConnection()
	{
		Connection cn=null;
		try {
			//Type 1- JDBC ODBC Bridge
			/*Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			 // or
			DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
			Connection con = DriverManager.getConnection("jdbc:odbc:MyLogin", "", ""); */

			//Type 4 - for MySql
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
			String dbURL="jdbc:mysql://localhost:3306/Employee?user=root&password=Pranit.gupta@1234";
			cn = DriverManager.getConnection(dbURL); 

			
			//Type 4- Thin driver with Oracle
			/*DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
			String dbURL = "jdbc:oracle:thin:@localhost:1521:XE";
			String username = "upes";
			String password = "upes123";
			cn = DriverManager.getConnection(dbURL, username, password);*/
      			
		} 
		catch (Exception e) 
		{
			System.out.println("Error"+e);
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return cn;
	}

}
public class EmployeeInsertion {
	public static void main(String[] args) throws Exception {
		try
		{
			Connection con=MyConnect1.getMyConnection();
			System.out.println(con);
			
			PreparedStatement psmt=con.prepareStatement("insert into employee values(?,?,?,?,?)");
			
			Scanner scanner = new Scanner(System.in);
			for(int i=0; i<=5; i++)
			{
				System.out.println("Enter details of employee "+1+i);
				
				System.out.println("Enter Employee Id: ");
				int dno = scanner.nextInt();
				
				System.out.println("Enter Employee Name: ");
				String dname = scanner.next();
				
				System.out.println("Enter Employee Salary: ");
				float salary = scanner.nextFloat();
				
				System.out.println("Enter employee Phone Number: ");
				int dpn = scanner.nextInt();
				
				System.out.println("Enter Allowance to Employee :");
				int alw = scanner.nextInt();
				
				psmt.setInt(1,dno);
				psmt.setString(2,dname);
				psmt.setFloat(3, salary);
				psmt.setInt(4, dpn);
				psmt.setInt(5, alw);
				psmt.executeUpdate();
				System.out.println(+i+ "Record Inserted");
			}
			psmt.close();
			
			Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
					ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs = stmt.executeQuery("select * from Employee");
			if(rs.isAfterLast())
			{
				System.out.println("Cursor is after last row");
			}
			while(rs.previous())
			{
				System.out.println("id "+rs.getInt(1)+ " name "+rs.getString(2)+ " Salary "+rs.getFloat(3)+ " Phone "+rs.getInt(4)+ " Allowance "+rs.getInt(5));
			}
			
			con.close();
		}
			
		catch(Exception e)		
		{
			e.printStackTrace();
		}
		
	}
}



