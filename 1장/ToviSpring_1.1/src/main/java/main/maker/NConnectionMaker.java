package main.maker;

import java.sql.Connection;
import java.sql.SQLException;

public class NConnectionMaker implements SimpleConnectionMaker {

    @Override
    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        // D 사의 독자적인 방법으로 Connection을 생성하는 코드
        return null;
    }
}
