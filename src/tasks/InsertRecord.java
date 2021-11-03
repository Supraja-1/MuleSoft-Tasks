package tasks;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class InsertRecord {
	public static void main(String args[])
	{
		try
		{
			Connection con = null;       
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  System.out.println("Driver class loaded");
			  con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mulesoft","mulesoft");
		Statement stmt=con.createStatement();
		String mvname=null;
		String actorname=null;
		String actressname=null;
		int yor;
		String directorname=null;
		System.out.println("Enter Movie name");
		Scanner scan=new Scanner(System.in);
		mvname=scan.next();
		System.out.println("Enter Actor name");
		actorname=scan.next();
		System.out.println("Enter Actress name");
		actressname=scan.next();
		System.out.println("Enter year of release");
		yor=scan.nextInt();
		System.out.println("Enter director name");
		directorname=scan.next();
		String qry="insert into movies values('" +mvname+ "', '" +actorname+ "', '" +actressname+ "', '" +yor+ "','" +directorname+ "')";
		stmt.executeUpdate(qry);
		System.out.println("Record inserted succesfully");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
