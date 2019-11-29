package cn.edu.chd.douban.service.impl;

import cn.edu.chd.douban.bean.Celebrity;
import cn.edu.chd.douban.mapper.CelebrityMapper;
import cn.edu.chd.douban.service.CelebrityService;
import cn.edu.chd.douban.service.ex.ServiceException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class CelebrityServiceImpl implements CelebrityService {
    @Autowired
    private CelebrityMapper celebrityMapper;
    @Override
    public List<Celebrity> findallcele() {
        List<Celebrity> celebrities = celebrityMapper.findallcele();
        if(celebrities.isEmpty()) {
            throw new ServiceException("明人列表为空！");
        }

        return celebrities;
    }

    @Override
    public Celebrity findDirByCele(Long fid, String name) {
        Celebrity celebrities1 = celebrityMapper.findActByFid(fid, name);
        Celebrity celebrities2 = celebrityMapper.findDirByFid(fid, name);
        Celebrity celebrities3 = celebrityMapper.findWriByFid(fid, name);
        if(celebrities1 == null && celebrities2 == null && celebrities3 == null) {
            throw new ServiceException("明人列表为空！");
        }
        Celebrity celebrity = null;
        if(celebrities1!= null){
            celebrity = celebrities1;
        } else if(celebrities2 != null) {
            celebrity = celebrities2;
        } else if(celebrities3 != null) {
            celebrity = celebrities3;
        }

        return celebrity;
    }
}
