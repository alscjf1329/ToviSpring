package com.tovi.ToviSpring_15.maker;

import com.tovi.ToviSpring_15.Constant;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements SimpleConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            Constant.getFullAddress(), Constant.MYSQL_USER.getContent(), null);
    }
}
