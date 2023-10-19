package com.example.graphQLAPI.mappers;

import com.example.graphQLAPI.entities.User;
import com.example.graphQLAPI.graphql.objects.input.UserInput;
import com.example.graphQLAPI.graphql.objects.type.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-08-16T19:06:48-0500",
    comments = "version: 1.5.3.Final, compiler: javac, environment: Java 18.0.2.1 (Eclipse Adoptium)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User toEntity(UserDTO dto) {
        if ( dto == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.id( dto.getId() );
        user.firstName( dto.getFirstName() );
        user.lastName( dto.getLastName() );
        user.email( dto.getEmail() );

        return user.build();
    }

    @Override
    public UserDTO toDTO(User entity) {
        if ( entity == null ) {
            return null;
        }

        Integer id = null;
        String firstName = null;
        String lastName = null;
        String email = null;

        id = entity.getId();
        firstName = entity.getFirstName();
        lastName = entity.getLastName();
        email = entity.getEmail();

        UserDTO userDTO = new UserDTO( id, firstName, lastName, email );

        return userDTO;
    }

    @Override
    public List<User> toEntity(List<UserDTO> dto) {
        if ( dto == null ) {
            return null;
        }

        List<User> list = new ArrayList<User>( dto.size() );
        for ( UserDTO userDTO : dto ) {
            list.add( toEntity( userDTO ) );
        }

        return list;
    }

    @Override
    public List<UserDTO> toDTO(List<User> entityList) {
        if ( entityList == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( entityList.size() );
        for ( User user : entityList ) {
            list.add( toDTO( user ) );
        }

        return list;
    }

    @Override
    public User inputToEntity(UserInput userInput) {
        if ( userInput == null ) {
            return null;
        }

        User.UserBuilder user = User.builder();

        user.firstName( userInput.getFirstName() );
        user.lastName( userInput.getLastName() );
        user.email( userInput.getEmail() );

        return user.build();
    }
}
