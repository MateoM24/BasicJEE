import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//1. extends javax.servlet.http.HttpServlet
//2. @WebServlet(urlPatterns = "/login.do")
//3. doGet(HttpServletRequest request, HttpServletResponse response)
//4. How is the response created?

@WebServlet(urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");
        request.setAttribute("name",name);
        System.out.println(name);
        System.out.println(request.getAttribute("name"));
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);

        /*PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<title>To jest servlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("My First Servlet");
        out.println("</body>");
        out.println("</html>");*/
    }

}