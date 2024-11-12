package io.mosaed.SpringSecurity.service;

import io.mosaed.SpringSecurity.external.db.repository.UserRepository;
import io.mosaed.SpringSecurity.service.dto.UserDTO;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @author MOSAED ALOTAIBI
 */
@Service
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        var user = userRepository.findUserByUsername(username);

        return user.map(UserDTO::new).orElseThrow(() -> new UsernameNotFoundException("Username not found, username: " + username));
    }
}
