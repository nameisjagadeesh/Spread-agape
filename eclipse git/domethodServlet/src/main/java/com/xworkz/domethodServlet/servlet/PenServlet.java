package com.xworkz.domethodServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/pen")
public class PenServlet extends HttpServlet {
	public PenServlet() {
		System.out.println("created pen");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running the init of pen");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doPost of pen");
		String info = "we wanted to do something ,but bound to to do something";
		PrintWriter writer = resp.getWriter();
		writer.print(info);
		resp.setContentType("text/plain");
	}

}
