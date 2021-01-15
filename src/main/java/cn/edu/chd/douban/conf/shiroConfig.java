package cn.edu.chd.douban.conf;

import cn.edu.chd.douban.conf.realm.CustomRealm;
import org.apache.shiro.authc.credential.HashedCredentialsMatcher;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.realm.Realm;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class shiroConfig {
    @Bean
    public ShiroFilterFactoryBean getShiroFilterFactoryBean(SecurityManager securityManager) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = new ShiroFilterFactoryBean();

        Map<String,String> map =  new HashMap<>();

        //anon表示公共资源,指定url可以匿名访问
        map.put("/login.html","anon");
        map.put("/register.html", "anon");

        map.put("/user/login", "anon");
        map.put("/user/register", "anon");
        map.put("/plugins/**", "anon");
        //authc表示受限资源,指定url需要form表单登录，
        // 默认会从请求中获取`username`、`password`,`rememberMe`等参数并尝试登录，
        // 如果登录不了就会跳转到loginUrl配置的路径。
        map.put("/**", "authc");
        //配置认证和授权规则
        shiroFilterFactoryBean.setFilterChainDefinitionMap(map);
        //设置默认的登录界面
        shiroFilterFactoryBean.setLoginUrl("/login.html");
        shiroFilterFactoryBean.setSecurityManager(securityManager);
        return shiroFilterFactoryBean;
    }

    @Bean
    public DefaultWebSecurityManager getDefaultWebSecurityManager(@Qualifier("getRealm") Realm realm) {
        DefaultWebSecurityManager defaultWebSecurityManager = new DefaultWebSecurityManager();
        defaultWebSecurityManager.setRealm(realm);
        return defaultWebSecurityManager;
    }
    @Bean
    public Realm getRealm() {
        CustomRealm customRealm = new CustomRealm();
        //设置凭证效验匹配器
        HashedCredentialsMatcher hashedCredentialsMatcher = new HashedCredentialsMatcher();
        //设置加密算法为md5
        hashedCredentialsMatcher.setHashAlgorithmName("MD5");
        //设置hash散列为1024
        hashedCredentialsMatcher.setHashIterations(1024);

        customRealm.setCredentialsMatcher(hashedCredentialsMatcher);
        return customRealm;
    }


}
