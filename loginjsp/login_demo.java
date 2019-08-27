package loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dao;

public class login_demo extends HttpServlet{

	
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter pw=res.getWriter();
		
		String username=req.getParameter("username");
		String pass=req.getParameter("pass");
		Connection con=dao.getCon();
		ResultSet rs=null;
		try {
		PreparedStatement st=con.prepareStatement("select username,pass from register1 where username=? and pass=?");
	    st.setString(1, username);
	    st.setString(2,pass);
		rs=st.executeQuery();
		
		if(rs.next())
		{
			RequestDispatcher rd=req.getRequestDispatcher("/welcome.jsp");
		    rd.forward(req,res);
		
		}
		else
		{
			pw.println("<font color='red'>Login failed</font>");
			RequestDispatcher rd=req.getRequestDispatcher("/login.jsp");
		    rd.include(req, res);
		}
		
		
		
		
		
		}
		catch(Exception e)
		{
			
		}
	
}
}
