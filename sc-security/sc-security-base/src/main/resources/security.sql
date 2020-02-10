
DROP DATABASE IF EXISTS DB_SC_Security ;
CREATE DATABASE DB_SC_Security CHARACTER  SET = utf8mb4 COLLATE = utf8mb4_unicode_ci;
USE DB_SC_Security;

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;



INSERT INTO user (id, username, password) VALUES (1, 'nie-dongjia', '123456');
INSERT INTO user (id, username, password)  VALUES (2, 'admin', '123456');

INSERT INTO role (id, name) VALUES (1, 'ROLE_USER');
INSERT INTO role (id, name) VALUES (2, 'ROLE_ADMIN');

INSERT INTO user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO user_role (user_id, role_id) VALUES (2, 2);