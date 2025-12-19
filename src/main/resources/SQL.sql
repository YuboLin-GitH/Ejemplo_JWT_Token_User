DROP DATABASE IF EXISTS apiuser;
CREATE DATABASE apiuser;
USE apiuser;
CREATE TABLE  apiuser (
                       id integer auto_increment PRIMARY KEY,
                       user VARCHAR(20),
                       password VARCHAR(64) NOT NULL


)  ENGINE=InnoDB  DEFAULT CHARSET=utf8mb4 AUTO_INCREMENT=1 ;


INSERT INTO apiuser  VALUES (1, "juan", SHA2("juan",256));