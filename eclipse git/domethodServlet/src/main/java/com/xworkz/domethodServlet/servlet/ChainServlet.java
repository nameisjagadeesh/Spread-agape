package com.xworkz.domethodServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/chain")
public class ChainServlet extends HttpServlet {

	public ChainServlet() {
		System.out.println("created chain");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init in chain");

	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created doPut in chain");
		String data = "love is always loved in the way love wanted to be..........!";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}

}
