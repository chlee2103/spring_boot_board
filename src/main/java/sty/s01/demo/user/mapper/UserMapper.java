package sty.s01.demo.user.mapper;

import org.apache.ibatis.annotations.Mapper;
import sty.s01.demo.user.model.UserInfo;

import java.util.List;

@Mapper // Mapper인식
public interface UserMapper {
    List<UserInfo> selectUserInfo();
}
