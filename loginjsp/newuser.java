package loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dao;

public class newuser extends HttpServlet {

	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
	    PrintWriter pw=res.getWriter();
		String username=req.getParameter("username1");
		String pass1=req.getParameter("pass1");
		String pass2=req.getParameter("pass2");
		
		Connection con=dao.getCon();
		if(pass1.equals(pass2))
		{
		    try {
		    Statement st=con.createStatement();
		    ResultSet rs=st.executeQuery("insert into register1 values('"+username+"','"+pass1+"')");
		    pw.println("<font color=green>registered successfully</font>");
		    
		    }
		    catch(Exception e)
		    {
			
		    }
	   }
		else
			pw.println("<font color=red >password not matching!!!!!    unsuccessful</font>");
		
	}
	
}
