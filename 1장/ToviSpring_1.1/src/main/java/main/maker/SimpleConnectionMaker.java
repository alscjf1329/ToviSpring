package main.maker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import main.Constant;

public class SimpleConnectionMaker {

    public Connection makeNewConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(
            Constant.getFullAddress(), Constant.MYSQL_USER.getContent(), null);
    }
}
