package cn.edu.chd.douban.controller;

import cn.edu.chd.douban.bean.User;
import cn.edu.chd.douban.service.UserService;
import cn.edu.chd.douban.util.JsonResult;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public int login(String username, String password) {
        //获取主体对象
        Subject subject = SecurityUtils.getSubject();
        try {
            subject.login(new UsernamePasswordToken(username,password));
            return 0;
        } catch (UnknownAccountException e) {
            e.printStackTrace();
            System.out.println("用户名错误!");
        }catch (IncorrectCredentialsException e){
            e.printStackTrace();
            System.out.println("密码错误!");
        }
        return 1;
    }

    @GetMapping("/logout")
    public int logout() {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        return 0;
    }

    @PostMapping("/register")
    public JsonResult register(User user) {
        userService.insertUser(user);
        return new JsonResult("添加用户成功");
    }
}
