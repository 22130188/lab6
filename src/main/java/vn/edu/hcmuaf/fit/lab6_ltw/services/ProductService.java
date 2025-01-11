package vn.edu.hcmuaf.fit.lab6_ltw.services;

import vn.edu.hcmuaf.fit.lab6_ltw.dao.ProductDAO;
import vn.edu.hcmuaf.fit.lab6_ltw.model.Product;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    static ProductDAO productDao= new ProductDAO();

    public List<Product> getAll() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        return productDao.getAll();
    }

    public Product getDetail(String in) {
        try {
            int id = Integer.parseInt(in);
            return productDao.getById(id);

        }catch (NumberFormatException | SQLException | ClassNotFoundException | InstantiationException |
                IllegalAccessException e){
            return null;
        }
    }

}
