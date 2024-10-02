package comm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		PrintWriter outWriter = response.getWriter();
		HttpSession session = request.getSession();
		
		String user = request.getParameter("userName");
		session.setAttribute("user", user);
		
		outWriter.println("Welcome to Log in page: "+user);
		outWriter.println("<a href='Welcome'>Click me</a>");
		
	}

}
