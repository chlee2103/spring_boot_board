package sty.s01.demo.user.service;

import org.springframework.stereotype.Service;
import sty.s01.demo.user.mapper.UserMapper;
import sty.s01.demo.user.model.UserInfo;

import java.util.List;

@Service
public class UserService {
    private UserMapper userMapper;
    public UserService(UserMapper userMapper){
        this.userMapper=userMapper;
    }

    public List<UserInfo> getUserInfoList(){
        return userMapper.selectUserInfo();
    }

}
