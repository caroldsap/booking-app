DROP ALL OBJECTS;

CREATE TABLE BOOKING (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  city_id INT NOT NULL,
  service_booked_date_time TIMESTAMP,

  service_task_id INT NOT NULL,
  payment_type INT NOT NULL,
  payment_status INT NOT NULL,
  last_modified_date_time TIMESTAMP,
  BOOKED_BY_ID INT NOT NULL

);




CREATE TABLE CITY (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  name varchar(250)
);



CREATE TABLE USERDETAILS (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  first_name varchar(250) NOT NULL,
  last_name varchar(250) NOT NULL,
  user_type INT NOT NULL
);



CREATE TABLE SERVICE (
  id INT AUTO_INCREMENT  PRIMARY KEY,
  SERVICE_NAME varchar(250) NOT NULL,
  SERVICE_TYPE INT NOT NULL
);

INSERT INTO CITY VALUES(1,'CHENNAI');
INSERT INTO CITY VALUES(2,'BANGALORE');
INSERT INTO CITY VALUES(3,'DELHI');
INSERT INTO CITY VALUES(4,'MUMBAI');


INSERT INTO USERDETAILS VALUES(100,'Preethi','Jose',1);
INSERT INTO USERDETAILS VALUES(101,'Jose','Ajith',1);
INSERT INTO USERDETAILS VALUES(102,'Carol','Albert',2);
INSERT INTO USERDETAILS VALUES(103,'Rani','Raja',3);

INSERT INTO SERVICE VALUES(10,'Full House Cleaning',1);
INSERT INTO SERVICE VALUES(20,'Water Leakages',2);
INSERT INTO SERVICE VALUES(30,'Fixing Lights',3);
INSERT INTO SERVICE VALUES(40,'Salon',3);

COMMIT WORK;
