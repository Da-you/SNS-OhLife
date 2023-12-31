package project.ohlife.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.ohlife.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByEmailAndPassword(String email, String password);

  boolean existsByEmail(String email);

  boolean existsByPassword(String password);

  boolean existsByEmailAndPassword(String email, String password);

  boolean existsByPhoneNumber(String phoneNumber);

  User findByEmail(String email);
}
