package com.eventbook.userservice.service;




import com.eventbook.userservice.domain.models.User;
import com.eventbook.userservice.domain.models.UserDomainService;
import com.eventbook.userservice.infrastructure.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDomainService userDomainService;

    public User createUser(User user) {
        userDomainService.validateUser(user);
        return userRepository.save(user);
    }

    public User getUser(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    // Other service methods as needed
}