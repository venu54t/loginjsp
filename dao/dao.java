package dao;

import java.sql.Connection;
import java.sql.DriverManager;


public class dao{

		
		
		
		
		public static Connection getCon()
		{
			
			Connection conn=null;
			
			try
			{
				Class.forName("oracle.jdbc.driver.OracleDriver");
			conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","lee","1234567");
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			
			return conn;
		}
		
		
		
	
}
