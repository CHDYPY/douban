package cn.edu.chd.douban.service.impl;

import cn.edu.chd.douban.bean.Film;
import cn.edu.chd.douban.mapper.FilmMapper;
import cn.edu.chd.douban.service.FilmService;
import cn.edu.chd.douban.service.ex.ServiceException;
import cn.edu.chd.douban.vo.Item;
import cn.edu.chd.douban.vo.Vfilm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class FilmServiceImpl implements FilmService {

    @Autowired
    private FilmMapper filmMapper;

    private void log(Item item) {
        item.setHeat(Math.log(item.getHeat()) / Math.log(10.0));
    }

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
    public List<Item> orderCountryNum() {
        List<Item> items = filmMapper.orderCountry();
        if(items.isEmpty()) {
            throw new ServiceException("查询出错");
        }
        for(int i = items.size() - 1; i>=0; i--) {
            if(items.get(i).getNum()<=3) {
                items.remove(i);
            }
        }
        for(Item item: items)
            log(item);
        return items;
    }

    @Override
    public List<Item> orderTypesNum() {
        List<Item> items = filmMapper.orderTypes();
        if(items.isEmpty()) {
            throw new ServiceException("查询出错");
        }
        for(int i = items.size() - 1; i>=0; i--) {
            if(items.get(i).getNum()<=3) {
                items.remove(i);
            }
        }
        for(Item item: items)
            log(item);
        return items;
    }
}
