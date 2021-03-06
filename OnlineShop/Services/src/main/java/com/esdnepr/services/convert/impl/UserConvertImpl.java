package com.esdnepr.services.convert.impl;

import com.esdnepr.DAO.Model.User;
import com.esdnepr.services.DTO.UserDTO;
import com.esdnepr.services.convert.UserConvert;
import org.springframework.stereotype.Component;

@Component
public class UserConvertImpl implements UserConvert {
    @Override
    public User toEntity(UserDTO dto) {
        return new User(dto.getFirstName(),
                        dto.getLastName(),
                        dto.getAge(),
                        null);
    }

    @Override
    public UserDTO toDto(User entity) {
        return new UserDTO(entity.getFirstName(),
                           entity.getLastName(),
                           entity.getAge()) ;
    }
}
