CREATE DATABASE discograficaLuisRioja;

USE discograficaLuisRioja;

CREATE TABLE album(
	id int NOT NULL AUTO_INCREMENT,
    titulo varchar(30) DEFAULT NULL,
    autor varchar(30) DEFAULT NULL,
    numero_canciones int DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE canciones(
	id int NOT NULL AUTO_INCREMENT,
    titulo varchar(30) DEFAULT NULL,
    autor varchar(30) DEFAULT NULL,
    duracion TIME(6) DEFAULT NULL,
    PRIMARY KEY (id)
);

INSERT INTO album (titulo, autor, numero_canciones) VALUES ("Flags","Coldplay", 2), ("City of Stars","Lofi Fruits", 10), ("Reprise Rarities","Frank Sinatra", 5), ("Atom Bomb Baby","The Five Stars", 12);

INSERT INTO canciones (titulo, autor, duracion) VALUES ("Paradise","Coldplay", "00:04:39"), ("Sunset","Lofi Fruits", "00:02:49"), ("My Way","Frank Sinatra", "00:04:37"), ("Atom Bomb Baby","The Five Stars", "00:02:17");