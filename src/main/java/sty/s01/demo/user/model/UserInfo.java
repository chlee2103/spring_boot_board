package sty.s01.demo.user.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class UserInfo {
    private long userSeq;
    private String userId;
    private String userName;
    private String userPw;
    private String userAuth;
    private String userDltYn;
}
