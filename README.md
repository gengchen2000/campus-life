# campus-life

校园生活

/*
Navicat Premium Data Transfer

Source Server         : 本地(MySQL)
Source Server Type    : MySQL
Source Server Version : 80031
Source Host           : localhost:3306
Source Schema         : my_db

Target Server Type    : MySQL
Target Server Version : 80031
File Encoding         : 65001

Date: 01/11/2022 15:39:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

用户表

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS user;
CREATE TABLE user  (
ID int NOT NULL AUTO_INCREMENT COMMENT '主键',
USERNAME varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '用户名',
PASSWORD varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '密码',
SALT varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '盐值',
PERSON_NAME varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '昵称',
PERSON_AGE int NULL DEFAULT NULL COMMENT '年龄',
PERSON_ADDRESS varchar(200) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '住址',
SCHOOL_NAME varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '学校名称',
CREATE_TIME datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
NEW_ACCOUNT int NULL DEFAULT 0 COMMENT '是否新注册0:是 1:否',
PRIMARY KEY (ID) USING BTREE,
UNIQUE INDEX USERNAME(USERNAME ASC) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
/*
Navicat Premium Data Transfer

Source Server         : 本地(MySQL)
Source Server Type    : MySQL
Source Server Version : 80031
Source Host           : localhost:3306
Source Schema         : my_db

Target Server Type    : MySQL
Target Server Version : 80031
File Encoding         : 65001

Date: 04/11/2022 13:47:16
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

分享消息表

-- ----------------------------
-- Table structure for life_info
-- ----------------------------
DROP TABLE IF EXISTS life_info;
CREATE TABLE life_info  (
ID int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
USER_ID int NULL DEFAULT NULL COMMENT '用户ID',
MESSAGE_INFO varchar(1000) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '文案消息',
POWER int NULL DEFAULT NULL COMMENT '权限',
CREATE_TIME datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY (ID) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

/*
Navicat Premium Data Transfer

Source Server         : 本地(MySQL)
Source Server Type    : MySQL
Source Server Version : 80031
Source Host           : localhost:3306
Source Schema         : my_db

Target Server Type    : MySQL
Target Server Version : 80031
File Encoding         : 65001

Date: 04/11/2022 13:57:30
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

码值表
-- ----------------------------
-- Table structure for comment_type
-- ----------------------------
DROP TABLE IF EXISTS comment_type;
CREATE TABLE comment_type  (
ID int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
CODE_TYPE varchar(10) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '编码',
CODE_NAME varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '编码名称',
REMARK varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '备注',
GROUP_ID int NULL DEFAULT NULL COMMENT '组ID',
SORT_NUMBER int NULL DEFAULT NULL COMMENT '顺序',
CODE_MESSAGE varchar(100) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '码值信息',
PRIMARY KEY (ID) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;

/*
Navicat Premium Data Transfer

Source Server         : 本地(MySQL)
Source Server Type    : MySQL
Source Server Version : 80031
Source Host           : localhost:3306
Source Schema         : my_db

Target Server Type    : MySQL
Target Server Version : 80031
File Encoding         : 65001

Date: 08/11/2022 09:48:17
*/

-- 点赞表
SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for give_like
-- ----------------------------
DROP TABLE IF EXISTS give_like;
CREATE TABLE give_like  (
ID int NOT NULL AUTO_INCREMENT,
USER_ID int NULL DEFAULT NULL,
LIFE_MESSAGE_ID int NULL DEFAULT NULL,
CREATE_TIME datetime NULL DEFAULT CURRENT_TIMESTAMP,
PRIMARY KEY (ID) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;


