package loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dao;



public class books extends HttpServlet{
  
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		String b=req.getParameter("b");
		if(b.equals("true"))
		{
		try
		{
		Connection con=dao.getCon();
		
		
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from emp");
		
		while(rs.next())
		{
			pw.println(rs.getString(2)+"  "+rs.getString(3) + " <br>");
		}
		
		}
		catch(Exception e)
		{
			
		}
		
		}
		
	}
	}

