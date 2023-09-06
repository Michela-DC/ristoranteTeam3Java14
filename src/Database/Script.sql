-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema ristoranteJava
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema ristoranteJava
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `ristoranteJava` DEFAULT CHARACTER SET utf8 ;
USE `ristoranteJava` ;

-- -----------------------------------------------------
-- Table `ristoranteJava`.`Menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Menu` (
  `idMenu` INT NOT NULL AUTO_INCREMENT,
  `titolo` VARCHAR(45) NOT NULL,
  `descrizione` VARCHAR(255) NULL,
  PRIMARY KEY (`idMenu`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Portata`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Portata` (
  `idPortata` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `prezzo` DECIMAL NOT NULL,
  `descrizione` VARCHAR(255) NOT NULL,
  `calorie` INT NOT NULL,
  `Menu_idMenu` INT NOT NULL,
  PRIMARY KEY (`idPortata`, `Menu_idMenu`),
  INDEX `fk_Portata_Menu_idx` (`Menu_idMenu` ASC) VISIBLE,
  CONSTRAINT `fk_Portata_Menu`
    FOREIGN KEY (`Menu_idMenu`)
    REFERENCES `ristoranteJava`.`Menu` (`idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Antipasto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Antipasto` (
  `idAntipasto` INT NOT NULL,
  `is_produzione_propria` TINYINT NULL,
  `Portata_idPortata` INT NOT NULL,
  `Portata_Menu_idMenu` INT NOT NULL,
  PRIMARY KEY (`idAntipasto`, `Portata_idPortata`, `Portata_Menu_idMenu`),
  INDEX `fk_Antipasto_Portata1_idx` (`Portata_idPortata` ASC, `Portata_Menu_idMenu` ASC) VISIBLE,
  CONSTRAINT `fk_Antipasto_Portata1`
    FOREIGN KEY (`Portata_idPortata` , `Portata_Menu_idMenu`)
    REFERENCES `ristoranteJava`.`Portata` (`idPortata` , `Menu_idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Bevanda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Bevanda` (
  `idBevanda` INT NOT NULL,
  `tasso_alcolico` DECIMAL NULL,
  `Portata_idPortata` INT NOT NULL,
  `Portata_Menu_idMenu` INT NOT NULL,
  PRIMARY KEY (`idBevanda`, `Portata_idPortata`, `Portata_Menu_idMenu`),
  INDEX `fk_Bevanda_Portata1_idx` (`Portata_idPortata` ASC, `Portata_Menu_idMenu` ASC) VISIBLE,
  CONSTRAINT `fk_Bevanda_Portata1`
    FOREIGN KEY (`Portata_idPortata` , `Portata_Menu_idMenu`)
    REFERENCES `ristoranteJava`.`Portata` (`idPortata` , `Menu_idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Contorno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Contorno` (
  `idContorno` INT NOT NULL,
  `olio_al_peperoncino` TINYINT NULL,
  `note` VARCHAR(255) NULL,
  `Portata_idPortata` INT NOT NULL,
  `Portata_Menu_idMenu` INT NOT NULL,
  PRIMARY KEY (`idContorno`, `Portata_idPortata`, `Portata_Menu_idMenu`),
  INDEX `fk_Contorno_Portata1_idx` (`Portata_idPortata` ASC, `Portata_Menu_idMenu` ASC) VISIBLE,
  CONSTRAINT `fk_Contorno_Portata1`
    FOREIGN KEY (`Portata_idPortata` , `Portata_Menu_idMenu`)
    REFERENCES `ristoranteJava`.`Portata` (`idPortata` , `Menu_idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Dessert`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Dessert` (
  `idDessert` INT NOT NULL,
  `semifreddo` VARCHAR(45) NULL,
  `percentuale_zuccheri` TINYINT NULL,
  `Portata_idPortata` INT NOT NULL,
  `Portata_Menu_idMenu` INT NOT NULL,
  PRIMARY KEY (`idDessert`, `Portata_idPortata`, `Portata_Menu_idMenu`),
  INDEX `fk_Dessert_Portata1_idx` (`Portata_idPortata` ASC, `Portata_Menu_idMenu` ASC) VISIBLE,
  CONSTRAINT `fk_Dessert_Portata1`
    FOREIGN KEY (`Portata_idPortata` , `Portata_Menu_idMenu`)
    REFERENCES `ristoranteJava`.`Portata` (`idPortata` , `Menu_idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Primo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Primo` (
  `idPrimo` INT NOT NULL,
  `is_stagionale` TINYINT NULL,
  `Portata_idPortata` INT NOT NULL,
  `Portata_Menu_idMenu` INT NOT NULL,
  PRIMARY KEY (`idPrimo`, `Portata_idPortata`, `Portata_Menu_idMenu`),
  INDEX `fk_Primo_Portata1_idx` (`Portata_idPortata` ASC, `Portata_Menu_idMenu` ASC) VISIBLE,
  CONSTRAINT `fk_Primo_Portata1`
    FOREIGN KEY (`Portata_idPortata` , `Portata_Menu_idMenu`)
    REFERENCES `ristoranteJava`.`Portata` (`idPortata` , `Menu_idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Secondo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Secondo` (
  `idSecondo` INT NOT NULL,
  `origine_della_carne` VARCHAR(45) NULL,
  `Portata_idPortata` INT NOT NULL,
  `Portata_Menu_idMenu` INT NOT NULL,
  PRIMARY KEY (`idSecondo`, `Portata_idPortata`, `Portata_Menu_idMenu`),
  INDEX `fk_Secondo_Portata1_idx` (`Portata_idPortata` ASC, `Portata_Menu_idMenu` ASC) VISIBLE,
  CONSTRAINT `fk_Secondo_Portata1`
    FOREIGN KEY (`Portata_idPortata` , `Portata_Menu_idMenu`)
    REFERENCES `ristoranteJava`.`Portata` (`idPortata` , `Menu_idMenu`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
