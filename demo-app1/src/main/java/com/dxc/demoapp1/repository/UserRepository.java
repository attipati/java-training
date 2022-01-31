package com.dxc.demoapp1.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.dxc.demoapp1.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
    
}
