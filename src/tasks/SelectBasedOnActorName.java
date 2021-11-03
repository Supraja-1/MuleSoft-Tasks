package tasks;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class SelectBasedOnActorName
{
	public static void main(String args[])
	{
		try
		{
			Connection con = null;       
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  System.out.println("Driver class loaded");
			  con =  DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","mulesoft","mulesoft");
			  Scanner sc=new Scanner(System.in);
				String qry="select * from movies where actorname=?";
				PreparedStatement stmt = con.prepareStatement(qry);
				System.out.println("Enter the actor name");
				String actorname=sc.next().toLowerCase();
					stmt.setString(1, actorname);
				      ResultSet rs = stmt.executeQuery();
				      System.out.println("Moviename  ActorName ActressName Releasedyear DirectorName");
				      
			      while(rs.next()) {
			         System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5));

			      }
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		}
	
}

