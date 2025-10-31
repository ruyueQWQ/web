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
     * 获取指定数量的随机安慰语句
     */
    List<ComfortMessage> getRandomMessages(int limit);

    /**
     * 增加点赞数
     */
    void incrementLikes(Long id);
    
    /**
     * 添加新的安慰语句
     */
    void addMessage(ComfortMessage message);
}