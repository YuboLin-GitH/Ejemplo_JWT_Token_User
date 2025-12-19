package es.softtek.jwtDemo.service;

import es.softtek.jwtDemo.dto.User;
import es.softtek.jwtDemo.repository.UserRepository;

public class UserServices {
    private final UserRepository userRepository;

    public UserServices(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    public User saveUser (User user) {
        return userRepository.save(user);
    }
}
