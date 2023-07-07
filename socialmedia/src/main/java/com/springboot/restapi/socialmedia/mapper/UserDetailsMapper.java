package com.springboot.restapi.socialmedia.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.springboot.restapi.socialmedia.dto.UserDetailsDto;
import com.springboot.restapi.socialmedia.info.UserDetails;

@Mapper(componentModel = "spring")
public interface UserDetailsMapper{
	
      public List<UserDetailsDto> toDtoList(List<UserDetails> ud);
      public List<UserDetails> fromDtoList(List<UserDetailsDto> udt);
      public UserDetailsDto toDto(UserDetails ud);
      public UserDetails fromDto(UserDetailsDto udt);

}
