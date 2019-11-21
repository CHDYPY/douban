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
}
