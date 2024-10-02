package cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.Cookie;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		
		Cookie UserNamecookie = new Cookie("userName", userName);
		Cookie upCookie = new Cookie("password", password);
		UserNamecookie.setMaxAge(20);
		upCookie.setMaxAge(20);
		
		response.addCookie(UserNamecookie);
		response.addCookie(upCookie);
		
		PrintWriter out = response.getWriter();
		out.print("Welcome to log in page <br>");
		out.print("<a href='welcome'>click me</a>");
				
	}

}
