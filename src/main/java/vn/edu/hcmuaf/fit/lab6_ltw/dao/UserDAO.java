package vn.edu.hcmuaf.fit.lab6_ltw.dao;

import org.jdbi.v3.core.Jdbi;
import vn.edu.hcmuaf.fit.lab6_ltw.dao.db.DBConect;
import vn.edu.hcmuaf.fit.lab6_ltw.model.User;

import java.sql.SQLException;

public class UserDAO {
    public User findByUserName(String Username) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        return DBConect.get().withHandle(handle -> handle.createQuery("select * from user where username=:username").
                bind("username", Username).mapToBean(User.class).findFirst().orElse(null));
    }
}
