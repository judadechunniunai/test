/*
Navicat MySQL Data Transfer

Source Server         : 本地
Source Server Version : 50727
Source Host           : localhost:3306
Source Database       : zhihuitu

Target Server Type    : MYSQL
Target Server Version : 50727
File Encoding         : 65001

Date: 2020-08-20 20:14:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `person`
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `name` varchar(20) NOT NULL,
  `sex` int(4) NOT NULL COMMENT '性别 1=男 2= 女',
  `age` int(10) NOT NULL COMMENT '年龄',
  `tel_phone` varchar(11) NOT NULL COMMENT '电话',
  `dept_id` int(20) NOT NULL COMMENT '部门id',
  `post_name` varchar(50) NOT NULL COMMENT '岗位名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------
INSERT INTO `person` VALUES ('1', '李四', '1', '15', '1571231158', '2', 'php开发');
INSERT INTO `person` VALUES ('2', '张三', '1', '51', '1511325888', '2', 'java开发');
INSERT INTO `person` VALUES ('3', '王五', '2', '17', '158*****145', '2', '前端开发');
INSERT INTO `person` VALUES ('4', '赵柳', '2', '18', '158*****145', '1', '黑盒测试');
INSERT INTO `person` VALUES ('5', '钱七', '1', '15', '123*****894', '1', '白盒');
INSERT INTO `person` VALUES ('6', '孙久', '3', '18', '751*****521', '3', '运维');
INSERT INTO `person` VALUES ('7', '李八', '3', '58', '789*****521', '3', '部署');
