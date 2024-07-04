package com.tovi.ToviSpring_15.factory;

import com.tovi.ToviSpring_15.dao.UserDAO;
import com.tovi.ToviSpring_15.maker.NConnectionMaker;
import com.tovi.ToviSpring_15.maker.SimpleConnectionMaker;

public class NDAOFactory {

    public UserDAO createUserDAO() {
        SimpleConnectionMaker connectionMaker = new NConnectionMaker();
        return new UserDAO(connectionMaker);
    }
}
