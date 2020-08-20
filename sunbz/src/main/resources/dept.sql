/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : zhihuitu

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2020-08-20 20:14:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `dept`
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `describe` varchar(255) DEFAULT NULL COMMENT '职能描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES ('1', '开发', '开发人员');
INSERT INTO `dept` VALUES ('2', '测试', '测试恩怨');
INSERT INTO `dept` VALUES ('3', '支持', '部署运维');
