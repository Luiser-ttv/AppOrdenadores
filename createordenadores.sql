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


INSERT INTO marcas (nombre) VALUES 
("MSI"), 
("ASUS"), 
("Logitech"), 
("Razer");

INSERT INTO componentes (procesador, disipador, placa_base, tarjeta_grafica, torre, marcas_componentes) VALUES 
("Intel Core i7-10900K","MSI Cooling Force","MSI MAG B550","Nvidia RTX3080","Black Silver", 1),
("Intel Core i5-10800K","MasterAir MA620P","ASUS ROG ONE","Nvidia RTX3060","Silver One", 2),
("Intel Core i9-10900K","Noctua Silence","Bazooka Master","Nvidia RTX3090","G Tower", 3),
("Intel Core i7-10900K","Razer Silence","Razer Master","Nvidia RTX3070","Razer Black Widow", 4);

INSERT INTO perifericos (monitor, teclado, raton, auriculares, marcas_perifericos) VALUES 
("MSI Optix MAG274QRF","VIGOR GK20","Clutch GM20 Elite","Immerse GH30 V2", 1),
("22F-21.5","ROG STRIX SCOPE DELUXE","ROG Strix Impact II","ROG Delta White", 2),
("LG 22MK600M-B","G G915 TKL","G 604","G733 LIGHTSPEED", 3),
("223V7QDSB-21,5","Huntsman MINI Optico","Razer PRO CLICK","Kraken Tournament Edition", 4);
