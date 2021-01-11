package cn.edu.chd.douban.service.impl;

import cn.edu.chd.douban.bean.User;
import cn.edu.chd.douban.mapper.UserMapper;
import cn.edu.chd.douban.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.UUID;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    public String getMd5Password(String password,String salt) {
        String str = password + salt;
        str = DigestUtils.md2Hex(str).toUpperCase();
        return str;
    }

    @Override
    public Integer insertUser(User user) {

        user.setSalt(UUID.randomUUID().toString());
        String password=user.getPassword();
        password = getMd5Password(password,user.getSalt());
        user.setPassword(password);
        return userMapper.insertUser(user);
    }

    @Override
    public User getUserByName(String username) {
        return userMapper.getUserByName(username);
    }
}
