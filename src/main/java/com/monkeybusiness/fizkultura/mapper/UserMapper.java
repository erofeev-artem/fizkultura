package com.monkeybusiness.fizkultura.mapper;

import com.monkeybusiness.fizkultura.dto.UsersDto;
import com.monkeybusiness.fizkultura.entity.User;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {

    UsersDto map (User usersEntity);

    @InheritInverseConfiguration
    User map(UsersDto dto);
}
