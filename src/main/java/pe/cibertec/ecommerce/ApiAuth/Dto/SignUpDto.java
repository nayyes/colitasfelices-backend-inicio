
package pe.cibertec.ecommerce.ApiAuth.Dto;

import java.util.Set;
import lombok.Data;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;

@Data
public class SignUpDto {
    private String nombre;
    private String email;
    private String password;
    private Set<Role> roles;
    private String sexo;
    private String fechaNacimiento;
    private Integer cantidadMascota;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String telefono;
    private String distrito;
    private String provincia;
    private String departamento;
    private String pais;
}
