package com.comfort.service;

import com.comfort.entity.ComfortMessage;
import java.util.List;

/**
 * 安慰语句服务接口
 */
public interface ComfortMessageService {

    /**
     * 获取随机的安慰语句列表
     */
    List<ComfortMessage> getRandomMessages();

    /**
     * 增加点赞数
     */
    void incrementLikes(Long id);
    
    /**
     * 添加新的安慰语句
     */
    void addMessage(ComfortMessage message);
}