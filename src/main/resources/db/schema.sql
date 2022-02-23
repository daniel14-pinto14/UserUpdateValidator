CREATE TABLE ADDRESS (
                         ID   INTEGER      NOT NULL,
                         CITY VARCHAR(128) ,
                         POST_CODE INTEGER ,
                         STATE VARCHAR(128) ,
                         STREET VARCHAR(128),
                         PRIMARY KEY (id)
);


Create table USER_DETAILS (
                              ID   INTEGER   NOT NULL,
                              FIRST_NAME VARCHAR(128) ,
                              GENDER VARCHAR(128) ,
                              LAST_NAME VARCHAR(128) ,
                              TITLE VARCHAR(128) ,
                              ADDRESS_ID INTEGER );
