DROP TABLE IF EXISTS `essay`;
CREATE TABLE `essay` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`title` varchar(255) DEFAULT NULL COMMENT '标题',
`content` text DEFAULT NULL COMMENT '内容',
`label` varchar(100) DEFAULT NULL COMMENT '标签',
`browse_number` int(11) DEFAULT '0'  COMMENT '浏览数',
`create_nm` varchar(100) DEFAULT NULL COMMENT '录入人',
`create_at` datetime DEFAULT NULL COMMENT '录入时间',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='文章';
# 添加测试数据：INSERT INTO `essay` VALUES (null, '陌上花开，可缓缓归矣', '用最简单的代码，实现瀑布流布局，没有繁琐的css，没有jq，只需要做到以下就可以实现瀑布流的效果。思路很简单，看成是三列布局，分别用三个ul来调用。帝国cms列表模板', 'CSS', '0', '作者', '2019-03-20 18:00:37');