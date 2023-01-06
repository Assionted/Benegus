// 创建数据表
CREATE TABLE `account` (
  id int(11) NOT NULL PRIMARY KEY AUTO_INCREMENT COMMIT '自增主键',
  name VARCHAR(30),
  money double 
);

ALTER TABLE `account` AUTO_INCREMENT = 1001;
