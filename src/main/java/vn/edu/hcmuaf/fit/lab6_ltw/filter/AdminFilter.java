package vn.edu.hcmuaf.fit.lab6_ltw.filter;


import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import vn.edu.hcmuaf.fit.lab6_ltw.model.User;

import java.io.IOException;

@WebFilter(filterName = "AdminFilter", urlPatterns = "/admin/*")
public class AdminFilter implements Filter {

    @Override
    public void init(FilterConfig config) throws ServletException {
        // Khởi tạo filter nếu cần
    }

    @Override
    public void destroy() {
        // Dọn dẹp tài nguyên nếu cần
    }

    @Override
    public void doFilter(ServletRequest re, ServletResponse res, FilterChain chain)
            throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) re;
        HttpServletResponse response = (HttpServletResponse) res;
        HttpSession session = request.getSession(true);
        User u = (User) session.getAttribute("auth") ;
        System.out.println(u);
        if(u==null || u.getRoleID()<1){
            response.sendRedirect("../login.jsp");
            return;
        }
        chain.doFilter(request,response);
    }
}
