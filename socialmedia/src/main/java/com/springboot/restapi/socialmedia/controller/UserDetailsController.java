package com.springboot.restapi.socialmedia.controller;

import java.util.List;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.restapi.socialmedia.dto.UserDetailsDto;
import com.springboot.restapi.socialmedia.info.UserDetails;
import com.springboot.restapi.socialmedia.mapper.UserDetailsMapper;
import com.springboot.restapi.socialmedia.services.UserDaoServices;

import jakarta.validation.Valid;

@RestController
public class UserDetailsController {

	private UserDaoServices service;
	private UserDetailsMapper mapper;
	
	public UserDetailsController(UserDaoServices service,UserDetailsMapper mapper) {
		super();
		this.service = service;
		this.mapper=mapper;
	}
	@GetMapping("/users")
	public List<UserDetailsDto> getAllDetails() {
		List<UserDetails> findDetails = service.findDetails();
		 return mapper.toDtoList(findDetails);
	}

	@GetMapping("/users/{id}")
	public UserDetailsDto getById(@PathVariable int id) {
		UserDetails detail = service.fingDetailsById(id);
		return mapper.toDto(detail);
	}

	@PostMapping("users/post")
	public List<UserDetailsDto> createDetails(@Valid @RequestBody UserDetails user) {
		List<UserDetails> detail = service.addDetails(user);
		 return mapper.toDtoList(detail);
	}

	@DeleteMapping("users/delete/{id}")
	public List<UserDetailsDto> deleteDetails(@PathVariable int id) {
		 List<UserDetails> detail = service.deleteById(id);
		 return  mapper.toDtoList(detail);
	}
}
