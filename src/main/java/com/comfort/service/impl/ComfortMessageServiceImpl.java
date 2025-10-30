package com.comfort.service.impl;

import com.comfort.entity.ComfortMessage;
import com.comfort.mapper.ComfortMessageMapper;
import com.comfort.service.ComfortMessageService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * 安慰语句服务实现类
 */
@Service
public class ComfortMessageServiceImpl implements ComfortMessageService {

    @Resource
    private ComfortMessageMapper comfortMessageMapper;

    @Override
    public List<ComfortMessage> getRandomMessages() {
        return comfortMessageMapper.getRandomMessages();
    }

    @Override
    public void incrementLikes(Long id) {
        comfortMessageMapper.incrementLikes(id);
    }
    
    @Override
    public void addMessage(ComfortMessage message) {
        // 设置默认值
        if (message.getLikes() == null) {
            message.setLikes(0);
        }
        if (message.getCategory() == null || message.getCategory().isEmpty()) {
            message.setCategory("default");
        }
        // 保存消息
        comfortMessageMapper.insert(message);
    }
}