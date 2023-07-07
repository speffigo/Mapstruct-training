package com.springboot.restapi.socialmedia.dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDetailsDto {
	private int id;
	private String name;
	private LocalDate birthDate;
}
