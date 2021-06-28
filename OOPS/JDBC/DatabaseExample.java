import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
class MyConnect 
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
			String dbURL="jdbc:mysql://localhost:3306/jdbc?user=root&password=pardeep";
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
public class DatabaseExample
{
	public static void main(String arg[])
	{
		//System.out.println(MyConnect.getMyConnection());
		try
		{
		Connection con=MyConnect.getMyConnection();
		System.out.println(con);
		
		/*
		Two Types of Queries - Insert, Update, Delete   2nd type - Select commond
		
		Two Types of statement - Statement , PreparedStatement
		differnece 
		1. con.createStatement() --> Statement
		   con.prepareStatement("Query") ----> PreparedStatement
		2. psmt.setXXX(position of question mark, data type of column);
		3. psmt.execute(), executeQuery(), executeUpdate()
		   stmt.execute("Query"), executeQuery("Query"), executeUpdate("Query")
		   
		   stmt.excuteUpdate("insert into emp1 values("+"'"+id+"','"+name+"')");
		   
		
		
		
		
		
		*/
		int id=Integer.parseInt(arg[0]);
		String name=arg[1];

		PreparedStatement psmt=con.prepareStatement("insert into emp1 values(?,?)");

		psmt.setInt(1,id);
		psmt.setString(2,name);
		int res=psmt.executeUpdate();
		//psmt.setInt(1,i);
		//psmt.setString(2,n);
		int res1=psmt.executeUpdate();
		System.out.println(res+" records affected");  

		Statement stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,  
                     ResultSet.CONCUR_UPDATABLE);
		stmt.executeUpdate("insert into emp1 values("+"'"+id+"','"+name+"')");
		ResultSet rs=stmt.executeQuery("Select * from emp1");
		
		System.out.println("ID		Name");
		//rs.absolute(2);
		while(rs.previous())
		{
			
			System.out.println(rs.getInt(1)+"	"+rs.getString("NAME"));
		}
		con.close();  
		}
		catch(Exception e)		
		{
			e.printStackTrace();
		}
	}
}

