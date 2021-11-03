package tasks;
import java.sql.*;
public class Task1
{
	public static void main(String args[])
	{
try
{
        Connection con = null;       
  Class.forName("oracle.jdbc.driver.OracleDriver");
  System.out.println("Driver class loaded");
  con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mulesoft","mulesoft");
  System.out.println("Connection Established");
}
catch(Exception e)
{
	System.out.println(e);
}

	}
}