package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.Domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest //스프링부트를 실행시켜서 , 테스트에 활용한다는 의미
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    void crud()
    {
        //create,readmupdate,delete
        userRepository.save(new User());
        //유저를생성을하고 테이블에 저장하겠다
        System.out.println(">>>>"+userRepository.findAll());
//유저에 있는 데이터를 List형태로 전부 가지고 오겠다는 의미
    }

//    ▶ @Autowired
//
// - 필요한 의존 객체의 '타입'에 해당하는 빈을 찾아 주입한다.
//
// - 생성자, 필드, setter에 사용할 수 있다.
//
//            - 생성자에서 의존성을 주입받는 경우 @Autowired 가 생략되더라도 자동으로 의존성을 주입받을 수 있다.(생성자가 1개인 경우)
//
//            - @Autowired를 사용하면 IoC컨테이너 안에 존재하는 빈을 자동으로 찾아 주입시켜준다.(타입 기준)
//


}