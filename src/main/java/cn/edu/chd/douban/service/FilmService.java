package cn.edu.chd.douban.service;

import cn.edu.chd.douban.bean.Film;
import cn.edu.chd.douban.vo.Item;
import cn.edu.chd.douban.vo.Vfilm;

import java.util.HashMap;
import java.util.List;

public interface FilmService {
    List<Film> findallfilms();
    List<Vfilm> findVfilmByCon(Vfilm vfilm);
    List<Item> orderCountryNum();
    List<Item> orderTypesNum();
}
