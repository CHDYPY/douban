package cn.edu.chd.douban.controller;

import cn.edu.chd.douban.bean.Film;
import cn.edu.chd.douban.service.FilmService;
import cn.edu.chd.douban.util.JsonResult;
import cn.edu.chd.douban.vo.CountryFilmNum;
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

    @RequestMapping("/findallfilms")
    public JsonResult findallfilms() {
        List<Film> films = filmService.findallfilms();
        return new JsonResult(films);
    }

    @GetMapping("/findvfilmbycon")
    public JsonResult findVfilmByCon(Vfilm vfilm) {
        if((vfilm.getStar() == null) && (vfilm.getCommentNum() == null)) {
            vfilm.setStar(new Float(0.1));
        }
        vfilm.setYear(new Date(vfilm.getYears()));
        List<Vfilm> vfilms = filmService.findVfilmByCon(vfilm);
        return new JsonResult(vfilms);
    }

    @RequestMapping("/ordercountrynum")
    public JsonResult orderCountryNum() {
        List<CountryFilmNum> countryFilmNums = filmService.orderCountryNum();
        return new JsonResult(countryFilmNums);
    }

    @RequestMapping("/ordertypesnum")
    public JsonResult orderTypesNum() {
        Map<String, Long> map = filmService.orderTypesNum();
        return new JsonResult(map);
    }

}
