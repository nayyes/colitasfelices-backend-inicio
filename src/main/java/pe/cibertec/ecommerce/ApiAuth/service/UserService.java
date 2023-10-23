package pe.cibertec.ecommerce.ApiAuth.service;

import pe.cibertec.ecommerce.ApiAuth.entity.User;

public interface UserService {
    User findByEmail(String email);
    User add(User user);
    User login(User user);
}
