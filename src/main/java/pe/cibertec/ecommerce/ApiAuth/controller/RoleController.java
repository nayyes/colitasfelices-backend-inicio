package pe.cibertec.ecommerce.ApiAuth.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.cibertec.ecommerce.ApiAuth.entity.Role;
import pe.cibertec.ecommerce.ApiAuth.service.RoleService;

@RestController
@RequestMapping("api/v1/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @GetMapping
    public List<Role> findAll(){
        return roleService.findAll();
    }
    @GetMapping("{id}")
    public Role findByName(@PathVariable String name){
        return roleService.findByName(name);
    }
    @PostMapping
    public Role add(@RequestBody Role role){
        return roleService.add(role);
    }
     
}
