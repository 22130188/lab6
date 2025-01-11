package vn.edu.hcmuaf.fit.lab6_ltw.services;

import vn.edu.hcmuaf.fit.lab6_ltw.dao.UserDAO;
import vn.edu.hcmuaf.fit.lab6_ltw.model.User;

import java.sql.SQLException;

public class AuthService {

    public  User checkLogin(String uname, String pass) throws SQLException, ClassNotFoundException, InstantiationException, IllegalAccessException {
        UserDAO usDao = new UserDAO();
        User u = usDao.findByUserName(uname);
        System.out.println(u);
        if(u!=null && pass!=null && pass.equals(u.getPassword())){
            u.setPassword(null);
            return u;
        }


        return null;
    }


}
