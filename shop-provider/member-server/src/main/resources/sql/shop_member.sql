/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50636
Source Host           : localhost:3306
Source Database       : shop_member

Target Server Type    : MYSQL
Target Server Version : 50636
File Encoding         : 65001

Date: 2019-10-27 22:50:55
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_integral
-- ----------------------------
DROP TABLE IF EXISTS `t_integral`;
CREATE TABLE `t_integral` (
  `user_id` bigint(20) NOT NULL,
  `count` int(11) DEFAULT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_integral
-- ----------------------------
INSERT INTO `t_integral` VALUES ('13088889999', '0');
