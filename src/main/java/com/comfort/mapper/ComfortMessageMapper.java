package com.comfort.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.comfort.entity.ComfortMessage;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import java.util.List;
import java.util.Random;

/**
 * 安慰语句Mapper接口
 */
@Mapper
public interface ComfortMessageMapper extends BaseMapper<ComfortMessage> {

    /**
     * 获取随机的安慰语句
     */
    @Select("SELECT * FROM comfort_message ORDER BY RAND() LIMIT 10")
    List<ComfortMessage> getRandomMessages();
    
    /**
     * 获取指定数量的随机安慰语句
     */
    @Select("SELECT * FROM comfort_message ORDER BY RAND() LIMIT #{limit}")
    List<ComfortMessage> getRandomMessagesByLimit(int limit);

    /**
     * 增加点赞数
     */
    void incrementLikes(Long id);
}