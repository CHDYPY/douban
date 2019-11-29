package cn.edu.chd.douban.mapper;

import cn.edu.chd.douban.bean.Celebrity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CelebrityMapper {
    List<Celebrity> findallcele();
    Celebrity findDirByFid(Long fid, String name);
    Celebrity findWriByFid(Long fid, String name);
    Celebrity findActByFid(Long fid, String name);
}
