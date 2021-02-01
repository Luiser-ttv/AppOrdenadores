CREATE DATABASE discograficaLuisRioja;

USE discograficaLuisRioja;

CREATE TABLE album(
	id int NOT NULL AUTO_INCREMENT,
    titulo varchar(30) DEFAULT NULL,
    autor varchar(30) DEFAULT NULL,
    PRIMARY KEY (id)
);