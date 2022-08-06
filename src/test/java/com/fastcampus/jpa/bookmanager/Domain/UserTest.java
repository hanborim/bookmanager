package com.fastcampus.jpa.bookmanager.Domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void test()
    {
        User user = new User();
        user.setEmail("bobo@fastcampus.com");
        user.setName("bobo");
        user.setCreatedate(LocalDateTime.now());
        user.setUpdatedate(LocalDateTime.now());

        User user1 = new User("bbo","bbo@poscoict", LocalDateTime.now(),LocalDateTime.now());

        System.out.println(">>>>" + user.toString());
    }

    User user2 = User.builder().name("bba").email("dsd@sdd").build();
}