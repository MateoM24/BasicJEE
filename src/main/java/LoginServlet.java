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
        String param1 = request.getParameter("param1");
        request.setAttribute("param1",param1);
        System.out.println(param1);
        System.out.println(request.getAttribute("param1"));
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request,response);
        // how regular servlet would looks like:
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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("name");
        String password=req.getParameter("password");
        boolean isValid=UserValidation.isValid(name,password);
        if(isValid) {
            req.setAttribute("name", name);
            req.setAttribute("password", password);
            req.getRequestDispatcher("welcome.jsp").forward(req, resp);
        }else{
            req.setAttribute("errorMessage","invalid credentials! :(");
            req.getRequestDispatcher("/WEB-INF/login.jsp").forward(req, resp);
        }
    }
}