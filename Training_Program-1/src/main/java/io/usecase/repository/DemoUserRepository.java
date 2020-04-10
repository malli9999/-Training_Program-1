package io.usecase.repository;
import io.usecase.model.*;
import org.springframework.data.jpa.repository.JpaRepository;


public interface DemoUserRepository extends JpaRepository<DemoUser,Integer> {
    DemoUser findByUserName(String username);
}