package com.stang.example.service.test;

import com.stang.example.entity.test.WechatEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author 梅谢兵
 * @version V1.0
 * @Title: IWechatService
 * @Package com.stang.example.service.test
 * @Description:
 * @date 7/20/18
 */
public interface IWechatService {
    public WechatEntity getWechatInfo(@Param("id") String id);
}
