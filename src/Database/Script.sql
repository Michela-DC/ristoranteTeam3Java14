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
-- Table `ristoranteJava`.`Antipasto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Antipasto` (
  `idAntipasto` INT NOT NULL,
  `is_produzione_propria` TINYINT NULL,
  PRIMARY KEY (`idAntipasto`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Bevanda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Bevanda` (
  `idBevanda` INT NOT NULL,
  `tasso_alcolico` DECIMAL NULL,
  PRIMARY KEY (`idBevanda`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Contorno`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Contorno` (
  `idContorno` INT NOT NULL,
  `olio_al_peperoncino` TINYINT NULL,
  `note` VARCHAR(255) NULL,
  PRIMARY KEY (`idContorno`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Dessert`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Dessert` (
  `idDessert` INT NOT NULL,
  `semifreddo` VARCHAR(45) NULL,
  `percentuale_zuccheri` TINYINT NULL,
  PRIMARY KEY (`idDessert`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Primo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Primo` (
  `idPrimo` INT NOT NULL,
  `is_stagionale` TINYINT NULL,
  PRIMARY KEY (`idPrimo`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Secondo`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Secondo` (
  `idSecondo` INT NOT NULL,
  `origine_della_carne` VARCHAR(45) NULL,
  PRIMARY KEY (`idSecondo`))
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
  `Antipasto_idAntipasto` INT NOT NULL,
  `Bevanda_idBevanda` INT NOT NULL,
  `Contorno_idContorno` INT NOT NULL,
  `Dessert_idDessert` INT NOT NULL,
  `Primo_idPrimo` INT NOT NULL,
  `Secondo_idSecondo` INT NOT NULL,
  PRIMARY KEY (`idPortata`),
  INDEX `fk_Portata_Antipasti_idx` (`Antipasto_idAntipasto` ASC) VISIBLE,
  INDEX `fk_Portata_Bevanda1_idx` (`Bevanda_idBevanda` ASC) VISIBLE,
  INDEX `fk_Portata_Contorno1_idx` (`Contorno_idContorno` ASC) VISIBLE,
  INDEX `fk_Portata_Dessert1_idx` (`Dessert_idDessert` ASC) VISIBLE,
  INDEX `fk_Portata_Primi1_idx` (`Primo_idPrimo` ASC) VISIBLE,
  INDEX `fk_Portata_Secondo1_idx` (`Secondo_idSecondo` ASC) VISIBLE,
  CONSTRAINT `fk_Portata_Antipasti`
    FOREIGN KEY (`Antipasto_idAntipasto`)
    REFERENCES `ristoranteJava`.`Antipasto` (`idAntipasto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Portata_Bevanda1`
    FOREIGN KEY (`Bevanda_idBevanda`)
    REFERENCES `ristoranteJava`.`Bevanda` (`idBevanda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Portata_Contorno1`
    FOREIGN KEY (`Contorno_idContorno`)
    REFERENCES `ristoranteJava`.`Contorno` (`idContorno`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Portata_Dessert1`
    FOREIGN KEY (`Dessert_idDessert`)
    REFERENCES `ristoranteJava`.`Dessert` (`idDessert`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Portata_Primi1`
    FOREIGN KEY (`Primo_idPrimo`)
    REFERENCES `ristoranteJava`.`Primo` (`idPrimo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Portata_Secondo1`
    FOREIGN KEY (`Secondo_idSecondo`)
    REFERENCES `ristoranteJava`.`Secondo` (`idSecondo`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `ristoranteJava`.`Menu`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `ristoranteJava`.`Menu` (
  `idMenu` INT NOT NULL AUTO_INCREMENT,
  `titolo` VARCHAR(45) NOT NULL,
  `descrizione` VARCHAR(255) NULL,
  `Portata_idPortata` INT NOT NULL,
  PRIMARY KEY (`idMenu`),
  INDEX `fk_Menu_Portata1_idx` (`Portata_idPortata` ASC) VISIBLE,
  CONSTRAINT `fk_Menu_Portata1`
    FOREIGN KEY (`Portata_idPortata`)
    REFERENCES `ristoranteJava`.`Portata` (`idPortata`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
