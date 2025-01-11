package vn.edu.hcmuaf.fit.lab6_ltw.dao.db;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.jdbi.v3.core.Handle;
import org.jdbi.v3.core.Jdbi;
import vn.edu.hcmuaf.fit.lab6_ltw.dao.ProductDAO;
import vn.edu.hcmuaf.fit.lab6_ltw.model.Product;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBConect {
    static String url = "jdbc:mysql://"+DBProperties.host()+":"+DBProperties.port()+"/"+DBProperties.dbname()+"?"+DBProperties.option();
    static Jdbi jdbi;
    static Connection conn;

    public static Jdbi get() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        if(jdbi==null) makeConnect();
        return jdbi;
    }

    private static void makeConnect() throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        MysqlDataSource src = new MysqlDataSource();
        src.setURL(url);
        src.setUser(DBProperties.username());
        src.setPassword(DBProperties.password());

        src.setUseCompression(true);
        src.setAutoReconnect(true);

        jdbi = jdbi.create(src);
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        Jdbi jdbi = DBConect.get();
//       List<Product> ls = jdbi.withHandle(handle -> {
//            return handle.createQuery("select * from product").mapToBean(Product.class).list();
//        });
//
//       ls.forEach(product -> {
//           System.out.println(product);
//       });
//        Handle handle = jdbi.open();
//        ProductDAO dao = new ProductDAO();
//        List<Product> prList = dao.getAll();
//        for(Product pr : prList) {
//            int updateCount = handle.execute(
//                    "insert into product values"
//                            + "(" + pr.getId() + ", '"+ pr.getTitle() + "'," + pr.getPrice() +", '" + pr.getImg() + "')");
//        }



    }
}
