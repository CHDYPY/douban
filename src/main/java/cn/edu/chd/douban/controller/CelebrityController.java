package cn.edu.chd.douban.controller;


import cn.edu.chd.douban.bean.Celebrity;
import cn.edu.chd.douban.service.CelebrityService;
import cn.edu.chd.douban.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

@RestController
@RequestMapping("/celebrity")
public class CelebrityController {

    @Autowired
    private CelebrityService celebrityService;
    //找到所有演员信息
    @RequestMapping("/findallcele")
    public JsonResult findallcele() {
        List<Celebrity> celebrities = celebrityService.findallcele();
        return new JsonResult(celebrities);
    }
    //通过电影序号查找导演
    @RequestMapping("/findcele")
    public JsonResult findCele(Long fid, String cName) throws UnsupportedEncodingException {
        URLDecoder ud = new URLDecoder();
        cName = ud.decode(cName,"utf-8");
        System.out.println("cName = " + cName);
        Celebrity celebrities = celebrityService.findDirByCele(fid, cName);
        return new JsonResult(celebrities);
    }

}
