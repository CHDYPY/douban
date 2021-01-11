package cn.edu.chd.douban.mapper;

import cn.edu.chd.douban.bean.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    Integer insertUser(User user);
    User getUserByName(String username);
}
