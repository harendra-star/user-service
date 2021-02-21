package com.netspend.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.netspend.data.UserData;
import com.netspend.response.UserResponse;

@Mapper
public interface UserResponseMapper {
	UserResponseMapper INSTANCE = Mappers.getMapper(UserResponseMapper.class);

	UserResponse userDataToUserResponse(UserData userData);
}
