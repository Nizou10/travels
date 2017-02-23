package com.travels.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.travels.dao.UserRepository;
import com.travels.entities.User;

@Service("clientService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User save(final User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public Page<User> findAllUsers(final Pageable pageable) {
        return userRepository.findAll(pageable);
    }

    @Override
    public Page<User> findUserByName(final String name, final Pageable pageable) {

        return userRepository.findByName(name, pageable);
    }

    @Override
    public Page<User> search(final String s, final Pageable pageable) {
        // TODO Auto-generated method stub
        return userRepository.search(s, pageable);
    }

    @Override
    public User findUserByName(final String name) {
        // TODO Auto-generated method stub
        return userRepository.findByName(name);
    }

}
