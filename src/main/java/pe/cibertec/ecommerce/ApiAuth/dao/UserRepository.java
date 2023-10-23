package pe.cibertec.ecommerce.ApiAuth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.cibertec.ecommerce.ApiAuth.entity.User;

public interface UserRepository 
        extends JpaRepository<User, Long> {
    
    User findByEmail(String email);
    
    User findByEmailAndPassword(String email, String password);
}
