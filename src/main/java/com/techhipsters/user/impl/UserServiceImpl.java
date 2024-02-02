package com.techhipsters.user.impl;

import com.techhipsters.AddUserEvent;
import com.techhipsters.user.UserDto;
import com.techhipsters.user.UserService;
import com.techhipsters.user.mapper.UserMapper;
import com.techhipsters.user.model.User;
import com.techhipsters.user.repo.UserRepo;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepo userRepo;
    private final ApplicationEventPublisher eventPublisher;

    private final UserMapper userMapper;

    public UserServiceImpl(UserRepo userRepo, ApplicationEventPublisher eventPublisher, UserMapper userMapper) {
        this.userRepo = userRepo;
        this.eventPublisher = eventPublisher;
        this.userMapper = userMapper;
    }

    @Override @Transactional
    public UserDto create(UserDto userDto) {
        User entity = userMapper.dto2Entity(userDto);
        UserDto dto = userMapper.entity2Dto(userRepo.save(entity));
        eventPublisher.publishEvent(new AddUserEvent(dto.getId(), dto.getName()));
        return dto;
    }
}
