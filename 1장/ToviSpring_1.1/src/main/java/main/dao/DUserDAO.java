package main.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class DUserDAO extends UserDAO{

    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        // D 사 DB connection 생성코드
        return null;
    }
}
