import java.sql.*;
import java.util.*;
class MyConnect 
{
	static Connection getMyConnection()
	{
		Connection cn=null;
		try 
        {
			Class.forName("com.mysql.cj.jdbc.Driver");

			String dbURL="jdbc:mysql://localhost:3306/sql_jdbc?user=root&password=Pranit.gupta@1234";
			cn = DriverManager.getConnection(dbURL); 
		} 
		catch (Exception e) 
		{
			System.out.println("Error"+e);
			e.printStackTrace();
		}
		
		return cn;
	}

}

public class Employee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
        Statement stmt = null;
		Connection con=null;
		PreparedStatement psmt=null;

		try
		{
            con=MyConnect.getMyConnection();
            System.out.println(con);

            System.out.println("\nCreating table in given database...");
            stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);

            stmt.executeUpdate("CREATE TABLE Employee (ID INTEGER not NULL, Name VARCHAR(255),Salary VARCHAR(255),Phone VARCHAR(255),Allowances INTEGER, PRIMARY KEY ( id ))");
    
            psmt=con.prepareStatement("insert into Employee values(?,?,?,?,?)");

            for (int i = 1; i <=5; i++) 
            {
                System.out.println("\nEnter the "+i+" record in the Employee table\n");
                System.out.print("\nEnter the ID : ");
                int id=in.nextInt();
                System.out.print("\nEnter the Name : ");
                String name=in.next();
                System.out.print("\nEnter the Salary : ");
                int salary=in.nextInt();
                System.out.print("\nEnter the Phone : ");
                String phone=in.next();
                System.out.print("\nEnter the Allowances : ");
                int allowances=in.nextInt();
                
                
                psmt.setInt(1,id);
                psmt.setString(2,name);
                psmt.setInt(3,salary);
                psmt.setString(4,phone);
                psmt.setInt(5,allowances);
                int res=psmt.executeUpdate();

                System.out.println(res+" records inserted"); 
            }

            
            stmt.executeUpdate("UPDATE Employee SET Allowances=(Allowances+10) WHERE Salary>15000;");
           
            ResultSet rs=stmt.executeQuery("SELECT * from Employee WHERE Salary<15000 ORDER BY Id DESC ;");

            System.out.println("\nThe Employee records with salary less than 15000\n");

            System.out.println("ID"+"	"+"Name"+"    "+"Salary"+"     "+"Phone"+"    "+"Allowance");
            while (rs.next()) 
            {
                System.out.println(rs.getInt("ID")+"	"+rs.getString("Name")+"    "+rs.getInt("Salary")+"     "+rs.getString("Phone")+"    "+rs.getInt("Allowances"));
               
            }
        
            con.close();  
		}
		catch(Exception e)		
		{
			e.printStackTrace();
		}

	}

}
