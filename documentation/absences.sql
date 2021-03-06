-- MySQL Script generated by MySQL Workbench
-- lun. 31 juil. 2017 17:33:46 CEST
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema absences_management
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `absences_management` ;

-- -----------------------------------------------------
-- Schema absences_management
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `absences_management` DEFAULT CHARACTER SET utf8 ;
USE `absences_management` ;

-- -----------------------------------------------------
-- Table `absences_management`.`absences`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`absences` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`absences` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `request_number` VARCHAR(45) NULL,
  `begin_date` DATE NULL,
  `end_date` DATE NULL,
  `commentaire` VARCHAR(255) NULL,
  `statut_id` INT NOT NULL,
  `type_id` INT NOT NULL,
  `employe_id` INT NOT NULL,
  PRIMARY KEY (`id`, `statut_id`, `type_id`, `employe_id`),
  CONSTRAINT `fk_absence_statut1`
    FOREIGN KEY (`statut_id`)
    REFERENCES `absences_management`.`statut` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_absence_type1`
    FOREIGN KEY (`type_id`)
    REFERENCES `absences_management`.`type` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_absence_employe1`
    FOREIGN KEY (`employe_id`)
    REFERENCES `absences_management`.`employes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_absence_statut1_idx` ON `absences_management`.`absences` (`statut_id` ASC);

CREATE INDEX `fk_absence_type1_idx` ON `absences_management`.`absences` (`type_id` ASC);

CREATE INDEX `fk_absence_employe1_idx` ON `absences_management`.`absences` (`employe_id` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
