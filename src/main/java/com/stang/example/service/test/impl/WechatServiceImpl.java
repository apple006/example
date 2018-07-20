package com.stang.example.service.test.impl;

import com.stang.example.dao.test.WechatDao;
import com.stang.example.entity.test.WechatEntity;
import com.stang.example.service.test.IWechatService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author 梅谢兵
 * @version V1.0
 * @Title: WechatServiceImpl
 * @Package com.stang.example.service.test.impl
 * @Description:
 * @date 7/20/18
 */
@Service
public class WechatServiceImpl implements IWechatService {

    @Resource
    WechatDao wechatDao;

    @Override
    public WechatEntity getWechatInfo(String id) {
        return wechatDao.getWechatInfo(id);
    }
}
