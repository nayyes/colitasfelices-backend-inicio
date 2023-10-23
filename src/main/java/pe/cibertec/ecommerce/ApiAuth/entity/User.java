
package pe.cibertec.ecommerce.ApiAuth.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import java.util.Set;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy 
            = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String username;
    private String email;
    private String password;
    @ManyToMany
    @JoinTable(name = "User_Role",
            joinColumns =
           @JoinColumn(name="user_id",
            referencedColumnName = "id"),
            inverseJoinColumns = 
            @JoinColumn(name="role_id",
             referencedColumnName = "id"))
    private Set<Role> roles;
    
}
