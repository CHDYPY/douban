package cn.edu.chd.douban.controller;


import cn.edu.chd.douban.bean.Celebrity;
import cn.edu.chd.douban.service.CelebrityService;
import cn.edu.chd.douban.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/celebrity")
public class CelebrityController {

    @Autowired
    private CelebrityService celebrityService;

    @RequestMapping("/findallcele")
    public JsonResult findallcele() {
        List<Celebrity> celebrities = celebrityService.findallcele();
        return new JsonResult(celebrities);
    }

}
