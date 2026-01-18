package com.tuananh.authenticate.mapper;

import com.tuananh.authenticate.dto.request.UserRequest;
import com.tuananh.authenticate.dto.request.UserUpdateRequest;
import com.tuananh.authenticate.dto.response.UserResponse;
import com.tuananh.authenticate.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserRequest userRequest);
    @Mapping(target = "email", ignore = true)
    //UserResponse toUserResponse(User user);
    void updateUser(@MappingTarget User user, UserUpdateRequest userUpdateRequest);
}
