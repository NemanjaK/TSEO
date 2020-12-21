package eObrazovanje.eObrazovanje.service;

import eObrazovanje.eObrazovanje.entity.User;
import eObrazovanje.eObrazovanje.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService implements UserServiceInterface{

    @Autowired
    UserRepository userRepository;

    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }

    @Override
    public User findOne(Long user_id) {
        return userRepository.findById(user_id).get();
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void remove(Long user_id) {
        userRepository.deleteById(user_id);
    }
}
