package com.fastcampus.jpa.bookmanager.Domain;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Table(name = "User_TBL")
public class User {

//    에러 내용
//
//    Caused by: org.h2.jdbc.JdbcSQLSyntaxErrorException: Syntax error in SQL statement "..." expected "identifier";
//
//​
//
//    발생 원인
//
//    테이블 이름을 SQL에 존재하는 키워드 혹은 예약어를 테이블 이름으로 사용할 때 발생합니다.
//
//            - SQL의 키워드를 테이블명으로 사용 불가
//
// - ex) GROUP, ORDER
//[출처] [Spring JPA]JdbcSQLSyntaxErrorException: Syntax error in SQL statement ... expected "identifier" 에러|작성자 로그
//

//
//    해결 방안
//
//    @Table(name = "이름") 어노테이션 이용
//
//    @Entity
//    @Table(name = "GROUP_TBL")
//    public class Group {
//    ..
//    }
//[출처] [Spring JPA]JdbcSQLSyntaxErrorException: Syntax error in SQL statement ... expected "identifier" 에러|작성자 로그



    //@Entity는 프라이머리키가 필요함 id선언해주자
    @Id
    @GeneratedValue //순차적으로 데이터 증가 시키는 어노테이션
    private Long id;
    @NonNull
    private String name;
    @NonNull
    private String email;
    private LocalDateTime createdate;
    private LocalDateTime updatedate;

}
