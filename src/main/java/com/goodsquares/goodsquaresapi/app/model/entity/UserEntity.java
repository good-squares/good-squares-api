package com.goodsquares.goodsquaresapi.app.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "base_user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter @Setter
    private Long id;

    @Getter @Setter
    private String username;

    @Getter @Setter
    private String password;

    @OneToMany(fetch = FetchType.EAGER, cascade=CascadeType.ALL)
    @Getter @Setter
    private List<UserRoleEntity> roles;

    UserEntity() {
    }

    public UserEntity(String username, String password, List<UserRoleEntity> roles) {
        this.username = username;
        this.password = password;
        this.roles = roles;
    }
}