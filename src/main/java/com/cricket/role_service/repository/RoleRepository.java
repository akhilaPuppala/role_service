package com.cricket.role_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cricket.role_service.entity.RoleEntity;
@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, String> {

	Optional<RoleEntity> findByRoleName(String roleName);
    
    
  
}
