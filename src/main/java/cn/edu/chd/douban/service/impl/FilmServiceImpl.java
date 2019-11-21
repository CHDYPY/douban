package cn.edu.chd.douban.service.impl;

import cn.edu.chd.douban.bean.Film;
import cn.edu.chd.douban.mapper.FilmMapper;
import cn.edu.chd.douban.service.FilmService;
import cn.edu.chd.douban.service.ex.ServiceException;
import cn.edu.chd.douban.vo.CountryFilmNum;
import cn.edu.chd.douban.vo.Vfilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

//    private List<Vfilm> toTitle(List<Vfilm> vfilms) {
//        List<Vfilm> vfilmList = new ArrayList<>();
//        for(Vfilm vfilm : vfilms) {
//            Vfilm v = new Vfilm();
//            v.setFilmId(vfilm.getFilmId());
//            v.setTitle(vfilm.getTitle());
//            v.setSrc(vfilm.getSrc());
//            vfilmList.add(v);
//        }
//        return vfilmList;
//    }

    @Override
    public List<Film> findallfilms() {
        List<Film> films = filmMapper.findAllFilm();
        if(films.isEmpty()) {
            throw new ServiceException("目前还没有结果！");
        }
        return films;
    }

    @Override
    public List<Vfilm> findVfilmByCon(Vfilm vfilm) {
        List<Vfilm> vfilms = filmMapper.findVfilmByCon(vfilm);
        if(vfilms.isEmpty()) {
            throw new ServiceException("没有数据");
        }
        return vfilms;
    }

    @Override
    public List<CountryFilmNum> orderCountryNum() {
        List<CountryFilmNum> countryFilmNums = filmMapper.orderCountryNum();
        if(countryFilmNums.isEmpty()) {
            throw new ServiceException("查询出错");
        }
        return countryFilmNums;
    }

    @Override
    public HashMap<String, Long> orderTypesNum() {
        HashMap<String, Long> map = new HashMap<>();
        List<Map<String, Object>> list = filmMapper.orderTypesNum();
        if (list == null && list.isEmpty()) {
            throw new ServiceException("没有数据");
        }
        for (Map<String, Object> map1 : list) {
            String type = (String)map1.get("type");
            Long num = (Long)map1.get("num");
            map.put(type, num);
        }
        return map;
    }
}
