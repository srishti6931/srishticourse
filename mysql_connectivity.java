package srishti_mysql;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class mysql_connectivity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Found");
		Connection connection=DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/srishti","root","root");
		System.out.println("Connection success");
		Statement statement=connection.createStatement();
		ResultSet rs=statement.executeQuery("SELECT * FROM srishti.user");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
