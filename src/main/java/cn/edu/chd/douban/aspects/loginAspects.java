package cn.edu.chd.douban.aspects;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Configuration;


@Aspect
@Configuration
public class loginAspects {

    //within：用于匹配连接点所在的Java类或者包
//    @Before("within(cn.edu.chd.douban.service.impl.*)")
//    public void before(JoinPoint joinPoint) {
//        System.out.println("测试内容");
//        System.out.println(joinPoint.getArgs()[0]);
//    }

    //execution用于匹配子表达式
//    @After("execution(public * cn.edu.chd.douban.service.impl..*(..))")
//    public void after(JoinPoint joinPoint) {
//
//    }
}

