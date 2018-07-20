package com.stang.example.entity.test;

/**
 * @author 梅谢兵
 * @version V1.0
 * @Title: IWechatService
 * @Package com.stang.example.entity.test
 * @Description:
 * @date 7/20/18
 */
public class WechatEntity {
    public String id;
    public String title;
    public String author;
    public String pubtime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPubtime() {
        return pubtime;
    }

    public void setPubtime(String pubtime) {
        this.pubtime = pubtime;
    }
}
