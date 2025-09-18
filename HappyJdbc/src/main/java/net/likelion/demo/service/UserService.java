package net.likelion.demo.service;

public class UserService {

    public void registerUser() {
        // 회원가입이 가능한지 확인
        // 비지니스적으로 회원가입이 가능한 회원인지 확인하는 로직

        // UserDAO - addUser() 호출하고, addUser가 리턴해준 id를 이용해 UserRoleDAO와 addRole 같은 메서드 호출

        // 트랜잭션 처리는 서비스 레이어에서 처리한다.
    }
}
