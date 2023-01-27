package com.xworkz.conditionServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 1, urlPatterns = "/location")
public class LocationServlet extends HttpServlet {
	public LocationServlet() {
		System.out.println("created location");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init of location");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running the doget of location");
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String start = req.getParameter("start");
		String dest = req.getParameter("destination");
		String gender = req.getParameter("gender");

		System.out.println(name);
		System.out.println(email);
		System.out.println(start);
		System.out.println(dest);
		System.out.println(gender);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		if (name.length() > 3) {
			write.print("<span style='color:blue'>");
			write.print("contact Name is " + name);
		} else {
			write.print("<span style='color:red'>");
			write.print("contact Name is invalid ");
		}
		write.print("<br>");
		if (email.length() > 9) {
			write.print("<span style='color:red'>");
			write.print("email1 is " + email);
		} else {
			write.print("<span style='color:red'>");
			write.print("email1 is invalid ");
		}
		write.print("<br>");
		if (start.length() > 5) {
			write.print("<span style='color:orange'>");
			write.print("started in " + start);
		} else {
			write.print("<span style='color:red'>");
			write.print("started in is invalid ");
		}

		write.print("<br>");
		if (dest.length() > 4) {
			write.print("<span style='color:black'>");
			write.print("destination is " + dest);
		} else {
			write.print("<span style='color:red'>");
			write.print("destination is invalid " + dest);
		}
		write.print("<br>");
		if (gender.length() > 3) {
			write.print("<span style='color:green'>");
			write.print("gender is " + gender);
		} else {
			write.print("<span style='color:red'>");
			write.print("gender is invalid" + gender);
		}
		write.print("<br>");
		write.print("<a href=\"location.html\">Go back to Location details</a>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}

}
