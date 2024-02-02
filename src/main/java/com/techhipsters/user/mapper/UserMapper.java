package com.techhipsters.user.mapper;

import com.techhipsters.user.UserDto;
import com.techhipsters.user.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {
    UserDto entity2Dto(User user);
    User dto2Entity(UserDto dto);
}
