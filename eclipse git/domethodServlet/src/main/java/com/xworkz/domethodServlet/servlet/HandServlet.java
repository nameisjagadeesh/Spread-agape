package com.xworkz.domethodServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 4, urlPatterns = "/hand")
public class HandServlet extends HttpServlet {

	public HandServlet() {
		System.out.println("created hand");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running the init");
	}
	
	
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doDelete of hand");
		String info="collection is an interface which is used to group the references ";
		PrintWriter writer=resp.getWriter();
		writer.print(info);
		resp.setContentType("text/plain");
	}

}
