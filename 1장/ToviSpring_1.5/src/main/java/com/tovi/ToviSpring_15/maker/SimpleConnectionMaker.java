package com.tovi.ToviSpring_15.maker;

import java.sql.Connection;
import java.sql.SQLException;

public interface SimpleConnectionMaker {

    Connection makeConnection() throws ClassNotFoundException, SQLException;
}
