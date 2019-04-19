CREATE DATABASE bot;


CREATE TABLE `bot`.`cours` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `symbol` VARCHAR(15) NULL,
  `volume` INT NULL,
  `prix` DECIMAL(10,10) NULL,
  `dateEnregistrement` DATETIME NULL,
  UNIQUE INDEX `id_UNIQUE` (`id` ASC),
  PRIMARY KEY (`id`))
COMMENT = 'Cours des cryptos';