package vn.edu.hcmuaf.fit.lab6_ltw.controller;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import vn.edu.hcmuaf.fit.lab6_ltw.model.Product;
import vn.edu.hcmuaf.fit.lab6_ltw.services.ProductService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "ListProduct", value = "/list_product")
public class ListProduct extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductService productService = new ProductService();
        List<Product> all = null;
        try {
            all = productService.getAll();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        request.setAttribute("data", all);
        request.getRequestDispatcher("list_product.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
