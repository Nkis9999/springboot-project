package com.course.model;

import jakarta.persistence.Entity;
import lombok.Data;
import jakarta.persistence.*;

@Entity
@Table(name="users")
@Data
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String username;
	
	private String password;
	
	private String email;
	
}
