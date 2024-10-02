package comm;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/User")
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String userName = request.getParameter("userName");
		out.println("Submitted Username: "+userName);
		
		//Using hiddenForm field to maintain session
		out.println("<form action='hiddenform' method='get'>");
		out.println("<input type='hidden' name='userName' value='"+userName+"'><br>");
		out.println("<input type='submit' value='submit'>");
		out.println("</form>");
		out.close();
		
	
	}

}
