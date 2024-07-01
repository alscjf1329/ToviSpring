package main.dao;

import java.sql.Connection;
import java.sql.SQLException;

public class NUserDAO extends UserDAO {

    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        // N 사 DB connection 생성코드
        return null;
    }
}
