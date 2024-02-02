package com.techhipsters.api;

import com.techhipsters.user.UserDto;
import com.techhipsters.user.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    private final UserService userService;

    public UserRestController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public UserDto create(@RequestBody UserDto userDto){
        return userService.create(userDto);
    }

}
