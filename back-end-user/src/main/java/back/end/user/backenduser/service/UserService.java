package back.end.user.backenduser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import back.end.user.backenduser.model.User;
import back.end.user.backenduser.repositories.UserRepository;



@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;


    public User createUser(User user) {
        // Lógica de validação, manipulação dos dados do usuário, etc.
        return userRepository.save(user);
    }

}