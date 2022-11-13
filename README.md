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

Date: 13/11/2022 19:53:50
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for user_attention
-- ----------------------------
DROP TABLE IF EXISTS user_attention;
CREATE TABLE user_attention  (
ID int NOT NULL AUTO_INCREMENT COMMENT '主键ID',
USER_ID int NULL DEFAULT NULL COMMENT '用户ID',
ATTENTION_USER_ID int NULL DEFAULT NULL COMMENT '关注用户ID',
CREATE_TIME datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PRIMARY KEY (ID) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 40 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user_attention
-- ----------------------------
INSERT INTO user_attention VALUES (42, 16, 18, '2022-11-13 17:50:20');
INSERT INTO user_attention VALUES (43, 18, 20, '2022-11-13 17:56:55');
INSERT INTO user_attention VALUES (44, 18, 17, '2022-11-13 17:56:56');
INSERT INTO user_attention VALUES (45, 16, 19, '2022-11-13 18:14:42');
INSERT INTO user_attention VALUES (46, 17, 19, '2022-11-13 18:15:13');

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

Date: 13/11/2022 19:54:01
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
HEAD_IMAGE varchar(50) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '图片',
PRIMARY KEY (ID) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO user VALUES (16, 'a', 'ad88ebd5e3d6e975a4e9d490a2b8ea92', '9431ea96-7ac6-442e-9123-aef800bf9f4b', '绞尽脑汁王多多', 23, '江苏省南京市', '南京工程学院', '2022-11-03 09:05:11', 0, '1.jpg');
INSERT INTO user VALUES (17, 'b', '068af8a2acc99b3034ee5de2ad5a4acf', '40516289-3622-4b75-be84-a4eab6d5bd90', '异想天开张三丰', 23, '南京市江宁区', '北京大学', '2022-11-03 15:13:15', 0, '2.jpg');
INSERT INTO user VALUES (18, 'c', '6b5d37e798654c9163fdcb982363df05', 'a66c4bfd-d9fa-40dd-baaa-7df66beb81f5', '罪大恶极老船长', 11, '江宁区南京', '学校', '2022-11-08 10:58:37', 0, '3.jpg');
INSERT INTO user VALUES (19, 'd', '7edbbe33dd815b3eb6f7fd0be1806839', 'bbe39550-7047-4be6-aa9e-78d12a942deb', '鬼头鬼脑柴小七', 13, NULL, NULL, '2022-11-08 10:58:57', 0, '4.jpg');
INSERT INTO user VALUES (20, 'e', 'f902b34f28de6349ae31a41d2e6118a7', 'b08d1374-2938-4cdc-a82d-4c1cf2620e61', '为人谦逊余小雯', NULL, NULL, NULL, '2022-11-08 10:59:00', 0, '5.jpg');
INSERT INTO user VALUES (21, 'f', '6431e5c81998fd807b80bb70ae54b304', '94c44bd2-8768-4fab-942d-d9b45455acee', NULL, NULL, NULL, NULL, '2022-11-08 10:59:02', 0, '6.jpg');
INSERT INTO user VALUES (22, 'g', '16d963af3031b5db7615c4525ded2d4f', 'c10693eb-94bc-4fa1-bb12-fe1e98764cc3', NULL, NULL, NULL, NULL, '2022-11-13 16:49:54', 0, NULL);

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

Date: 13/11/2022 19:54:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for life_info_comment
-- ----------------------------
DROP TABLE IF EXISTS life_info_comment;
CREATE TABLE life_info_comment  (
ID int NOT NULL AUTO_INCREMENT COMMENT '主键',
USER_ID int NULL DEFAULT NULL COMMENT '用户ID',
REPLAY_USER_ID int NULL DEFAULT NULL COMMENT '回复用户ID',
LIFE_MESSAGE_ID int NULL DEFAULT NULL COMMENT '生活信息ID',
COMMENT_INFO varchar(1000) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '评论内容',
CREATE_TIME datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PARENT_ID int NULL DEFAULT 0 COMMENT '0外层 非0内层',
PRIMARY KEY (ID) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of life_info_comment
-- ----------------------------
INSERT INTO life_info_comment VALUES (4, 1, NULL, 1, NULL, '2022-11-09 20:35:54', 0);
INSERT INTO life_info_comment VALUES (5, 2, NULL, 1, NULL, '2022-11-09 20:36:03', 0);
INSERT INTO life_info_comment VALUES (6, 3, 2, 1, NULL, '2022-11-09 20:36:18', 4);
INSERT INTO life_info_comment VALUES (7, 16, NULL, 32, '1', '2022-11-10 08:39:06', 0);
INSERT INTO life_info_comment VALUES (8, 16, NULL, 32, '1', '2022-11-10 08:44:41', 0);
INSERT INTO life_info_comment VALUES (9, 16, NULL, 32, '222', '2022-11-10 08:44:53', 0);
INSERT INTO life_info_comment VALUES (10, 16, NULL, 32, '3', '2022-11-10 08:48:31', 0);
INSERT INTO life_info_comment VALUES (11, 16, NULL, 32, '55', '2022-11-10 08:48:39', 0);
INSERT INTO life_info_comment VALUES (12, 17, NULL, 32, '3333333', '2022-11-10 08:54:37', 0);
INSERT INTO life_info_comment VALUES (13, 17, NULL, 30, '添加一条评论！', '2022-11-10 08:58:46', 0);
INSERT INTO life_info_comment VALUES (14, 17, NULL, 32, '这是一条评论', '2022-11-10 08:59:12', 0);
INSERT INTO life_info_comment VALUES (15, 17, NULL, 32, '最新评论', '2022-11-10 09:00:40', 0);
INSERT INTO life_info_comment VALUES (16, 17, NULL, 32, '这是最新评论', '2022-11-10 09:08:08', 0);
INSERT INTO life_info_comment VALUES (23, 18, NULL, 32, '是周四', '2022-11-10 10:12:56', 17);
INSERT INTO life_info_comment VALUES (26, 19, 19, 32, '确实是周四', '2022-11-10 10:40:16', 17);
INSERT INTO life_info_comment VALUES (27, 19, 18, 32, '明天是周五', '2022-11-10 10:40:31', 17);
INSERT INTO life_info_comment VALUES (30, 19, NULL, 32, '我也评论一下', '2022-11-10 10:52:17', 0);
INSERT INTO life_info_comment VALUES (32, 18, NULL, 32, '这才是最新评论', '2022-11-10 14:02:25', 16);
INSERT INTO life_info_comment VALUES (33, 20, 18, 32, '今天是周四了', '2022-11-10 14:03:11', 16);
INSERT INTO life_info_comment VALUES (34, 20, NULL, 32, '今天天气真好', '2022-11-10 14:04:55', 16);
INSERT INTO life_info_comment VALUES (37, 18, NULL, 32, '今天的快乐生活要结束了', '2022-11-10 15:39:05', 0);
INSERT INTO life_info_comment VALUES (38, 18, NULL, 29, '我评论一下', '2022-11-11 10:38:33', 0);
INSERT INTO life_info_comment VALUES (39, 17, NULL, 34, '已经结束了', '2022-11-13 17:39:50', 0);
INSERT INTO life_info_comment VALUES (40, 16, NULL, 39, '今天的天气不是很好', '2022-11-13 17:55:03', 0);
INSERT INTO life_info_comment VALUES (41, 17, NULL, 39, '今天的天气很冷', '2022-11-13 17:55:25', 40);
INSERT INTO life_info_comment VALUES (42, 18, 17, 39, '都快要冻死了', '2022-11-13 17:55:47', 40);
INSERT INTO life_info_comment VALUES (43, 18, NULL, 39, '今天的天气确实很冷', '2022-11-13 17:56:09', 40);
INSERT INTO life_info_comment VALUES (44, 18, NULL, 39, '我也觉得今天的天气不好', '2022-11-13 17:56:18', 0);
INSERT INTO life_info_comment VALUES (45, 16, NULL, 45, '今天天气不是很好', '2022-11-13 18:12:52', 0);
INSERT INTO life_info_comment VALUES (46, 17, NULL, 45, '今天的天气很冷', '2022-11-13 18:13:11', 45);
INSERT INTO life_info_comment VALUES (47, 18, 17, 45, '今天是阴天', '2022-11-13 18:13:30', 45);
INSERT INTO life_info_comment VALUES (49, 16, NULL, 46, '我是粉丝我能看到', '2022-11-13 18:14:56', 0);

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

Date: 13/11/2022 19:54:09
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for life_info_comment
-- ----------------------------
DROP TABLE IF EXISTS life_info_comment;
CREATE TABLE life_info_comment  (
ID int NOT NULL AUTO_INCREMENT COMMENT '主键',
USER_ID int NULL DEFAULT NULL COMMENT '用户ID',
REPLAY_USER_ID int NULL DEFAULT NULL COMMENT '回复用户ID',
LIFE_MESSAGE_ID int NULL DEFAULT NULL COMMENT '生活信息ID',
COMMENT_INFO varchar(1000) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '评论内容',
CREATE_TIME datetime NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
PARENT_ID int NULL DEFAULT 0 COMMENT '0外层 非0内层',
PRIMARY KEY (ID) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 39 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of life_info_comment
-- ----------------------------
INSERT INTO life_info_comment VALUES (4, 1, NULL, 1, NULL, '2022-11-09 20:35:54', 0);
INSERT INTO life_info_comment VALUES (5, 2, NULL, 1, NULL, '2022-11-09 20:36:03', 0);
INSERT INTO life_info_comment VALUES (6, 3, 2, 1, NULL, '2022-11-09 20:36:18', 4);
INSERT INTO life_info_comment VALUES (7, 16, NULL, 32, '1', '2022-11-10 08:39:06', 0);
INSERT INTO life_info_comment VALUES (8, 16, NULL, 32, '1', '2022-11-10 08:44:41', 0);
INSERT INTO life_info_comment VALUES (9, 16, NULL, 32, '222', '2022-11-10 08:44:53', 0);
INSERT INTO life_info_comment VALUES (10, 16, NULL, 32, '3', '2022-11-10 08:48:31', 0);
INSERT INTO life_info_comment VALUES (11, 16, NULL, 32, '55', '2022-11-10 08:48:39', 0);
INSERT INTO life_info_comment VALUES (12, 17, NULL, 32, '3333333', '2022-11-10 08:54:37', 0);
INSERT INTO life_info_comment VALUES (13, 17, NULL, 30, '添加一条评论！', '2022-11-10 08:58:46', 0);
INSERT INTO life_info_comment VALUES (14, 17, NULL, 32, '这是一条评论', '2022-11-10 08:59:12', 0);
INSERT INTO life_info_comment VALUES (15, 17, NULL, 32, '最新评论', '2022-11-10 09:00:40', 0);
INSERT INTO life_info_comment VALUES (16, 17, NULL, 32, '这是最新评论', '2022-11-10 09:08:08', 0);
INSERT INTO life_info_comment VALUES (23, 18, NULL, 32, '是周四', '2022-11-10 10:12:56', 17);
INSERT INTO life_info_comment VALUES (26, 19, 19, 32, '确实是周四', '2022-11-10 10:40:16', 17);
INSERT INTO life_info_comment VALUES (27, 19, 18, 32, '明天是周五', '2022-11-10 10:40:31', 17);
INSERT INTO life_info_comment VALUES (30, 19, NULL, 32, '我也评论一下', '2022-11-10 10:52:17', 0);
INSERT INTO life_info_comment VALUES (32, 18, NULL, 32, '这才是最新评论', '2022-11-10 14:02:25', 16);
INSERT INTO life_info_comment VALUES (33, 20, 18, 32, '今天是周四了', '2022-11-10 14:03:11', 16);
INSERT INTO life_info_comment VALUES (34, 20, NULL, 32, '今天天气真好', '2022-11-10 14:04:55', 16);
INSERT INTO life_info_comment VALUES (37, 18, NULL, 32, '今天的快乐生活要结束了', '2022-11-10 15:39:05', 0);
INSERT INTO life_info_comment VALUES (38, 18, NULL, 29, '我评论一下', '2022-11-11 10:38:33', 0);
INSERT INTO life_info_comment VALUES (39, 17, NULL, 34, '已经结束了', '2022-11-13 17:39:50', 0);
INSERT INTO life_info_comment VALUES (40, 16, NULL, 39, '今天的天气不是很好', '2022-11-13 17:55:03', 0);
INSERT INTO life_info_comment VALUES (41, 17, NULL, 39, '今天的天气很冷', '2022-11-13 17:55:25', 40);
INSERT INTO life_info_comment VALUES (42, 18, 17, 39, '都快要冻死了', '2022-11-13 17:55:47', 40);
INSERT INTO life_info_comment VALUES (43, 18, NULL, 39, '今天的天气确实很冷', '2022-11-13 17:56:09', 40);
INSERT INTO life_info_comment VALUES (44, 18, NULL, 39, '我也觉得今天的天气不好', '2022-11-13 17:56:18', 0);
INSERT INTO life_info_comment VALUES (45, 16, NULL, 45, '今天天气不是很好', '2022-11-13 18:12:52', 0);
INSERT INTO life_info_comment VALUES (46, 17, NULL, 45, '今天的天气很冷', '2022-11-13 18:13:11', 45);
INSERT INTO life_info_comment VALUES (47, 18, 17, 45, '今天是阴天', '2022-11-13 18:13:30', 45);
INSERT INTO life_info_comment VALUES (49, 16, NULL, 46, '我是粉丝我能看到', '2022-11-13 18:14:56', 0);

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

Date: 13/11/2022 19:54:19
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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
) ENGINE = InnoDB AUTO_INCREMENT = 37 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of life_info
-- ----------------------------
INSERT INTO life_info VALUES (2, 16, '今天天气真好！', 1, '2022-11-04 16:19:55');
INSERT INTO life_info VALUES (3, 16, '今天是11月7日', 1, '2022-11-07 08:08:37');
INSERT INTO life_info VALUES (4, 16, '【成品油再迎调价窗口 多地#95号汽油或将重回9元时代#】据中新经纬，11月7日24时，国内成品油新一轮调价窗将开启。机构普遍预计，#国内油价将再度上调#。据金联创测算，截至11月4日第九个工作日，参考原油品种均价为91.46美元/桶，变化率为2.61%，预计本轮零售价上调幅度或在130-140元/吨', 1, '2022-11-07 08:40:38');
INSERT INTO life_info VALUES (5, 16, '据报道，Facebook母公司Meta可能最早从周三开始大规模裁员。报道称，此次裁员预计将影响数千名员工，这将标志着Meta公司历史上首次大规模裁员。9月底，该公司报告称其员工总数超过8.7万名。', 1, '2022-11-07 08:40:48');
INSERT INTO life_info VALUES (6, 16, '【盖茨新书谈《如何预防下一次大流行》，#盖茨防疫观点引发争议#】#盖茨建议组建防疫消防队#组建一个由全球3000名专家组成的“防疫消防队”。这是微软(创始人比尔·盖茨对新冠肺炎疫情及其他全球流行病给出“药方”。在其今年5月出版的新书《如何预防下一次大流行》中，盖茨详细阐释了自己的观点', 1, '2022-11-07 08:41:08');
INSERT INTO life_info VALUES (7, 16, '【在诗词里，冬日的梦境正悄悄发生】冬天来啦！是不是觉得还没看够深秋的霜林尽染，就迎来了初冬的白雪缤纷。岁月几许沧桑，人间几多风雪。梅香雪白，月明桥冻，在诗词里，冬日盛景正悄悄绽放。今天是#立冬#，九首诗词带你读懂冬天的美', 1, '2022-11-07 08:41:18');
INSERT INTO life_info VALUES (8, 16, '据央视新闻客户端，11月6日0时至24时，北京市新增41例本土确诊病例和18例无症状感染者（含4例无症状感染者转确诊病例，其中30例已通报），53例隔离观察人员、2例社会面筛查人员，无新增疑似病例；新增3例境外输入确诊病例（含1例无症状感染者', 1, '2022-11-07 08:41:36');
INSERT INTO life_info VALUES (9, 16, '马斯克440亿美元收购推特，随后他便大刀阔斧裁员，一口气裁掉一半员工，不过周日时有消息指出，推特联系几十名被裁员工，让他们回去工作。之所以让一些员工回归，据说是因为他们出于错误被裁，还有一些则是因为马斯克想开发新功能', 1, '2022-11-07 08:41:46');
INSERT INTO life_info VALUES (10, 16, '随着我国风电产业不断发展壮大，中国海上风电正穿越大洋，走向世界，在国际风电市场上扮演着越来越重要的角色。如今我国风电机中的发电机、齿轮箱等核心部件已实现100％国产化，出口到34个国家和地区', 1, '2022-11-07 08:41:55');
INSERT INTO life_info VALUES (11, 16, '11月7日24时，国内成品油新一轮调价窗将开启。机构普遍预计，国内成品油价格将再度上调。据金联创测算，截至11月4日第九个工作日，参考原油品种均价为91.46美元/桶，变化率为2.61%，预计本轮零售价上调幅度或在130-140元/吨，折合升价约为0.1-0.12元。届时国内多数地区95号汽油或再度步入“9元时代”', 1, '2022-11-07 08:42:07');
INSERT INTO life_info VALUES (12, 16, '据Mark Gurman，苹果公司正在开发一种更新的Siri体验，不再需要“Hey Siri”触发语来调用数字语音助手。Gurman在最新的Power On通讯中说，苹果正在研究一种方法，让Siri能够理解短语和命令，而不需要使用“Hey Siri”触发短语，可以只说“Siri”。', 1, '2022-11-07 08:42:24');
INSERT INTO life_info VALUES (13, 16, '【 数字经济快速发展 #数字人才如何培养#？ 】当下，数字化以及其衍生的数字经济已成为驱动经济的重要力量，2021年中国数字经济规模达到45.5万亿元，占GDP比重达到39.8%，数字经济作为国民经济的“稳定器”和“加速器”作用无可替代，在其快速发展的环境下，培养高水平的数字化人才成为当务之急。6日上午，第五届进博会的虹桥国际经济论坛——“数字人才培养国际交流”会员论坛在上海国家会展中心召开。政府官员、国际组织代表、跨国企业高管等出席本次论坛，聚焦数字化人才培养的话题，共同探讨了数字化人才培养的重要性、迫切性以及数字化人才培养的方法等话题。', 1, '2022-11-07 08:42:34');
INSERT INTO life_info VALUES (14, 16, '到目前为止，火星通常被认为是一颗地质死亡的行星。然而近日，由瑞士苏黎世联邦理工学院领导的一个国际研究团队报告称，火星依然活着，一系列信号表明火山活动在塑造火星地表特征方面仍然发挥着积极作用。相关研究已发表在近期的《自然-天文学》杂志上。', 1, '2022-11-07 14:11:49');
INSERT INTO life_info VALUES (15, 17, '11月7日24时，国内成品油新一轮调价窗将开启。机构普遍预计，国内成品油价格将再度上调。据金联创测算，截至11月4日第九个工作日，参考原油品种均价为91.46美元/桶，变化率为2.61%，预计本轮零售价上调幅度或在130-140元/吨，折合升价约为0.1-0.12元。届时国内多数地区95号汽油或再度步入“9元时代”。', 1, '2022-11-07 14:28:38');
INSERT INTO life_info VALUES (16, 17, '华为轮值董事长胡厚崑11月7日在华为全联接大会2022表示，华为已实现5G远程采煤。他表示，华为对5G设备做了特殊适配，能够满足井下作业防爆要求。在煤矿，利用5G实现远程操控，可以让煤矿工人从井下恶劣工作环境走到井上，在办公室里实现远程采煤作业，提高煤矿安全生产水平。', 1, '2022-11-07 14:30:05');
INSERT INTO life_info VALUES (17, 17, '日前，由人力资源和社会保障部、财政部、国家税务总局、银保监会、证监会联合印发的《个人养老金实施办法》正式发布。有银行业内人士认为，本次个人养老金资金账户相关要求，或将突破央行对二类户出入金的监管限制，二类户亦有望迎来修订或改革。', 1, '2022-11-07 14:30:27');
INSERT INTO life_info VALUES (19, 16, '双11大促即将到来，想拥有一台#华为MatePad#助力高效办公学习，但不知道该怎么选？请收好阿华的这份全系选购指南，一张图get最适合你的平板！#华为双11智慧享好礼# ​​​', 1, '2022-11-07 14:46:44');
INSERT INTO life_info VALUES (20, 16, '今天是周一！！', 1, '2022-11-07 15:44:11');
INSERT INTO life_info VALUES (25, 17, '本周市场关注美国国会的中期选举结果与关键的10月CPI通胀数据。热门中概股普遍上涨。道指涨81.03点，涨幅为0.25%，报32484.25点；纳指涨56.01点，涨幅为0.53%，报10531.27点；标普500指数涨15.08点，涨幅为0.40%，报3785.63点。 ​​​', 1, '2022-11-08 09:26:16');
INSERT INTO life_info VALUES (29, 18, '美东时间周一，美国芯片制造商英伟达公司表示，将在中国推出一款新的芯片A800，该芯片符合美国近期的出口管制规定。英伟达发言人表示，A800 GPU芯片于第三季度投入生产，是英伟达A100 GPU芯片的一种替代产品，A100已被美商务部限制向中国出口。', 1, '2022-11-08 11:00:33');
INSERT INTO life_info VALUES (30, 20, '【消保委测评鱼丸产品！】近日，上海市消费者权益保护委员会在某电商平台购买了一批鱼丸，发现大部分产品配料首位为“鱼糜”或是“冷冻鱼糜”，而“海霸王爆浆小鱼丸”的主料竟然是鸡肉。', 1, '2022-11-08 11:03:31');
INSERT INTO life_info VALUES (32, 16, '今天是周二', 1, '2022-11-08 13:30:01');
INSERT INTO life_info VALUES (34, 16, '今天周五快要结束了', 2, '2022-11-11 13:59:41');
INSERT INTO life_info VALUES (35, 20, '今天周五确实快要结束了', 2, '2022-11-11 14:01:56');
INSERT INTO life_info VALUES (36, 20, '粉丝可以看到', 2, '2022-11-11 16:03:53');
INSERT INTO life_info VALUES (45, 16, '今天是周日', 1, '2022-11-13 18:12:46');
INSERT INTO life_info VALUES (46, 19, '只有粉丝能看到！！', 2, '2022-11-13 18:14:17');
INSERT INTO life_info VALUES (47, 17, '只要自己能看到', 4, '2022-11-13 18:15:29');

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

Date: 13/11/2022 19:54:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for give_like
-- ----------------------------
DROP TABLE IF EXISTS give_like;
CREATE TABLE give_like  (
ID int NOT NULL AUTO_INCREMENT,
USER_ID int NULL DEFAULT NULL,
LIKE_ID int NULL DEFAULT NULL,
CREATE_TIME datetime NULL DEFAULT CURRENT_TIMESTAMP,
LIKE_TYPE varchar(1) CHARACTER SET utf8mb3 COLLATE utf8mb3_general_ci NULL DEFAULT NULL COMMENT '0表示给生活消息点赞, 1表示给评论点赞',
PRIMARY KEY (ID) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 47 CHARACTER SET = utf8mb3 COLLATE = utf8mb3_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of give_like
-- ----------------------------
INSERT INTO give_like VALUES (1, 1, 1, '2022-11-08 09:58:08', '0');
INSERT INTO give_like VALUES (2, 1, 2, '2022-11-08 10:07:36', '0');
INSERT INTO give_like VALUES (3, 17, 25, '2022-11-08 10:26:18', '0');
INSERT INTO give_like VALUES (4, 17, 20, '2022-11-08 10:27:51', '0');
INSERT INTO give_like VALUES (5, 16, 25, '2022-11-08 10:29:38', '0');
INSERT INTO give_like VALUES (6, 16, 19, '2022-11-08 10:30:08', '0');
INSERT INTO give_like VALUES (7, 17, 19, '2022-11-08 10:30:39', '0');
INSERT INTO give_like VALUES (8, 17, 17, '2022-11-08 10:30:43', '0');
INSERT INTO give_like VALUES (9, 17, 15, '2022-11-08 10:30:48', '0');
INSERT INTO give_like VALUES (10, 17, 14, '2022-11-08 10:30:49', '0');
INSERT INTO give_like VALUES (11, 18, 29, '2022-11-08 11:00:38', '0');
INSERT INTO give_like VALUES (19, 16, 30, '2022-11-08 13:50:36', '0');
INSERT INTO give_like VALUES (23, 16, 32, '2022-11-08 14:17:37', '0');
INSERT INTO give_like VALUES (24, 19, 30, '2022-11-10 10:55:30', '0');
INSERT INTO give_like VALUES (25, 19, 32, '2022-11-10 10:55:36', '0');
INSERT INTO give_like VALUES (26, 18, 32, '2022-11-10 10:56:08', '0');
INSERT INTO give_like VALUES (29, 20, 32, '2022-11-10 14:18:46', '0');
INSERT INTO give_like VALUES (31, 20, 29, '2022-11-10 14:18:48', '0');
INSERT INTO give_like VALUES (33, 20, 16, '2022-11-10 15:19:20', '1');
INSERT INTO give_like VALUES (34, 20, 30, '2022-11-10 15:21:33', '1');
INSERT INTO give_like VALUES (36, 20, 15, '2022-11-10 15:23:12', '1');
INSERT INTO give_like VALUES (37, 20, 14, '2022-11-10 15:23:22', '1');
INSERT INTO give_like VALUES (38, 19, 30, '2022-11-10 15:31:28', '1');
INSERT INTO give_like VALUES (39, 19, 16, '2022-11-10 15:31:31', '1');
INSERT INTO give_like VALUES (41, 18, 33, '2022-11-10 15:32:09', '1');
INSERT INTO give_like VALUES (42, 18, 14, '2022-11-10 15:34:01', '1');
INSERT INTO give_like VALUES (43, 18, 10, '2022-11-10 15:34:05', '1');
INSERT INTO give_like VALUES (44, 18, 16, '2022-11-10 15:35:13', '1');
INSERT INTO give_like VALUES (45, 18, 8, '2022-11-10 15:36:16', '0');
INSERT INTO give_like VALUES (46, 18, 37, '2022-11-10 15:39:07', '1');
INSERT INTO give_like VALUES (47, 16, 39, '2022-11-13 17:55:08', '0');
INSERT INTO give_like VALUES (48, 17, 41, '2022-11-13 17:55:30', '1');
INSERT INTO give_like VALUES (50, 18, 39, '2022-11-13 17:56:22', '0');
INSERT INTO give_like VALUES (51, 18, 43, '2022-11-13 17:56:25', '1');
INSERT INTO give_like VALUES (53, 18, 41, '2022-11-13 17:56:34', '1');
INSERT INTO give_like VALUES (54, 18, 46, '2022-11-13 18:13:38', '1');
INSERT INTO give_like VALUES (55, 18, 47, '2022-11-13 18:13:52', '1');
INSERT INTO give_like VALUES (56, 19, 46, '2022-11-13 18:14:04', '1');
INSERT INTO give_like VALUES (57, 16, 46, '2022-11-13 18:14:58', '0');
INSERT INTO give_like VALUES (59, 17, 46, '2022-11-13 18:15:20', '0');

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

Date: 13/11/2022 19:54:35
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

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

-- ----------------------------
-- Records of comment_type
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;

