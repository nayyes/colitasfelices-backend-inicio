package pe.cibertec.ecommerce.ApiAuth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.cibertec.ecommerce.ApiAuth.dao.UserRepository;
import pe.cibertec.ecommerce.ApiAuth.entity.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
    @Override
    public User add(User user) {
        return userRepository.save(user);
    }
    @Override
    public User login(User user) {
        return userRepository.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }
    
}
