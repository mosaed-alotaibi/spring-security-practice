package io.mosaed.SpringSecurity.external.db.repository;

import io.mosaed.SpringSecurity.external.db.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigInteger;
import java.util.Optional;

/**
 * @author MOSAED ALOTAIBI
 */
public interface UserRepository extends JpaRepository<User, BigInteger> {

    Optional<User> findUserByUsername(String username);
}
