
package pe.cibertec.ecommerce.ApiAuth.Dto;

import java.util.Set;
import lombok.Data;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;

@Data
public class SignUpDto {
    private String name;
    private String username;
    private String email;
    private String password;
    private Set<Role> roles;
}
