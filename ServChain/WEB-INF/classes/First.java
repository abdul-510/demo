import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class First extends HttpServlet {

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// res.sendRedirect("2?key=Hello World from goFurther method");
		// PrintWriter out = res.getWriter();
		// res.setContentType("text/html");
		// out.println("<html><body><h1>Output generated by First servlet.</h1>");
		goFurther(req, res);
		// String value = "Hello World from servlet first";
		// req.setAttribute("key", value);

		// ServletContext sc = getServletContext();
		// RequestDispatcher rd = req.getRequestDispatcher("/2");
		// rd.forward(req, res);

		// out.println("<h1>End of First </h1></body></html>");
	}

	void goFurther(HttpServletRequest req, HttpServletResponse res)
			throws ServletException, IOException {

		// out.println("<h3>Output from goFurther method</h3>");
		// String value = "Hello World from goFurther method";

		// req.setAttribute("key", value);
		res.sendRedirect("2?key=Hello World from goFurther method");

		// res.sendError(404);
		// RequestDispatcher rd = req.getRequestDispatcher("firstInclude");
		// rd.include(req, res);
	}
}
