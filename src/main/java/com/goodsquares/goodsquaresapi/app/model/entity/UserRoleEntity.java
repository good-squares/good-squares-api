package com.goodsquares.goodsquaresapi.app.model.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="USER_ROLES")
public class UserRoleEntity {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Getter @Setter
	private Long id;

	@Getter @Setter
	private String name;

	UserRoleEntity() {
	}
}
