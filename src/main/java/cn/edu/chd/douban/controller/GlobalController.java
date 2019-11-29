package cn.edu.chd.douban.controller;

import cn.edu.chd.douban.util.JsonResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器
 */
@RestControllerAdvice
public class GlobalController {
    /**
     * 处理运行时异常异常，并将异常返回到前端
     * @param e 抛出的异常
     * @return 返回给前端的错误信息和数据
     */
    @ExceptionHandler(value=RuntimeException.class)
    public JsonResult doHandlerRuntimeException(Throwable e){
        e.printStackTrace();
        return new JsonResult(e);
    }
}
