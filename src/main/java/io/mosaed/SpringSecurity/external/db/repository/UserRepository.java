package io.mosaed.SpringSecurity.external.db.repository;

import io.mosaed.SpringSecurity.external.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.math.BigInteger;
import java.util.Optional;

/**
 * @author MOSAED ALOTAIBI
 */
public interface UserRepository extends JpaRepository<User, BigInteger> {

    @Query("""
            SELECT u FROM User u WHERE u.username = :username
            """)
    Optional<User> findUserByUsername(String username);
}
