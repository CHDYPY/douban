package cn.edu.chd.douban.service;

import cn.edu.chd.douban.bean.User;


public interface UserService {
    Integer insertUser(User user);
    User getUserByName(String username);
}
