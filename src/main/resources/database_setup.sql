/* ORACLE 10G DB */
CREATE DATABASE studentdb;

CREATE TABLE student(id NUMBER, name VARCHAR(20), branch VARCHAR(20), photo BLOB, premium_basic NUMBER, ispeps NUMBER);

INSERT INTO student VALUES(1, 'srikanth', 'IT', 'abc', 0, 0);