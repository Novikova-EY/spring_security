package ru.novikova.hibernate_springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.novikova.hibernate_springboot.entities.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByLogin(String login);
}
