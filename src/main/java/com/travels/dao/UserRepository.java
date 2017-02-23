package com.travels.dao;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.travels.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Page<User> findByName(String name, Pageable pageable);

    User findByName(String name);

    @Query("select u from User u where u.name like :x")
    Page<User> search(@Param("x") String s, Pageable pageable);

}
