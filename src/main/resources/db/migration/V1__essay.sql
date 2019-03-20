DROP TABLE IF EXISTS `essay`;
CREATE TABLE `essay` (
`id` int(11) NOT NULL AUTO_INCREMENT,
`title` varchar(255) DEFAULT NULL COMMENT '标题',
`content` varchar(255) DEFAULT NULL COMMENT '内容',
`label` varchar(100) DEFAULT NULL COMMENT '标签',
`browse_number` int(11) DEFAULT NULL COMMENT '浏览数',
`create_by` int(11) DEFAULT NULL COMMENT '录入人',
`create_at` datetime DEFAULT NULL COMMENT '录入时间',
PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10000 DEFAULT CHARSET=utf8 COMMENT='文章';