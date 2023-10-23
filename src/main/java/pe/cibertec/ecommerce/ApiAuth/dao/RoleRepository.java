package pe.cibertec.ecommerce.ApiAuth.dao;

import org.springframework.data.repository.CrudRepository;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;

public interface RoleRepository extends
        CrudRepository<Role, Long> {
    Role findByName(String name);
}
