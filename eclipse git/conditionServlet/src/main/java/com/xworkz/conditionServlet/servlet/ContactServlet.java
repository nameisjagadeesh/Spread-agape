package com.xworkz.conditionServlet.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/contact")
public class ContactServlet extends HttpServlet {

	public ContactServlet() {
		System.out.println("created contact");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("running init of contact");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running doGet of contact");
		String name1 = req.getParameter("userName");
		String email1 = req.getParameter("userEmail");
		String mobile = req.getParameter("mobile");
		Long convetedMobile = Long.parseLong(mobile);
		String comments = req.getParameter("comments");

		System.out.println(name1);
		System.out.println(email1);
		System.out.println(mobile);
		System.out.println(comments);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
		write.print("<h1>");
		if (name1.length() > 3) {
			write.print("<span style='color:blue'>");
			write.print("contact Name is " + name1);
		} else {
			write.print("<span style='color:red'>");
			write.print("contact Name is invalid ");
		}

		write.print("<br>");
		if (email1.length() > 6) {
			write.print("<span style='color:red'>");
			write.print("email1 is " + email1);
		} else {
			write.print("<span style='color:red'>");
			write.print("email1 is invalid ");
		}
		write.print("<br>");
		if (convetedMobile > 100000) {
			write.print("<span style='color:orange'>");
			write.print("mobile number is  " + mobile);
		} else {
			write.print("<span style='color:red'>");
			write.print("mobile number is Invalid ");

		}

		write.print("<br>");
		if (comments.length() > 10) {
			write.print("<span style='color:redS'>");
			write.print("comments are " + comments);
		} else {
			write.print("<span style='color:black'>");
			write.print("comments are invalid");
		}
		write.print("<br>");
		write.print("<a href=\"contact.html\">Go back to Location details</a>");
		write.print("</h1>");
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");
	}

}
