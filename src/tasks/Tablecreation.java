package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Tablecreation {

	public static void main(String args[])
	{
		try
		{
			Connection con = null;       
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  System.out.println("Driver class loaded");
			  con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mulesoft","mulesoft");
		Statement stmt=con.createStatement();
		String qry="create table movies(moviename varchar(200),actorname varchar(200),actress varchar(200),yor varchar(20),directorname varchar(200))";
		stmt.executeUpdate(qry);
		System.out.println("Movies table created successfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
