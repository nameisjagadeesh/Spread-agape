package com.xworkz.servletCycle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 3, urlPatterns = "/org")
public class OrganizationServlet extends HttpServlet {
	public OrganizationServlet() {
		System.out.println("creted OrganizationServlet");
	}
	@Override
	public void init() throws ServletException {
		System.out.println("running init of OrganizationServlet");
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doget of OrganizationServlet");
		String name=req.getParameter("name");
		String head=req.getParameter("headQuater");
		String member=req.getParameter("members");
		String start=req.getParameter("startedIn");
		String president=req.getParameter("president");
		String chairman=req.getParameter("chairman");
		String countries=req.getParameter("countries");
		String goal=req.getParameter("goal");
		String category=req.getParameter("category");
		String meetings=req.getParameter("meetings");
		String hostCountry=req.getParameter("hostCountry");
		String permanent=req.getParameter("permanentMembers");
		String resolution=req.getParameter("resolution");
		String nextCop=req.getParameter("nextCop");
		String nextHost=req.getParameter("nextHost");
		String loan=req.getParameter("loan");
		String maxMembers=req.getParameter("maxMembers");
		String theme=req.getParameter("theme");
		String ladyPresident=req.getParameter("ladyPresident");
		String emergency=req.getParameter("emergencyMeeting");
		
		System.out.println(name);
		System.out.println(head);
		System.out.println(member);
		System.out.println(start);
		System.out.println(president);
		System.out.println(chairman);
		System.out.println(countries);
		System.out.println(category);
		System.out.println(meetings);
		System.out.println(hostCountry);
		System.out.println(permanent);
		System.out.println(resolution);
		System.out.println(nextCop);
		System.out.println(nextHost);
		System.out.println(loan);
		System.out.println(maxMembers);
		System.out.println(theme);
		System.out.println(ladyPresident);
		System.out.println(emergency);
		System.out.println(goal);
		
		PrintWriter write=resp.getWriter();
		write.print("<html>");
		write.print("<body>");
        write.print("<h1>");
        write.print("<span style='color:blue'>");
		write.print("Orgnanization Name is " + name);
		write.print("<br>");
		write.print("<span style='color:red'>");
		write.print("Orgnanization head is " + head);
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("Orgnanizations members are " + member);
		write.print("<br>");
		write.print("<span style='color:black'>");
		write.print("Orgnanization started in " + start);
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("Organization president is " + president);
		write.print("<br>");
		write.print("<span style='color:black'>");
		write.print("Organization chairman is " + chairman);
		write.print("<br>");
		write.print("<span style='color:yellow'>");
		write.print("Organization countries are " + countries);
		write.print("<br>");
		write.print("<span style='color:red'>");
		write.print("Organization category is " + category);
		write.print("<br>");
		write.print("<span style='color:blue'>");
		write.print("Organization meetings are " + meetings);
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("Organization hostCountry is " + hostCountry);
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("Organization permanentMembers are " + permanent);
		write.print("<br>");
		write.print("<span style='color:blue'>");
		write.print("Organization resolution is " + resolution);
		write.print("<br>");
		write.print("<span style='color:black'>");
		write.print("Organization nextCop in " + nextCop);
		write.print("<br>");
		write.print("<span style='color:pink'>");
		write.print("Organization nextHost is " + nextHost);
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("Organization loan is " + loan);
		write.print("<br>");
		write.print("<span style='color:pink'>");
		write.print("Organization maxMembers is " + maxMembers);
		write.print("<br>");
		write.print("<span style='color:red'>");
		write.print("Organization theme is " + theme);
		write.print("<br>");
		write.print("<span style='color:yellow'>");
		write.print("Organization ladyPresident is " + ladyPresident);
		write.print("<br>");
		write.print("<span style='color:black'>");
		write.print("Organization emergencyMeeting is " + emergency);
		write.print("<br>");
		write.print("<span style='color:pink'>");
		write.print("Organization goal is " + goal);
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");

	}

}
