package com.goodsquares.goodsquaresapi.auth;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.goodsquares.goodsquaresapi.app.model.entity.UserEntity;
import com.goodsquares.goodsquaresapi.app.model.entity.UserRoleEntity;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class SquareUserDetails implements UserDetails {

	private static final long serialVersionUID = 1L;
	@Getter @Setter
	private Collection<? extends GrantedAuthority> authorities;

	@Getter @Setter
	private String password;

	@Getter @Setter
	private String username;

	public SquareUserDetails(UserEntity user) {
		this.username = user.getUsername(); 
		this.password = user.getPassword(); 
		this.authorities = translate(user.getRoles()); 
	} 

	private Collection<? extends GrantedAuthority> translate(List<UserRoleEntity> roles) {
		List<GrantedAuthority> authorities = new ArrayList<>(); 
		for (UserRoleEntity role : roles) {
			String name = role.getName().toUpperCase(); 
			if (!name.startsWith("ROLE_")) { 
				name = "ROLE_" + name; 
			} 
			authorities.add(new SimpleGrantedAuthority(name)); 
		} 
		return authorities; 
	}

	@Override 
	public boolean isAccountNonExpired() { 
		return true; 
	} 

	@Override 
	public boolean isAccountNonLocked() { 
		return true; 
	} 

	@Override 
	public boolean isCredentialsNonExpired() { 
		return true; 
	} 

	@Override 
	public boolean isEnabled() { 
		return true; 
	} 
	
}
