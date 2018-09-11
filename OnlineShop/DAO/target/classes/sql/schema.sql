CREATE TABLE USERS (
    ID NUMBER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    FIRST_NAME VARCHAR(32) NOT NULL,
    LAST_NAME VARCHAR(32) NOT NULL,
    AGE NUMBER
);

CREATE TABLE PRODUCTS (
    ID NUMBER NOT NULL PRIMARY KEY AUTO_INCREMENT,
    NAME VARCHAR(32) NOT NULL,
    CATEGORY VARCHAR(32) NOT NULL,
    COUNT NUMBER
    PRICE NUMBER NOT NULL,
);