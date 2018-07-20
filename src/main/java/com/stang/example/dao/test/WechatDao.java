package com.stang.example.dao.test;

import com.stang.example.entity.test.WechatEntity;
import org.apache.ibatis.annotations.Param;

import java.util.Map;

/**
 * @author 梅谢兵
 * @version V1.0
 * @Title: WechatDao
 * @Package com.stang.example.dao.test
 * @Description:
 * @date 7/20/18
 */
public interface WechatDao {
    public WechatEntity getWechatInfo(@Param("id") String id);
}
