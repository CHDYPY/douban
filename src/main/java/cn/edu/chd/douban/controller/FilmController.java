package cn.edu.chd.douban.controller;

import cn.edu.chd.douban.bean.Film;
import cn.edu.chd.douban.service.FilmService;
import cn.edu.chd.douban.util.JsonResult;
import cn.edu.chd.douban.vo.Item;
import cn.edu.chd.douban.vo.Vfilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/film")
public class FilmController {

    @Autowired
    private FilmService filmService;
    //查找所有电影
    @RequestMapping("/findallfilms")
    public JsonResult findallfilms() {
        List<Film> films = filmService.findallfilms();
        return new JsonResult(films);
    }

    //通过调节查找电影（默认为评分排序,传入一个名为commentNum的变量就可以设置为人数排序）
    @GetMapping("/findvfilmbycon")
    public JsonResult findVfilmByCon(Vfilm vfilm) {
        if(vfilm.getWay() == null || vfilm == null) {
            vfilm.setStar(new Float(0.1));
        } else if(vfilm.getWay().equals("评分最高")) {
            vfilm.setStar(new Float(0.1));
        } else if(vfilm.getWay().equals("标记最多")) {
            vfilm.setCommentNum(new Long(1));
        }
        if(vfilm.getYears()!=null) {
            vfilm.setYear(new Date(vfilm.getYears() - 1900, 1, 1));
            System.out.println(vfilm.getYear().getYear());
        }
        List<Vfilm> vfilms = filmService.findVfilmByCon(vfilm);
        return new JsonResult(vfilms);
    }
    //统计信息，统计国家和电影数
    @RequestMapping("/ordercountry")
    public JsonResult orderCountryNum() {
        List<Item> items = filmService.orderCountryNum();
        return new JsonResult(items);
    }
    //统计类型和电影数
    @RequestMapping("/ordertypes")
    public JsonResult orderTypesNum() {
        List<Item> items = filmService.orderTypesNum();
        return new JsonResult(items);
    }

}
