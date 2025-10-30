-- 创建数据库
CREATE DATABASE IF NOT EXISTS comfortdb CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 使用数据库
USE comfortdb;

-- 创建安慰语句表
/*CREATE TABLE IF NOT EXISTS comfort_message (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    content VARCHAR(255) NOT NULL COMMENT '安慰语句内容',
    category VARCHAR(50) DEFAULT 'general' COMMENT '分类',
    likes INT DEFAULT 0 COMMENT '点赞数',
    created_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;*/

-- 插入示例数据
INSERT INTO comfort_message (content, category) VALUES
('你很好，别担心，一切都会好起来的', 'encouragement'),
('你很聪明，相信自己的能力', 'praise'),
('每一天都是新的开始，加油！', 'encouragement'),
('你值得被爱，世界因为有你而更美好', 'affirmation'),
('坚持下去，胜利就在前方', 'encouragement'),
('你已经做得很棒了，继续保持', 'praise'),
('不要给自己太大压力，慢慢来', 'comfort'),
('你是独一无二的，特别的存在', 'affirmation'),
('困难只是暂时的，你一定能克服', 'encouragement'),
('相信自己，你比想象中更强大', 'affirmation'),
('今天的你也很努力，辛苦了', 'comfort'),
('你的笑容很美，能温暖周围的人', 'praise'),
('每一次尝试都是成长', 'encouragement'),
('你有很多优点，要学会欣赏自己', 'affirmation'),
('休息一下，给自己充充电', 'comfort'),
('你很有耐心，这是很珍贵的品质', 'praise'),
('未来充满希望，加油向前冲', 'encouragement'),
('你值得拥有所有美好的东西', 'affirmation'),
('犯错没关系，重要的是从中学习', 'comfort'),
('你很善良，这是最美好的品质', 'praise');