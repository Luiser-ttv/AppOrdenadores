CREATE DATABASE discograficaLuisRioja;

USE discograficaLuisRioja;

CREATE TABLE album(
	id INT NOT NULL,
    titulo varchar(30) DEFAULT NULL,
    autor varchar(30) DEFAULT NULL,
    PRIMARY KEY (id)
);