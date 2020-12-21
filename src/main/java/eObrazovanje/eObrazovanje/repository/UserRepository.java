package eObrazovanje.eObrazovanje.repository;

import eObrazovanje.eObrazovanje.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
}
