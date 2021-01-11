package cn.edu.chd.douban.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data //自动生成get,set,equals(),hashCode(),toString()方法
@Accessors(chain = true) //设置get、set方法名模式，这里是链式
@AllArgsConstructor //添加所有参数的构造函数
@NoArgsConstructor //添加无参数的构造函数
public class User {
    private Integer id;
    private String username;
    private String password;
    private String salt;
}
