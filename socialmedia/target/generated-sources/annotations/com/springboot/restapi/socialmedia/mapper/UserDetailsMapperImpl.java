package com.springboot.restapi.socialmedia.mapper;

import com.springboot.restapi.socialmedia.dto.UserDetailsDto;
import com.springboot.restapi.socialmedia.info.UserDetails;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-07T17:52:27+0530",
    comments = "version: 1.4.1.Final, compiler: Eclipse JDT (IDE) 1.4.300.v20221108-0856, environment: Java 17.0.7 (Eclipse Adoptium)"
)
@Component
public class UserDetailsMapperImpl implements UserDetailsMapper {

    @Override
    public List<UserDetailsDto> toDtoList(List<UserDetails> ud) {
        if ( ud == null ) {
            return null;
        }

        List<UserDetailsDto> list = new ArrayList<UserDetailsDto>( ud.size() );
        for ( UserDetails userDetails : ud ) {
            list.add( toDto( userDetails ) );
        }

        return list;
    }

    @Override
    public List<UserDetails> fromDtoList(List<UserDetailsDto> udt) {
        if ( udt == null ) {
            return null;
        }

        List<UserDetails> list = new ArrayList<UserDetails>( udt.size() );
        for ( UserDetailsDto userDetailsDto : udt ) {
            list.add( fromDto( userDetailsDto ) );
        }

        return list;
    }

    @Override
    public UserDetailsDto toDto(UserDetails ud) {
        if ( ud == null ) {
            return null;
        }

        UserDetailsDto userDetailsDto = new UserDetailsDto();

        userDetailsDto.setBirthDate( ud.getBirthDate() );
        userDetailsDto.setId( ud.getId() );
        userDetailsDto.setName( ud.getName() );

        return userDetailsDto;
    }

    @Override
    public UserDetails fromDto(UserDetailsDto udt) {
        if ( udt == null ) {
            return null;
        }

        UserDetails userDetails = new UserDetails();

        userDetails.setBirthDate( udt.getBirthDate() );
        userDetails.setId( udt.getId() );
        userDetails.setName( udt.getName() );

        return userDetails;
    }
}
