package com.cricket.role_service.service;


import com.cricket.role_service.entity.RoleEntity;
import com.cricket.role_service.repository.RoleRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    

    public Optional<RoleEntity> findRoleByName(String roleName) {
        return roleRepository.findByRoleName(roleName);
    }

    
    public List<RoleEntity> getAllRoles() {
        return roleRepository.findAll();
    }
    public List<String> getAllRoleNames() {
        return roleRepository.findAll()
                              .stream()
                              .map(RoleEntity::getRoleName)
                              .collect(Collectors.toList());
    }

    
    public void deleteRoleById(String roleId) {
        roleRepository.deleteById(roleId);
    }
}
