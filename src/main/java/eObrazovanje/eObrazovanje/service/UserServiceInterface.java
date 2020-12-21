package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.User;

import java.util.List;

public interface UserServiceInterface {

    User findOne(Long user_id);
    List<User> findAll();
    User save(User user);
    void remove(Long user_id);
}
