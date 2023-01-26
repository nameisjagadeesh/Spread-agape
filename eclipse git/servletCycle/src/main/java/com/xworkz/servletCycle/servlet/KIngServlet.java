package com.xworkz.servletCycle.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup = 2, urlPatterns = "/king")
public class KIngServlet extends HttpServlet {

	public KIngServlet() {
		System.out.println("created king");
	}

	@Override
	public void init() throws ServletException {
		System.out.println("created init of king");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String kingName = req.getParameter("name");
		String region = req.getParameter("region");
		String queens = req.getParameter("totalQueens");
		String birth = req.getParameter("birthDate");
		String death = req.getParameter("deathDate");

		System.out.println(kingName);
		System.out.println(region);
		System.out.println(queens);
		System.out.println(birth);
		System.out.println(death);

		PrintWriter write = resp.getWriter();
		write.print("<html>");
		write.print("<body>");
        write.print("<h1>");
        write.print("<span style='color:blue'>");
		write.print("king Name is " + kingName);
		write.print("<br>");
		write.print("<span style='color:red'>");
		write.print("king region is " + region);
		write.print("<br>");
		write.print("<span style='color:orange'>");
		write.print("kings queens are " + queens);
		write.print("<br>");
		write.print("<span style='color:black'>");
		write.print("king birthDate in " + birth);
		write.print("<br>");
		write.print("<span style='color:green'>");
		write.print("king deathDate is in Rs " + death);
		write.print("</body>");
		write.print("</html>");
		resp.setContentType("text/html");

	}

}
