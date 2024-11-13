package io.mosaed.SpringSecurity.service.dto;

import io.mosaed.SpringSecurity.external.db.entity.Authority;
import org.springframework.security.core.GrantedAuthority;

/**
 * @author MOSAED ALOTAIBI
 */
public class AuthorityDTO implements GrantedAuthority {

    private final Authority authority;

    public AuthorityDTO(Authority authority) {
        this.authority = authority;
    }

    @Override
    public String getAuthority() {
        return authority.getName();
    }
}
