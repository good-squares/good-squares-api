package com.goodsquares.goodsquaresapi.app.repository;

import com.goodsquares.goodsquaresapi.app.model.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByUsername(String userName);
}
