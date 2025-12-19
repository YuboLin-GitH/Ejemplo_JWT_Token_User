package es.softtek.jwtDemo.repository;

import es.softtek.jwtDemo.dto.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {

/*
    @Query("SELECT u FROM User u WHERE u.user = :user")
    List<User> findUserBynombre(String user);
*/

    @Query(value = "SELECT * FROM apiuser WHERE user = :user AND password = SHA2(:password, 256)", nativeQuery = true)
    User findByCredentials(@Param("user") String user, @Param("password") String password);


    User findByUser(String user);
}
