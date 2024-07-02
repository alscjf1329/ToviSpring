package main;

import java.sql.SQLException;
import main.dto.User;
import main.dao.UserDAO;
import main.maker.DConnectionMaker;
import main.maker.NConnectionMaker;

public class Main {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DConnectionMaker dConnectionMaker = new DConnectionMaker();
        NConnectionMaker nConnectionMaker = new NConnectionMaker();

        UserDAO userDAO = new UserDAO(dConnectionMaker);

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