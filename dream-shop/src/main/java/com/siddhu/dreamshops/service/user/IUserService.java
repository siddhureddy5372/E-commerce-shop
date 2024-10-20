package com.siddhu.dreamshops.service.user;

import com.siddhu.dreamshops.dto.UserDto;
import com.siddhu.dreamshops.model.User;
import com.siddhu.dreamshops.request.CreateUserRequest;
import com.siddhu.dreamshops.request.UserUpdateRequest;

public interface IUserService {

    User getUserById(Long userId);
    User createUser(CreateUserRequest request);
    User updateUser(UserUpdateRequest request, Long userId);
    void deleteUser(Long userId);

    UserDto convertUserToDto(User user);
}
