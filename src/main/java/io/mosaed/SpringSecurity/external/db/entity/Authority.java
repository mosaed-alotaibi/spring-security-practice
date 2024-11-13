package io.mosaed.SpringSecurity.external.db.entity;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Set;

/**
 * @author MOSAED ALOTAIBI
 */

@Entity
public class Authority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private BigInteger id;

    private String name;

    @ManyToMany(mappedBy = "authorities")
    private Set<User> users;

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
