import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.*;

public class Second extends HttpServlet {
  public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
    // String key = (String) req.getAttribute("key");
    String key = req.getParameter("key");
    String name = req.getParameter("fname");

    PrintWriter out = res.getWriter();
    res.setContentType("text/html");

    out.println("<html><body>Output generated by second servlet. <br>");
    out.println("Name obtained from HTML is <b>" + name + "</b><br>");
    out.println("Name obtained from first servlet is <b>" + key + "</b><br><body></html>");

    // RequestDispatcher rd = req.getRequestDispatcher("firstInclude");
    // rd.include(req, res);
  }
}
