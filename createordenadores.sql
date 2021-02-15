CREATE DATABASE ordenadoresLuisRioja;

USE ordenadoresLuisRioja;

CREATE TABLE marcas(
	id_marcas int NOT NULL AUTO_INCREMENT,
    nombre varchar(30) DEFAULT NULL,
    PRIMARY KEY (id_marcas)
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;


CREATE TABLE componentes(
	id_componentes int NOT NULL AUTO_INCREMENT,
    procesador varchar(30) DEFAULT NULL,
    disipador varchar(30) DEFAULT NULL,
    placa_base varchar(30) DEFAULT NULL,
    tarjeta_grafica varchar(30) DEFAULT NULL,
    torre varchar(30) DEFAULT NULL,
    marcas_componentes int NOT NULL,
    PRIMARY KEY (id_componentes),
    FOREIGN KEY (`marcas_componentes`) REFERENCES `marcas` (`id_marcas`) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;

CREATE TABLE perifericos(
	id_perifericos int NOT NULL AUTO_INCREMENT,
    monitor varchar(30) DEFAULT NULL,
    teclado varchar(30) DEFAULT NULL,
    raton varchar(30) DEFAULT NULL,
    auriculares varchar(30) DEFAULT NULL,
    marcas_perifericos int NOT NULL,
    PRIMARY KEY (id_perifericos),
    FOREIGN KEY (`marcas_perifericos`) REFERENCES `marcas` (`id_marcas`) ON DELETE CASCADE ON UPDATE CASCADE
)ENGINE = InnoDB DEFAULT CHARSET = utf8 COLLATE = utf8_bin;


INSERT INTO album (titulo, autor, numero_canciones) VALUES 
("Flags","Coldplay", 2), ("City of Stars","Lofi Fruits", 10), 
("Reprise Rarities","Frank Sinatra", 5), 
("Atom Bomb Baby","The Five Stars", 12);

INSERT INTO canciones (titulo, autor, duracion) VALUES 
("Paradise","Coldplay", "00:04:39"), 
("Sunset","Lofi Fruits", "00:02:49"), 
("My Way","Frank Sinatra", "00:04:37"), 
("Atom Bomb Baby","The Five Stars", "00:02:17");
