package tasks;


import java.sql.*;

public class SelectAll
{
	public static void main(String args[])
	{
		try
		{
			Connection con = null;       
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			 con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mulesoft","mulesoft");
			Statement stmt = con.createStatement();
				String q1 = "select * from movies";
			ResultSet rs = stmt.executeQuery(q1);
			while(rs.next())
			{
				System.out.println("Movie Name : " + rs.getString(1));
				System.out.println("Actor Name :" + rs.getString(2));
				System.out.println("Actress Name :" + rs.getString(3));
				System.out.println("Year Of Birth:"+rs.getString(4));
				System.out.println("Director Name:"+rs.getString(5));
				System.out.println("*******************************");
				
			}
			
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

