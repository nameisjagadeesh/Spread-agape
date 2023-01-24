package com.xworkz.domethodServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/cloth")
public class ClothServlet extends HttpServlet {

	public ClothServlet() {
		System.out.println("created cloth......");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init in cloth");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doget in cloth");
		String data="getting and displaying from the httpMethods......";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doPost of pen");
		String info = "we wanted to do something ,but bound to to do something";
		PrintWriter writer = resp.getWriter();
		writer.print(info);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("created doPut in chain");
		String data = "love is always loved in the way love wanted to be..........!";
		PrintWriter writer = resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");

	}
	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doDelete of hand");
		String info="collection is an interface which is used to group the references ";
		PrintWriter writer=resp.getWriter();
		writer.print(info);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doTrace(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the dotrace");
		String data="map is a collection which group the references in the form of keys and values";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doOptions(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doOption");
		String data="spring is a framework which is used to manage the beans";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}
	@Override
	protected void doHead(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doOption");
		String data="servlet is an interface n a small java program which runs on web server";
		PrintWriter writer=resp.getWriter();
		writer.print(data);
		resp.setContentType("text/plain");
	}

}
