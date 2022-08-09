package com.fastcampus.jpa.bookmanager.repository;

import com.fastcampus.jpa.bookmanager.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {

    ///JpaRepository을 통해서 JPA관련 repository들이 상속됨
    //paRepository<User,Long> 제너릭 처음값은 entity  , 두번째는 user의id컴
   //커맨드 쉬프트 티 = 테스트 로직 만들자


}
