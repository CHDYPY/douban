package cn.edu.chd.douban.service;


import cn.edu.chd.douban.bean.Celebrity;

import java.util.List;

public interface CelebrityService {
    List<Celebrity> findallcele();
    Celebrity findDirByCele(Long fid, String name);

}
