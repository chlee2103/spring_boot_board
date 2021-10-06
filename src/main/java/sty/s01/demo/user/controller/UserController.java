package sty.s01.demo.user.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import sty.s01.demo.common.RestResponse;
import sty.s01.demo.user.service.UserService;

@RestController // 비동기 형식으로 작성할 때 사용
public class UserController {

    private final UserService service;

    // DI 생성자 주입방식
    public UserController(UserService service){
        this.service = service;
    }

    public ResponseEntity<RestResponse> login(){
        return null;
    }
}
