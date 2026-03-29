package khanh.ntu.SpringBoot.Repos;

import org.springframework.data.jpa.repository.JpaRepository;

import khanh.ntu.SpringBoot.Model.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
