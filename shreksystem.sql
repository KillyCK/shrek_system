/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50722
Source Host           : localhost:3306
Source Database       : shreksystem

Target Server Type    : MYSQL
Target Server Version : 50722
File Encoding         : 65001

Date: 2018-07-20 23:27:46
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `client_details`
-- ----------------------------
DROP TABLE IF EXISTS `client_details`;
CREATE TABLE `client_details` (
  `client_id` varchar(256) NOT NULL,
  `resource_ids` varchar(256) DEFAULT NULL,
  `client_secret` varchar(256) DEFAULT NULL,
  `scope` varchar(256) DEFAULT NULL,
  `authorized_grant_types` varchar(256) DEFAULT NULL,
  `web_server_redirect_uri` varchar(256) DEFAULT NULL,
  `authorities` varchar(256) DEFAULT NULL,
  `access_token_validity` int(11) DEFAULT NULL,
  `refresh_token_validity` int(11) DEFAULT NULL,
  `additional_information` varchar(4096) DEFAULT NULL,
  `autoapprove` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`client_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of client_details
-- ----------------------------
INSERT INTO `client_details` VALUES ('client', 'resource01', 'secret', 'read;write;trust', 'password;authorization_code;refresh_token;implicit;client_credentials', '', 'all', '0', '0', '', 'true');
INSERT INTO `client_details` VALUES ('client1', 'resource02;resource01', 'secret1', 'read;write;trust', 'password;authorization_code;refresh_token;implicit;client_credentials', null, 'all', '0', '0', null, 'false');

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '部门名称',
  `parent` int(11) DEFAULT NULL COMMENT '父类id',
  `insert_by` int(11) NOT NULL COMMENT '添加者',
  `update_by` int(11) NOT NULL COMMENT '修改者',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`id`),
  KEY `department_id_Idx` (`id`),
  KEY `department_name_Idx` (`name`),
  KEY `de_id` (`id`),
  KEY `de_name` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='部门';

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '技术中心', null, '1', '1', '2018-06-26 15:59:59', '2018-06-26 15:59:59');
INSERT INTO `department` VALUES ('2', '行政中心', null, '1', '1', '2018-06-26 16:00:16', '2018-06-26 16:00:16');
INSERT INTO `department` VALUES ('3', '财务中心', null, '1', '1', '2018-06-26 16:00:27', '2018-06-26 16:00:27');
INSERT INTO `department` VALUES ('4', '资质中心', null, '1', '1', '2018-06-26 16:00:42', '2018-06-26 16:00:42');
INSERT INTO `department` VALUES ('5', '物流中心', null, '1', '1', '2018-06-26 16:00:54', '2018-06-26 16:00:54');

-- ----------------------------
-- Table structure for `menu`
-- ----------------------------
DROP TABLE IF EXISTS `menu`;
CREATE TABLE `menu` (
  `menu_id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(50) NOT NULL COMMENT '名称',
  `url` varchar(100) DEFAULT NULL COMMENT '链接地址',
  `icon` varchar(20) DEFAULT NULL COMMENT '图标',
  `parent` int(11) DEFAULT NULL COMMENT '父菜单',
  `order_by` int(3) DEFAULT NULL,
  `insert_by` int(11) NOT NULL COMMENT '创建者',
  `update_by` int(11) NOT NULL COMMENT '修改者',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`menu_id`),
  KEY `shrek_menu_id_Idx` (`menu_id`),
  KEY `shrek_menu_title_Idx` (`title`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='菜单';

-- ----------------------------
-- Records of menu
-- ----------------------------
INSERT INTO `menu` VALUES ('1', '部门管理', null, null, null, '1', '1', '1', '2018-07-18 13:49:52', '2018-07-18 13:49:52');
INSERT INTO `menu` VALUES ('2', '角色管理', null, null, '8', '2', '1', '1', '2018-07-18 13:50:47', '2018-07-18 13:50:47');
INSERT INTO `menu` VALUES ('3', '菜单管理', null, null, '8', '1', '1', '1', '2018-07-18 13:51:16', '2018-07-18 13:51:16');
INSERT INTO `menu` VALUES ('4', '用户管理', null, null, null, '4', '1', '1', '2018-07-18 13:51:43', '2018-07-18 13:51:43');
INSERT INTO `menu` VALUES ('5', '职位管理', null, null, null, '2', '1', '1', '2018-07-18 13:52:02', '2018-07-18 13:52:02');
INSERT INTO `menu` VALUES ('6', '用户信息管理', null, null, null, '3', '1', '1', '2018-07-18 13:53:07', '2018-07-18 13:53:07');
INSERT INTO `menu` VALUES ('7', '权限管理', null, null, '8', '3', '1', '1', '2018-07-18 13:53:36', '2018-07-18 13:53:36');
INSERT INTO `menu` VALUES ('8', '系统管理', null, null, null, '5', '1', '1', '2018-07-18 13:55:57', '2018-07-18 13:55:57');
INSERT INTO `menu` VALUES ('9', '部门列表', null, null, '1', '1', '1', '1', '2018-07-18 13:59:53', '2018-07-18 13:59:53');
INSERT INTO `menu` VALUES ('10', '角色列表', null, null, '2', '1', '1', '1', '2018-07-18 14:00:22', '2018-07-18 14:00:22');
INSERT INTO `menu` VALUES ('11', '菜单列表', null, null, '3', '1', '1', '1', '2018-07-18 14:01:09', '2018-07-18 14:01:09');
INSERT INTO `menu` VALUES ('12', '用户列表', null, null, '4', '1', '1', '1', '2018-07-18 14:01:44', '2018-07-18 14:01:44');
INSERT INTO `menu` VALUES ('13', '职位列表', null, null, '5', '1', '1', '1', '2018-07-18 14:02:12', '2018-07-18 14:02:12');
INSERT INTO `menu` VALUES ('14', '用户信息列表', null, null, '6', '1', '1', '1', '2018-07-18 14:02:40', '2018-07-18 14:02:40');
INSERT INTO `menu` VALUES ('15', '权限列表', null, null, '7', '1', '1', '1', '2018-07-18 14:03:06', '2018-07-18 14:03:06');

-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `permission_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '权限名称',
  `value` varchar(128) DEFAULT NULL COMMENT '链接',
  `parent` int(11) DEFAULT NULL COMMENT '上一层',
  `insert_by` varchar(50) NOT NULL COMMENT '添加者',
  `update_by` varchar(50) NOT NULL COMMENT '修改者',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`permission_id`)
) ENGINE=InnoDB AUTO_INCREMENT=121 DEFAULT CHARSET=utf8 COMMENT='权限表';

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '管理员', '', null, '1', '1', '2018-06-26 17:31:38', '2018-06-26 17:31:38');
INSERT INTO `permission` VALUES ('2', '管理员统计', 'supervisor:countByExample', '1', '1', '1', '2018-06-26 21:19:57', '2018-06-26 21:19:57');
INSERT INTO `permission` VALUES ('3', '管理员删除', 'supervisor:deleteByExample', '1', '1', '1', '2018-06-26 21:20:53', '2018-06-26 21:20:53');
INSERT INTO `permission` VALUES ('4', '管理员主键删除', 'supervisor:deleteByPrimaryKey', '1', '1', '1', '2018-06-26 21:21:43', '2018-06-26 21:21:43');
INSERT INTO `permission` VALUES ('5', '管理员添加', 'supervisor:insert', '1', '1', '1', '2018-06-26 21:22:28', '2018-06-26 21:22:28');
INSERT INTO `permission` VALUES ('6', '管理员参数插入', 'supervisor:insertSelective', '1', '1', '1', '2018-07-18 12:47:47', '2018-07-18 12:47:47');
INSERT INTO `permission` VALUES ('7', '管理员参数查询', 'supervisor:selectByExample', '1', '1', '1', '2018-07-18 12:48:24', '2018-07-18 12:48:24');
INSERT INTO `permission` VALUES ('8', '管理员主键查询', 'supervisor:selectByPrimaryKey', '1', '1', '1', '2018-07-18 12:48:55', '2018-07-18 12:48:55');
INSERT INTO `permission` VALUES ('9', '管理员参数选择更新', 'supervisor:updateByExampleSelective', '1', '1', '1', '2018-07-18 12:51:14', '2018-07-18 12:51:14');
INSERT INTO `permission` VALUES ('10', '管理员选择更新', 'supervisor:updateByExample', '1', '1', '1', '2018-07-18 12:52:05', '2018-07-18 12:52:05');
INSERT INTO `permission` VALUES ('11', '管理员主键选择更新', 'supervisor:updateByPrimaryKeySelective', '1', '1', '1', '2018-07-18 12:52:43', '2018-07-18 12:52:43');
INSERT INTO `permission` VALUES ('12', '管理员主键更新', 'supervisor:updateByPrimaryKey', '1', '1', '1', '2018-07-18 12:53:13', '2018-07-18 12:53:13');
INSERT INTO `permission` VALUES ('13', '部门', '', null, '1', '1', '2018-07-18 12:58:26', '2018-07-18 12:58:26');
INSERT INTO `permission` VALUES ('14', '部门统计', 'department:countByExample', null, '1', '1', '2018-07-18 12:58:26', '2018-07-18 12:58:26');
INSERT INTO `permission` VALUES ('15', '部门删除', 'department:deleteByExample', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('16', '部门主键删除', 'department:deleteByPrimaryKey', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('17', '部门添加', 'department:insert', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('18', '部门参数插入', 'department:insertSelective', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('19', '部门参数查询', 'department:selectByExample', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('20', '部门主键查询', 'department:selectByPrimaryKey', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('21', '部门参数选择更新', 'department:updateByExampleSelective', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('22', '部门选择更新', 'department:updateByExample', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('23', '部门主键选择更新', 'department:updateByPrimaryKeySelective', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('24', '部门主键更新', 'department:updateByPrimaryKey', '13', '1', '1', '2018-07-18 12:58:27', '2018-07-18 12:58:27');
INSERT INTO `permission` VALUES ('25', '菜单', '', null, '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('26', '菜单统计', 'menu:countByExample', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('27', '菜单删除', 'menu:deleteByExample', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('28', '菜单主键删除', 'menu:deleteByPrimaryKey', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('29', '菜单添加', 'menu:insert', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('30', '菜单参数插入', 'menu:insertSelective', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('31', '菜单参数查询', 'menu:selectByExample', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('32', '菜单主键查询', 'menu:selectByPrimaryKey', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('33', '菜单参数选择更新', 'menu:updateByExampleSelective', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('34', '菜单选择更新', 'menu:updateByExample', '25', '1', '1', '2018-07-18 13:01:59', '2018-07-18 13:01:59');
INSERT INTO `permission` VALUES ('35', '菜单主键选择更新', 'menu:updateByPrimaryKeySelective', '25', '1', '1', '2018-07-18 13:02:00', '2018-07-18 13:02:00');
INSERT INTO `permission` VALUES ('36', '菜单主键更新', 'menu:updateByPrimaryKey', '25', '1', '1', '2018-07-18 13:02:00', '2018-07-18 13:02:00');
INSERT INTO `permission` VALUES ('37', '权限', '', null, '1', '1', '2018-07-18 13:04:00', '2018-07-18 13:04:00');
INSERT INTO `permission` VALUES ('38', '权限统计', 'permission:countByExample', '37', '1', '1', '2018-07-18 13:04:00', '2018-07-18 13:04:00');
INSERT INTO `permission` VALUES ('39', '权限删除', 'permission:deleteByExample', '37', '1', '1', '2018-07-18 13:04:00', '2018-07-18 13:04:00');
INSERT INTO `permission` VALUES ('40', '权限主键删除', 'permission:deleteByPrimaryKey', '37', '1', '1', '2018-07-18 13:04:00', '2018-07-18 13:04:00');
INSERT INTO `permission` VALUES ('41', '权限添加', 'permission:insert', '37', '1', '1', '2018-07-18 13:04:00', '2018-07-18 13:04:00');
INSERT INTO `permission` VALUES ('42', '权限参数插入', 'permission:insertSelective', '37', '1', '1', '2018-07-18 13:04:00', '2018-07-18 13:04:00');
INSERT INTO `permission` VALUES ('43', '权限参数查询', 'permission:selectByExample', '37', '1', '1', '2018-07-18 13:04:01', '2018-07-18 13:04:01');
INSERT INTO `permission` VALUES ('44', '权限主键查询', 'permission:selectByPrimaryKey', '37', '1', '1', '2018-07-18 13:04:01', '2018-07-18 13:04:01');
INSERT INTO `permission` VALUES ('45', '权限参数选择更新', 'permission:updateByExampleSelective', '37', '1', '1', '2018-07-18 13:04:01', '2018-07-18 13:04:01');
INSERT INTO `permission` VALUES ('46', '权限选择更新', 'permission:updateByExample', '37', '1', '1', '2018-07-18 13:04:01', '2018-07-18 13:04:01');
INSERT INTO `permission` VALUES ('47', '权限主键选择更新', 'permission:updateByPrimaryKeySelective', '37', '1', '1', '2018-07-18 13:04:01', '2018-07-18 13:04:01');
INSERT INTO `permission` VALUES ('48', '权限主键更新', 'permission:updateByPrimaryKey', '37', '1', '1', '2018-07-18 13:04:01', '2018-07-18 13:04:01');
INSERT INTO `permission` VALUES ('49', '职位', '', null, '1', '1', '2018-07-18 13:10:12', '2018-07-18 13:10:12');
INSERT INTO `permission` VALUES ('50', '职位统计', 'position:countByExample', '49', '1', '1', '2018-07-18 13:10:12', '2018-07-18 13:10:12');
INSERT INTO `permission` VALUES ('51', '职位删除', 'position:deleteByExample', '49', '1', '1', '2018-07-18 13:10:12', '2018-07-18 13:10:12');
INSERT INTO `permission` VALUES ('52', '职位主键删除', 'position:deleteByPrimaryKey', '49', '1', '1', '2018-07-18 13:10:12', '2018-07-18 13:10:12');
INSERT INTO `permission` VALUES ('53', '职位添加', 'position:insert', '49', '1', '1', '2018-07-18 13:10:12', '2018-07-18 13:10:12');
INSERT INTO `permission` VALUES ('54', '职位参数插入', 'position:insertSelective', '49', '1', '1', '2018-07-18 13:10:13', '2018-07-18 13:10:13');
INSERT INTO `permission` VALUES ('55', '职位参数查询', 'position:selectByExample', '49', '1', '1', '2018-07-18 13:10:13', '2018-07-18 13:10:13');
INSERT INTO `permission` VALUES ('56', '职位主键查询', 'position:selectByPrimaryKey', '49', '1', '1', '2018-07-18 13:10:13', '2018-07-18 13:10:13');
INSERT INTO `permission` VALUES ('57', '职位参数选择更新', 'position:updateByExampleSelective', '49', '1', '1', '2018-07-18 13:10:13', '2018-07-18 13:10:13');
INSERT INTO `permission` VALUES ('58', '职位选择更新', 'position:updateByExample', '49', '1', '1', '2018-07-18 13:10:13', '2018-07-18 13:10:13');
INSERT INTO `permission` VALUES ('59', '职位主键选择更新', 'position:updateByPrimaryKeySelective', '49', '1', '1', '2018-07-18 13:10:13', '2018-07-18 13:10:13');
INSERT INTO `permission` VALUES ('60', '职位主键更新', 'position:updateByPrimaryKey', '49', '1', '1', '2018-07-18 13:10:13', '2018-07-18 13:10:13');
INSERT INTO `permission` VALUES ('61', '角色', '', null, '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('62', '角色统计', 'role:countByExample', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('63', '角色删除', 'role:deleteByExample', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('64', '角色主键删除', 'role:deleteByPrimaryKey', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('65', '角色添加', 'role:insert', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('66', '角色参数插入', 'role:insertSelective', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('67', '角色参数查询', 'role:selectByExample', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('68', '角色主键查询', 'role:selectByPrimaryKey', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('69', '角色参数选择更新', 'role:updateByExampleSelective', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('70', '角色选择更新', 'role:updateByExample', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('71', '角色主键选择更新', 'role:updateByPrimaryKeySelective', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('72', '角色主键更新', 'role:updateByPrimaryKey', '61', '1', '1', '2018-07-18 13:12:35', '2018-07-18 13:12:35');
INSERT INTO `permission` VALUES ('73', '角色菜单', '', null, '1', '1', '2018-07-18 13:16:50', '2018-07-18 13:16:50');
INSERT INTO `permission` VALUES ('74', '角色菜单统计', 'roleMenu:countByExample', '73', '1', '1', '2018-07-18 13:16:50', '2018-07-18 13:16:50');
INSERT INTO `permission` VALUES ('75', '角色菜单删除', 'roleMenu:deleteByExample', '73', '1', '1', '2018-07-18 13:16:50', '2018-07-18 13:16:50');
INSERT INTO `permission` VALUES ('76', '角色菜单主键删除', 'roleMenu:deleteByPrimaryKey', '73', '1', '1', '2018-07-18 13:16:50', '2018-07-18 13:16:50');
INSERT INTO `permission` VALUES ('77', '角色菜单添加', 'roleMenu:insert', '73', '1', '1', '2018-07-18 13:16:50', '2018-07-18 13:16:50');
INSERT INTO `permission` VALUES ('78', '角色菜单参数插入', 'roleMenu:insertSelective', '73', '1', '1', '2018-07-18 13:16:51', '2018-07-18 13:16:51');
INSERT INTO `permission` VALUES ('79', '角色菜单参数查询', 'roleMenu:selectByExample', '73', '1', '1', '2018-07-18 13:16:51', '2018-07-18 13:16:51');
INSERT INTO `permission` VALUES ('80', '角色菜单主键查询', 'roleMenu:selectByPrimaryKey', '73', '1', '1', '2018-07-18 13:16:51', '2018-07-18 13:16:51');
INSERT INTO `permission` VALUES ('81', '角色菜单参数选择更新', 'roleMenu:updateByExampleSelective', '73', '1', '1', '2018-07-18 13:16:51', '2018-07-18 13:16:51');
INSERT INTO `permission` VALUES ('82', '角色菜单选择更新', 'roleMenu:updateByExample', '73', '1', '1', '2018-07-18 13:16:51', '2018-07-18 13:16:51');
INSERT INTO `permission` VALUES ('83', '角色菜单主键选择更新', 'roleMenu:updateByPrimaryKeySelective', '73', '1', '1', '2018-07-18 13:16:51', '2018-07-18 13:16:51');
INSERT INTO `permission` VALUES ('84', '角色菜单主键更新', 'roleMenu:updateByPrimaryKey', '73', '1', '1', '2018-07-18 13:16:51', '2018-07-18 13:16:51');
INSERT INTO `permission` VALUES ('85', '角色权限', '', null, '1', '1', '2018-07-18 13:19:01', '2018-07-18 13:19:01');
INSERT INTO `permission` VALUES ('86', '角色权限统计', 'rolePermission:countByExample', '85', '1', '1', '2018-07-18 13:19:01', '2018-07-18 13:19:01');
INSERT INTO `permission` VALUES ('87', '角色权限删除', 'rolePermission:deleteByExample', '85', '1', '1', '2018-07-18 13:19:01', '2018-07-18 13:19:01');
INSERT INTO `permission` VALUES ('88', '角色权限主键删除', 'rolePermission:deleteByPrimaryKey', '85', '1', '1', '2018-07-18 13:19:01', '2018-07-18 13:19:01');
INSERT INTO `permission` VALUES ('89', '角色权限添加', 'rolePermission:insert', '85', '1', '1', '2018-07-18 13:19:02', '2018-07-18 13:19:02');
INSERT INTO `permission` VALUES ('90', '角色权限参数插入', 'rolePermission:insertSelective', '85', '1', '1', '2018-07-18 13:19:02', '2018-07-18 13:19:02');
INSERT INTO `permission` VALUES ('91', '角色权限参数查询', 'rolePermission:selectByExample', '85', '1', '1', '2018-07-18 13:19:02', '2018-07-18 13:19:02');
INSERT INTO `permission` VALUES ('92', '角色权限主键查询', 'rolePermission:selectByPrimaryKey', '85', '1', '1', '2018-07-18 13:19:02', '2018-07-18 13:19:02');
INSERT INTO `permission` VALUES ('93', '角色权限参数选择更新', 'rolePermission:updateByExampleSelective', '85', '1', '1', '2018-07-18 13:19:02', '2018-07-18 13:19:02');
INSERT INTO `permission` VALUES ('94', '角色权限选择更新', 'rolePermission:updateByExample', '85', '1', '1', '2018-07-18 13:19:02', '2018-07-18 13:19:02');
INSERT INTO `permission` VALUES ('95', '角色权限主键选择更新', 'rolePermission:updateByPrimaryKeySelective', '85', '1', '1', '2018-07-18 13:19:02', '2018-07-18 13:19:02');
INSERT INTO `permission` VALUES ('96', '角色权限主键更新', 'rolePermission:updateByPrimaryKey', '85', '1', '1', '2018-07-18 13:19:02', '2018-07-18 13:19:02');
INSERT INTO `permission` VALUES ('97', '管理员图片', '', null, '1', '1', '2018-07-18 13:21:43', '2018-07-18 13:21:43');
INSERT INTO `permission` VALUES ('98', '管理员图片统计', 'supervisorImage:countByExample', '97', '1', '1', '2018-07-18 13:21:43', '2018-07-18 13:21:43');
INSERT INTO `permission` VALUES ('99', '管理员图片删除', 'supervisorImage:deleteByExample', '97', '1', '1', '2018-07-18 13:21:43', '2018-07-18 13:21:43');
INSERT INTO `permission` VALUES ('100', '管理员图片主键删除', 'supervisorImage:deleteByPrimaryKey', '97', '1', '1', '2018-07-18 13:21:43', '2018-07-18 13:21:43');
INSERT INTO `permission` VALUES ('101', '管理员图片添加', 'supervisorImage:insert', '97', '1', '1', '2018-07-18 13:21:44', '2018-07-18 13:21:44');
INSERT INTO `permission` VALUES ('102', '管理员图片参数插入', 'supervisorImage:insertSelective', '97', '1', '1', '2018-07-18 13:21:44', '2018-07-18 13:21:44');
INSERT INTO `permission` VALUES ('103', '管理员图片参数查询', 'supervisorImage:selectByExample', '97', '1', '1', '2018-07-18 13:21:44', '2018-07-18 13:21:44');
INSERT INTO `permission` VALUES ('104', '管理员图片主键查询', 'supervisorImage:selectByPrimaryKey', '97', '1', '1', '2018-07-18 13:21:44', '2018-07-18 13:21:44');
INSERT INTO `permission` VALUES ('105', '管理员图片参数选择更新', 'supervisorImage:updateByExampleSelective', '97', '1', '1', '2018-07-18 13:21:44', '2018-07-18 13:21:44');
INSERT INTO `permission` VALUES ('106', '管理员图片选择更新', 'supervisorImage:updateByExample', '97', '1', '1', '2018-07-18 13:21:44', '2018-07-18 13:21:44');
INSERT INTO `permission` VALUES ('107', '管理员图片主键选择更新', 'supervisorImage:updateByPrimaryKeySelective', '97', '1', '1', '2018-07-18 13:21:44', '2018-07-18 13:21:44');
INSERT INTO `permission` VALUES ('108', '管理员图片主键更新', 'supervisorImage:updateByPrimaryKey', '97', '1', '1', '2018-07-18 13:21:44', '2018-07-18 13:21:44');
INSERT INTO `permission` VALUES ('109', '管理员信息', '', null, '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('110', '管理员信息统计', 'supervisorInfo:countByExample', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('111', '管理员信息删除', 'supervisorInfo:deleteByExample', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('112', '管理员信息主键删除', 'supervisorInfo:deleteByPrimaryKey', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('113', '管理员信息添加', 'supervisorInfo:insert', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('114', '管理员信息参数插入', 'supervisorInfo:insertSelective', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('115', '管理员信息参数查询', 'supervisorInfo:selectByExample', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('116', '管理员信息主键查询', 'supervisorInfo:selectByPrimaryKey', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('117', '管理员信息参数选择更新', 'supervisorInfo:updateByExampleSelective', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('118', '管理员信息选择更新', 'supervisorInfo:updateByExample', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('119', '管理员信息主键选择更新', 'supervisorInfo:updateByPrimaryKeySelective', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');
INSERT INTO `permission` VALUES ('120', '管理员信息主键更新', 'supervisorInfo:updateByPrimaryKey', '109', '1', '1', '2018-07-18 13:23:55', '2018-07-18 13:23:55');

-- ----------------------------
-- Table structure for `position`
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `position_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `department_id` int(11) NOT NULL COMMENT '部门',
  `parent` int(11) DEFAULT NULL COMMENT '父级',
  `insert_by` int(11) NOT NULL COMMENT '添加者',
  `update_by` int(11) NOT NULL COMMENT '更新者',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`position_id`),
  KEY `shrek_role_department_id_Idx` (`department_id`),
  KEY `shrek_role_id_Idx` (`position_id`),
  KEY `shrek_role_name_Idx` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '信息技术总监', '1', null, '1', '1', '2018-06-26 15:59:11', '2018-06-26 15:59:11');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `name` varchar(50) NOT NULL COMMENT '名称',
  `value` varchar(50) DEFAULT NULL,
  `department_id` int(11) NOT NULL COMMENT '部门',
  `insert_by` int(11) NOT NULL COMMENT '添加者',
  `update_by` int(11) NOT NULL COMMENT '更新者',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '更新时间',
  PRIMARY KEY (`role_id`),
  KEY `shrek_role_department_id_Idx` (`department_id`),
  KEY `shrek_role_id_Idx` (`role_id`),
  KEY `shrek_role_name_Idx` (`name`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='角色';

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '超级管理员', 'role_supervisor', '1', '1', '1', '2018-06-26 15:59:11', '2018-06-26 15:59:11');

-- ----------------------------
-- Table structure for `role_menu`
-- ----------------------------
DROP TABLE IF EXISTS `role_menu`;
CREATE TABLE `role_menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `menu_id` int(11) NOT NULL COMMENT '菜单id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8 COMMENT='角色菜单';

-- ----------------------------
-- Records of role_menu
-- ----------------------------
INSERT INTO `role_menu` VALUES ('1', '1', '1');
INSERT INTO `role_menu` VALUES ('2', '1', '2');
INSERT INTO `role_menu` VALUES ('3', '1', '3');
INSERT INTO `role_menu` VALUES ('4', '1', '4');
INSERT INTO `role_menu` VALUES ('5', '1', '5');
INSERT INTO `role_menu` VALUES ('6', '1', '6');
INSERT INTO `role_menu` VALUES ('7', '1', '7');
INSERT INTO `role_menu` VALUES ('8', '1', '8');
INSERT INTO `role_menu` VALUES ('9', '1', '9');
INSERT INTO `role_menu` VALUES ('10', '1', '10');
INSERT INTO `role_menu` VALUES ('11', '1', '11');
INSERT INTO `role_menu` VALUES ('12', '1', '12');
INSERT INTO `role_menu` VALUES ('13', '1', '13');
INSERT INTO `role_menu` VALUES ('14', '1', '14');
INSERT INTO `role_menu` VALUES ('15', '1', '15');

-- ----------------------------
-- Table structure for `role_permission`
-- ----------------------------
DROP TABLE IF EXISTS `role_permission`;
CREATE TABLE `role_permission` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  `permission_id` int(11) NOT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=104 DEFAULT CHARSET=utf8 COMMENT='角色权限表';

-- ----------------------------
-- Records of role_permission
-- ----------------------------
INSERT INTO `role_permission` VALUES ('1', '1', '2');
INSERT INTO `role_permission` VALUES ('2', '1', '3');
INSERT INTO `role_permission` VALUES ('3', '1', '4');
INSERT INTO `role_permission` VALUES ('4', '1', '5');
INSERT INTO `role_permission` VALUES ('5', '1', '6');
INSERT INTO `role_permission` VALUES ('6', '1', '7');
INSERT INTO `role_permission` VALUES ('7', '1', '8');
INSERT INTO `role_permission` VALUES ('8', '1', '9');
INSERT INTO `role_permission` VALUES ('9', '1', '10');
INSERT INTO `role_permission` VALUES ('10', '1', '11');
INSERT INTO `role_permission` VALUES ('11', '1', '12');
INSERT INTO `role_permission` VALUES ('12', '1', '14');
INSERT INTO `role_permission` VALUES ('13', '1', '15');
INSERT INTO `role_permission` VALUES ('14', '1', '16');
INSERT INTO `role_permission` VALUES ('15', '1', '17');
INSERT INTO `role_permission` VALUES ('16', '1', '18');
INSERT INTO `role_permission` VALUES ('17', '1', '19');
INSERT INTO `role_permission` VALUES ('18', '1', '20');
INSERT INTO `role_permission` VALUES ('19', '1', '21');
INSERT INTO `role_permission` VALUES ('20', '1', '22');
INSERT INTO `role_permission` VALUES ('21', '1', '23');
INSERT INTO `role_permission` VALUES ('22', '1', '24');
INSERT INTO `role_permission` VALUES ('23', '1', '26');
INSERT INTO `role_permission` VALUES ('24', '1', '27');
INSERT INTO `role_permission` VALUES ('25', '1', '28');
INSERT INTO `role_permission` VALUES ('26', '1', '29');
INSERT INTO `role_permission` VALUES ('27', '1', '30');
INSERT INTO `role_permission` VALUES ('28', '1', '31');
INSERT INTO `role_permission` VALUES ('29', '1', '32');
INSERT INTO `role_permission` VALUES ('30', '1', '33');
INSERT INTO `role_permission` VALUES ('31', '1', '34');
INSERT INTO `role_permission` VALUES ('32', '1', '35');
INSERT INTO `role_permission` VALUES ('33', '1', '36');
INSERT INTO `role_permission` VALUES ('34', '1', '38');
INSERT INTO `role_permission` VALUES ('35', '1', '39');
INSERT INTO `role_permission` VALUES ('36', '1', '40');
INSERT INTO `role_permission` VALUES ('37', '1', '41');
INSERT INTO `role_permission` VALUES ('38', '1', '42');
INSERT INTO `role_permission` VALUES ('39', '1', '43');
INSERT INTO `role_permission` VALUES ('40', '1', '44');
INSERT INTO `role_permission` VALUES ('41', '1', '45');
INSERT INTO `role_permission` VALUES ('42', '1', '46');
INSERT INTO `role_permission` VALUES ('43', '1', '47');
INSERT INTO `role_permission` VALUES ('44', '1', '48');
INSERT INTO `role_permission` VALUES ('45', '1', '50');
INSERT INTO `role_permission` VALUES ('46', '1', '51');
INSERT INTO `role_permission` VALUES ('47', '1', '52');
INSERT INTO `role_permission` VALUES ('48', '1', '53');
INSERT INTO `role_permission` VALUES ('49', '1', '54');
INSERT INTO `role_permission` VALUES ('50', '1', '55');
INSERT INTO `role_permission` VALUES ('51', '1', '56');
INSERT INTO `role_permission` VALUES ('52', '1', '57');
INSERT INTO `role_permission` VALUES ('53', '1', '58');
INSERT INTO `role_permission` VALUES ('54', '1', '59');
INSERT INTO `role_permission` VALUES ('55', '1', '60');
INSERT INTO `role_permission` VALUES ('56', '1', '62');
INSERT INTO `role_permission` VALUES ('57', '1', '63');
INSERT INTO `role_permission` VALUES ('58', '1', '64');
INSERT INTO `role_permission` VALUES ('59', '1', '65');
INSERT INTO `role_permission` VALUES ('60', '1', '66');
INSERT INTO `role_permission` VALUES ('61', '1', '67');
INSERT INTO `role_permission` VALUES ('62', '1', '68');
INSERT INTO `role_permission` VALUES ('63', '1', '69');
INSERT INTO `role_permission` VALUES ('64', '1', '70');
INSERT INTO `role_permission` VALUES ('65', '1', '71');
INSERT INTO `role_permission` VALUES ('66', '1', '72');
INSERT INTO `role_permission` VALUES ('67', '1', '74');
INSERT INTO `role_permission` VALUES ('68', '1', '75');
INSERT INTO `role_permission` VALUES ('69', '1', '76');
INSERT INTO `role_permission` VALUES ('70', '1', '77');
INSERT INTO `role_permission` VALUES ('71', '1', '78');
INSERT INTO `role_permission` VALUES ('72', '1', '79');
INSERT INTO `role_permission` VALUES ('73', '1', '80');
INSERT INTO `role_permission` VALUES ('74', '1', '81');
INSERT INTO `role_permission` VALUES ('75', '1', '82');
INSERT INTO `role_permission` VALUES ('76', '1', '83');
INSERT INTO `role_permission` VALUES ('77', '1', '84');
INSERT INTO `role_permission` VALUES ('78', '1', '86');
INSERT INTO `role_permission` VALUES ('79', '1', '87');
INSERT INTO `role_permission` VALUES ('80', '1', '88');
INSERT INTO `role_permission` VALUES ('81', '1', '89');
INSERT INTO `role_permission` VALUES ('82', '1', '90');
INSERT INTO `role_permission` VALUES ('83', '1', '91');
INSERT INTO `role_permission` VALUES ('84', '1', '92');
INSERT INTO `role_permission` VALUES ('85', '1', '93');
INSERT INTO `role_permission` VALUES ('86', '1', '94');
INSERT INTO `role_permission` VALUES ('87', '1', '95');
INSERT INTO `role_permission` VALUES ('88', '1', '96');
INSERT INTO `role_permission` VALUES ('89', '1', '98');
INSERT INTO `role_permission` VALUES ('90', '1', '99');
INSERT INTO `role_permission` VALUES ('91', '1', '100');
INSERT INTO `role_permission` VALUES ('92', '1', '101');
INSERT INTO `role_permission` VALUES ('93', '1', '102');
INSERT INTO `role_permission` VALUES ('94', '1', '103');
INSERT INTO `role_permission` VALUES ('95', '1', '104');
INSERT INTO `role_permission` VALUES ('96', '1', '105');
INSERT INTO `role_permission` VALUES ('97', '1', '106');
INSERT INTO `role_permission` VALUES ('98', '1', '107');
INSERT INTO `role_permission` VALUES ('99', '1', '108');
INSERT INTO `role_permission` VALUES ('100', '1', '110');
INSERT INTO `role_permission` VALUES ('101', '1', '111');
INSERT INTO `role_permission` VALUES ('102', '1', '112');
INSERT INTO `role_permission` VALUES ('103', '1', '113');

-- ----------------------------
-- Table structure for `supervisor`
-- ----------------------------
DROP TABLE IF EXISTS `supervisor`;
CREATE TABLE `supervisor` (
  `supervisor_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `username` varchar(50) NOT NULL COMMENT '登录名',
  `passwd` varchar(128) NOT NULL COMMENT '密码',
  `status` int(11) NOT NULL DEFAULT '1' COMMENT '状态:0:锁定 1:正常 2:销毁',
  `department_id` int(11) DEFAULT NULL COMMENT '部门id',
  `insert_by` int(11) NOT NULL COMMENT '添加者',
  `update_by` int(11) NOT NULL COMMENT '修改者',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`supervisor_id`),
  KEY `supervisor_Id_Idx` (`supervisor_id`),
  KEY `supervisor_status_Idx` (`status`),
  KEY `supervisor_username_Idx` (`username`),
  KEY `su_id` (`supervisor_id`),
  KEY `su_name` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员';

-- ----------------------------
-- Records of supervisor
-- ----------------------------
INSERT INTO `supervisor` VALUES ('1', 'supervisor', 'b614028d165ecbe3ce13e2bbcdba4086', '1', '1', '1', '1', '2018-06-26 21:38:12', '2018-06-26 21:38:12');

-- ----------------------------
-- Table structure for `supervisor_image`
-- ----------------------------
DROP TABLE IF EXISTS `supervisor_image`;
CREATE TABLE `supervisor_image` (
  `supervisor_image_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `supervisor_id` int(11) NOT NULL COMMENT '用户员id',
  `images_type` int(11) NOT NULL COMMENT '图片类型',
  `images_url` varchar(100) NOT NULL COMMENT '图片地址',
  `display_order` int(11) NOT NULL COMMENT '图片排序',
  `images_desc` varchar(50) DEFAULT NULL COMMENT '图片描述',
  `insert_by` varchar(50) NOT NULL COMMENT '添加者',
  `update_by` int(11) NOT NULL COMMENT '更新者',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`supervisor_image_id`),
  KEY `supervisor_image_id_Idx` (`supervisor_image_id`),
  KEY `supervisor_image_supervisor_id_Idx` (`supervisor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='图片存储表';

-- ----------------------------
-- Records of supervisor_image
-- ----------------------------

-- ----------------------------
-- Table structure for `supervisor_info`
-- ----------------------------
DROP TABLE IF EXISTS `supervisor_info`;
CREATE TABLE `supervisor_info` (
  `supervisor_info_id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `nickname` varchar(50) NOT NULL COMMENT '昵称',
  `real_name` varchar(50) DEFAULT NULL COMMENT '真实名字',
  `position` int(11) DEFAULT NULL COMMENT '职位',
  `email` varchar(50) NOT NULL COMMENT '电子邮件',
  `qq` varchar(30) DEFAULT NULL COMMENT 'qq',
  `wx` varchar(30) DEFAULT NULL COMMENT '微信',
  `phone` varchar(30) DEFAULT NULL COMMENT '号码',
  `image_url` varchar(100) DEFAULT NULL COMMENT '头像',
  `school` varchar(60) DEFAULT NULL COMMENT '毕业院校',
  `gender` int(11) DEFAULT NULL COMMENT '性别',
  `birth_date` datetime DEFAULT NULL COMMENT '生日',
  `insert_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '添加时间',
  `update_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '修改时间',
  PRIMARY KEY (`supervisor_info_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='管理员信息';

-- ----------------------------
-- Records of supervisor_info
-- ----------------------------
INSERT INTO `supervisor_info` VALUES ('1', 'shrek', 'shrek', '1', '13326465230@163.com', '1300160339', 'shrek1332', '13326465230', '11111111111', 'GXUT', '1', '2018-07-18 13:38:59', '2018-07-18 13:39:15', '2018-07-18 13:39:15');

-- ----------------------------
-- Table structure for `supervisor_role`
-- ----------------------------
DROP TABLE IF EXISTS `supervisor_role`;
CREATE TABLE `supervisor_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `supervisor_id` int(11) NOT NULL COMMENT '权限id',
  `role_id` int(11) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='角色权限表';

-- ----------------------------
-- Records of supervisor_role
-- ----------------------------
INSERT INTO `supervisor_role` VALUES ('1', '1', '1');
