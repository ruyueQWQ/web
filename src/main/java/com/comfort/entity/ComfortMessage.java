package com.comfort.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 安慰语句实体类
 */
@Data
@TableName("comfort_message")
public class ComfortMessage {

    @TableId(type = IdType.AUTO)
    private Long id;
    
    private String content;
    
    private String category;
    
    private Integer likes;
}