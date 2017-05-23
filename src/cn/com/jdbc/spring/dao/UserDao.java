package cn.com.jdbc.spring.dao;

import java.util.List;

import cn.com.jdbc.spring.modle.User;

public interface UserDao {

    void save(User u);

    void update(User u);

    User getUser(int id);

    List<User> getAllUser();

    void deleteUserById(int id);

}