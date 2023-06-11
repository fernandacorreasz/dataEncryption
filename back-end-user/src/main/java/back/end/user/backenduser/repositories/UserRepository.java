package back.end.user.backenduser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import back.end.user.backenduser.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
}