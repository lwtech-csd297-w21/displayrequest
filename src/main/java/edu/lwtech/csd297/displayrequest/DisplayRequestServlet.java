package edu.lwtech.csd297.displayrequest;

import java.io.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// Display Request Servlet -
//      http://<server>:8080/displayrequest/servlet
//
// <Your Name>
// LWTech CSD297

@WebServlet(name = "displayrequest", urlPatterns = {"/servlet"}, loadOnStartup = 0)
public class DisplayRequestServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;        // Unused

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {

        // Extract the information needed from the request object here...

        try (ServletOutputStream out = response.getOutputStream()) {
            
            //...and send it out as part of an HTML page here...
            out.println("<html><body>Replace this with the correct println() statements...</body></html>");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
