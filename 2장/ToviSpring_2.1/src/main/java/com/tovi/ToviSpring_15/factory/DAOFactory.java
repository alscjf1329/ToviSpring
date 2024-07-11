package com.tovi.ToviSpring_15.factory;


import com.tovi.ToviSpring_15.dao.UserDAO;
import com.tovi.ToviSpring_15.maker.DConnectionMaker;
import com.tovi.ToviSpring_15.maker.SimpleConnectionMaker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DAOFactory {

    @Bean
    public UserDAO createUserDAO() {
        SimpleConnectionMaker connectionMaker = new DConnectionMaker();
        return new UserDAO(connectionMaker);
    }

    @Bean
    public SimpleConnectionMaker createConnectionMaker() {
        return new DConnectionMaker();
    }


}
