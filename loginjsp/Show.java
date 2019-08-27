package loginjsp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.dao;

public class Show {
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException, ClassNotFoundException, SQLException
	{
	
	PrintWriter pw=res.getWriter();
	Connection con=dao.getCon();
	
	}
}

