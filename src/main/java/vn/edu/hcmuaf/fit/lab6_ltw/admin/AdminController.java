package vn.edu.hcmuaf.fit.lab6_ltw.admin; 


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.lab6_ltw.model.User;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "AdminController", value = "/admin/welcome")
public class AdminController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

        PrintWriter out = response.getWriter();
        out.println("HELLO ADMIN");
        out.println(request.getRequestURI());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {

    }
}
