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
 * Servlet implementation class Welcome
 */
@WebServlet("/Welcome")
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    		response.setContentType("text/html");

    		PrintWriter outWriter = response.getWriter();
    		HttpSession session = request.getSession();
    		
           	String userName = (String) session.getAttribute("user");
    		
    		
    		outWriter.println("Welcome page: "+userName);
    		outWriter.print("<a href='Welcome'>Click me</a>");
	}

}
