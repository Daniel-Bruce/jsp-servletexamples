package cookies;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Welcome
 */
@WebServlet("/welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");

		
		PrintWriter out = response.getWriter();
		Cookie[] cookie = request.getCookies();
		
		
		out.println("Welcome page<br>");
		out.println("Username from cookies:"+cookie[0].getValue() + "<br>");
		out.println("password from cookies:"+cookie[1].getValue() + "<br>");
		out.println("<a href='welcome'>click me</a>");
		

        		
	}

}
