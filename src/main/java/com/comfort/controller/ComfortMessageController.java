package com.comfort.controller;

import com.comfort.entity.ComfortMessage;
import com.comfort.service.ComfortMessageService;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import java.util.List;

/**
 * 安慰语句控制器
 */
@RestController
@RequestMapping("/api/messages")
@CrossOrigin(origins = "*") // 允许跨域访问
public class ComfortMessageController {

    @Resource
    private ComfortMessageService comfortMessageService;

    /**
     * 获取随机安慰语句
     */
    @GetMapping("/random")
    public List<ComfortMessage> getRandomMessages() {
        return comfortMessageService.getRandomMessages();
    }

    /**
     * 点赞
     */
    @PostMapping("/like/{id}")
    public String likeMessage(@PathVariable Long id) {
        comfortMessageService.incrementLikes(id);
        return "点赞成功";
    }
    
    /**
     * 添加新的安慰语句
     */
    @PostMapping("/add")
    public String addMessage(@RequestBody ComfortMessage message) {
        comfortMessageService.addMessage(message);
        return "添加成功";
    }
}