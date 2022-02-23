CREATE TABLE ADDRESS (
    ID   INTEGER      NOT NULL AUTO_INCREMENT,
    CITY VARCHAR(128) NOT NULL,
	POST_CODE INTEGER NOT NULL,
	STATE VARCHAR(128) NOT NULL,
	STREET VARCHAR(128) NOT NULL,
    PRIMARY KEY (id)
);

insert into ADDRESS values (1, 'Sydney', 2148, 'NSW', 'Martin');
insert into ADDRESS values (2, 'Melbourne', 2148, 'NSW', 'Martin');
insert into ADDRESS values (3, 'perth', 2148, 'NSW', 'Martin');
insert into ADDRESS values (4, 'darwin', 2148, 'NSW', 'Martin');
insert into ADDRESS values (5, 'brisbane', 2148, 'NSW', 'Martin');



Create table USER_DETAILS (
 ID   INTEGER   NOT NULL AUTO_INCREMENT,
 FIRST_NAME VARCHAR(128) NOT NULL,
 GENDER VARCHAR(128) NOT NULL,
 LAST_NAME VARCHAR(128) NOT NULL,
 TITLE VARCHAR(128) NOT NULL,
 ADDRESS_ID INTEGER NOT NULL );
 
 
insert into USER_DETAILS values (1, 'Daniel', 'M', 'Pinto', 'MR' ,1);
insert into USER_DETAILS values (2, 'Martin', 'M', 'Pinto', 'MR' ,2);
insert into USER_DETAILS values (3, 'James', 'M', 'Pinto', 'MR' ,3);
insert into USER_DETAILS values (4, 'John', 'M', 'Pinto', 'MR' ,4);
insert into USER_DETAILS values (5, 'Derick', 'M', 'Pinto', 'MR' ,5);