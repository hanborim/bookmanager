# bookmanager
JPA1) lombok and Test

정리 : 
자바진영에는 ORM 표준스펙 JPA를 인터페이스로 정의하고 제공하고있음
JPA구현클래스를 모아노는것을 하이퍼네이트
그중에 자주쓰이는기능들을 좀더 쉽게 사용할수 있도록 스프링프레임워크에서 다시한번더 묶음으로 제공하는것이 
SPRING DATA JPA


‘-프로젝트 생성 기본:
1. Lombok 
2. spring web
3. Spring data spa
4.  H2 database(테스트를위해)

‘-lombok
:JPA필수도구 , 인텔리제이 : refactor , lombok , delombok클릭하면 사용하는 메소드를 볼수있음
:@Getter
:@Setter 자동완성 기능
:@TosString:자바의 모든 메소드는 Object를 상속하는데, 거기에 있는 ToString메소드는 오버라이드 필수 값인데
롬복으로 간단하게 사용할수 있다.
@NoArgsConstructor ,아무런 파라미터 없는 생성자 생성 , 이건 항상 선언필요 
User user = new User();
@AllArgsConstructor , 객체가 있는 모든 변수를 인자를 받아서 생성하는 생성자
User user1 = new User("bbo","bbo@poscoict", LocalDateTime.now(),LocalDateTime.now())
@RequiredArgsConstructor 
:꼭필요한 파라미터만을 이용해서 만들어주는 생성자
User user1 = new User("bbo","bbo@poscoict");
@NonNull
:아래변수는 필수값이됨

@EqualsAndHashCode
:lombok이 equals메서드와 hashCode메서드를 생성해준다.
1.equals :두객체의 내용이 같은지 동등성을 비교하는 연산자.
2.hashCode:두객체가 같은객체인지,동일성을 비교하는 연산자.
equals : 두 객체의 내용이 같은지, 동등성(equality) 를 비교하는 연산자
hashCode : 두 객체가 같은 객체인지, 동일성(identity) 를 비교하는 연산자


@Data 란
@Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode 한번에 설정해 주는 어노테이션이다.
모든필드를 대상으로 접근자, 설정자가 자동 생성되고, final 또는 @NonNull 필드 값을 파라미터로 받는 생성자가 만들어지고, toString, equals, hashCode 메소드가 자동으로 만들어진다.

@Builder
:빌더패턴을 손쉽게 적용
User user2 = User.builder().name("bba").email("dsd@sdd").build();

