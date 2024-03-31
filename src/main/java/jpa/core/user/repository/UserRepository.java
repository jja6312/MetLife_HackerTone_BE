package jpa.core.user.repository;

import java.util.Optional;
import jpa.core.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);

    Optional<User> findById(Long memberId);
}
