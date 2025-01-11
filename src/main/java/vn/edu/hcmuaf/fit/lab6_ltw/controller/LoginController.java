package vn.edu.hcmuaf.fit.lab6_ltw.controller;


import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.lab6_ltw.model.User;
import vn.edu.hcmuaf.fit.lab6_ltw.services.AuthService;

import java.io.IOException;
import java.sql.SQLException;

@WebServlet(name = "LoginController", value = "/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException  {
       String uname = request.getParameter("username")
               ;
       String pass = request.getParameter("password");
        AuthService service = new AuthService();

        User user = null;
        try {
            user = service.checkLogin(uname, pass);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        if(user!=null){
            HttpSession session = request.getSession(true);
            session.setAttribute("auth", user);
            response.sendRedirect("index.jsp");
        }else{
            request.setAttribute("error", "Đăng nhập không thành công");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
