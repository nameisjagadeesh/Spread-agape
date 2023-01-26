package com.xworkz.servletCycle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/web")
public class WebSeriesServlet extends HttpServlet {

	public WebSeriesServlet() {
		System.out.println("created webseries");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("initiating web"); // only once
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget of webSeries");
		String name = req.getParameter("seriesName");
		String lang = req.getParameter("seriesLanguage");
		String episode = req.getParameter("seriesEpisodes");
		String ott = req.getParameter("seriesOtt");
		String budget = req.getParameter("seriesbudget");

		System.out.println("series name is "+name);
		System.out.println("series lang is "+lang);
		System.out.println("series episodes are "+episode);
		System.out.println("series ott name is "+ott);
		System.out.println("series budget is "+budget);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
        write.print("<h1>");
        write.print("<span style='color:blue'>");
		write.print("WebSeries Name is " + name);
		write.print("<br>");
		write.print("<span style='color:red'>");
		write.print("WebSeries language is " + lang);
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("WebSeries episodes are " + episode);
		write.print("<br>");
		write.print("<span style='color:black'>");
		write.print("WebSeries streaming in " + ott);
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("WebSeries budget is in Rs " + budget);
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");

	}

}
