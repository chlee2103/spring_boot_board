package sty.s01.demo.user.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import sty.s01.demo.common.RestResponse;
import sty.s01.demo.user.service.UserService;

@Slf4j
@RestController // 비동기 형식으로 작성할 때 사용 , Controller+ResponseBody
public class UserController {

    private final UserService service;

    // DI 생성자 주입방식
    public UserController(UserService service){
        this.service = service;
    }

    // ResponseEntity : 완전히 구성된 HTTP Response를 사용할 수 있는 클래스
    // Http 바디, 헤더, 상태, 제어할 수 있다.
    @GetMapping("/user/list")
    public ResponseEntity<RestResponse> callList(){
        RestResponse restResponse = new RestResponse();
        restResponse.setData(service.getUserInfoList());
        log.info("{}", service.getUserInfoList());
        return new ResponseEntity<RestResponse>(restResponse, HttpStatus.OK);
    }
    public ResponseEntity<RestResponse> login(){
        return null;
    }


}
