package com.xworkz.firstServer.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 7, urlPatterns = "/blanket")
public class BlanketServlet extends HttpServlet {
	public BlanketServlet() {
		System.out.println("running the blanket");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doGet in blanket");

	}

}
