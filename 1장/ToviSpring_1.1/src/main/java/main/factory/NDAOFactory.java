package main.factory;

import main.dao.UserDAO;
import main.maker.NConnectionMaker;
import main.maker.SimpleConnectionMaker;

public class NDAOFactory {

    public UserDAO createUserDAO() {
        SimpleConnectionMaker connectionMaker = new NConnectionMaker();
        return new UserDAO(connectionMaker);
    }
}
