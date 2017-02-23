package com.travels.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.travels.entities.User;

public interface UserService {

    public List<User> findAllUsers();

    public User save(final User user);

    public Page<User> findAllUsers(Pageable pageable);

    public Page<User> findUserByName(String name, Pageable pageable);

    public User findUserByName(String name);

    Page<User> search(String s, Pageable pageable);

}
