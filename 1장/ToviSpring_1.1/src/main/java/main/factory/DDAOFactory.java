package main.factory;

import main.dao.UserDAO;
import main.maker.DConnectionMaker;
import main.maker.SimpleConnectionMaker;

public class DDAOFactory {

    public UserDAO createUserDAO() {
        SimpleConnectionMaker connectionMaker = new DConnectionMaker();
        return new UserDAO(connectionMaker);
    }
}
