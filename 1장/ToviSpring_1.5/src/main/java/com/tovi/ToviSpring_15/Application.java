//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.tovi.ToviSpring_15;

import com.tovi.ToviSpring_15.dao.UserDAO;
import com.tovi.ToviSpring_15.dto.User;
import com.tovi.ToviSpring_15.factory.DAOFactory;
import java.sql.SQLException;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public Application() {
    }

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(DAOFactory.class);

        UserDAO userDAO = applicationContext.getBean("createUserDAO", UserDAO.class);

        User user = new User();
        user.setId("sheepduck");
        user.setName("양두배");
        user.setPassword("single");
        userDAO.add(user);
        System.out.println(user);
        System.out.println("등록 성공");
        User user1 = userDAO.get(user.getId());
        System.out.println(user1);
        System.out.println("조회 성공");
    }
}
