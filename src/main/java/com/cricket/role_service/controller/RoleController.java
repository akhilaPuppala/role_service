package com.cricket.role_service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.role_service.entity.RoleEntity;
import com.cricket.role_service.service.RoleService;
@RestController
@RequestMapping("/api/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

   
    @GetMapping("/")
    public List<RoleEntity> getAllRoles() {
        return roleService.getAllRoles();
    }
    
    @GetMapping("/names")
    public List<String> getAllRoleNames() {
        return roleService.getAllRoleNames();
    }

    

    
    @GetMapping("/{roleName}")
    public RoleEntity getRoleByName(@PathVariable String roleName) {
        return roleService.findRoleByName(roleName)
                .orElseThrow(() -> new RuntimeException("Role not found"));
    }

    
    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable String id) {
        roleService.deleteRoleById(id);
    }
}