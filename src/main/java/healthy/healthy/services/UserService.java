package healthy.healthy.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import healthy.healthy.Repository.UserRepository;
import healthy.healthy.model.User;


@Service
public class UserService {

    private final UserRepository userRepository;

    
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    
    public Optional<User> getUserById(UUID id) {
        return userRepository.findById(id);
    }

   
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    
    public void deleteUser(UUID id) {
        userRepository.deleteById(id);
    }

    
}
