package cn.edu.chd.douban.mapper;


import cn.edu.chd.douban.vo.CountryFilmNum;
import cn.edu.chd.douban.vo.Vfilm;
import org.apache.ibatis.annotations.Mapper;
import cn.edu.chd.douban.bean.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mapper
public interface FilmMapper {
    List<Film> findAllFilm();
    List<Vfilm> findVfilmByCon(Vfilm film);
//    List<Vfilm> orderVfilmTop(Vfilm vfilm);
    List<CountryFilmNum> orderCountryNum();
    List<Map<String, Object>> orderTypesNum();

}
