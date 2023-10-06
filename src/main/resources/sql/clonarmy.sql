CREATE DATABASE clonarmy;

USE clonarmy;

DROP TABLE IF EXISTS `divisiones`;
DROP TABLE IF EXISTS `clones`;
DROP TABLE IF EXISTS `planetas`;

CREATE TABLE `divisiones` (
    `cod_division` INT NOT NULL,
    `division` VARCHAR(255) NOT NULL,
    PRIMARY KEY (`cod_division`)
);

CREATE TABLE `planetas` (
    `cod_planeta` INT NOT NULL,
    `planeta` VARCHAR(255) NOT NULL,
    `tamaño` INT NOT NULL,
    PRIMARY KEY (`cod_planeta`)
);

CREATE TABLE `clones` (
    `cod_clon` INT NOT NULL,
    `nombre` VARCHAR(255) NOT NULL,
    `cod_division` INT,
    `cod_planeta` INT,
    PRIMARY KEY (`cod_clon`),
    FOREIGN KEY (`cod_division`) REFERENCES `divisiones` (`cod_division`),
    FOREIGN KEY (`cod_planeta`) REFERENCES `planetas` (`cod_planeta`)
);


INSERT INTO `divisiones` (`cod_division`, `division`) VALUES (511, 'La 511');
INSERT INTO `planetas` (`cod_planeta`, `planeta`, `tamaño`) VALUES (451, 'Dagovah', 84192);
INSERT INTO `clones` (`cod_clon`, `nombre`, `cod_division`, `cod_planeta`) VALUES (0, 'John', 511, 451);
