-- MySQL Script generated by MySQL Workbench
-- lun. 11 sept. 2017 18:40:06 CEST
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
-- Table `absences_management`.`role`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`role` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`role` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `role_code` INT NULL,
  `role_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `absences_management`.`teams`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`teams` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`teams` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `team_code` VARCHAR(45) NULL,
  `team_name` VARCHAR(45) NULL,
  `responsable_name` VARCHAR(45) NULL,
  `responsable_email` VARCHAR(45) NULL,
  `backup_name` VARCHAR(45) NULL,
  `backup_email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `absences_management`.`rh_department`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`rh_department` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`rh_department` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `rh_department_code` VARCHAR(45) NULL,
  `rh_department_name` VARCHAR(45) NULL,
  `rh_department_email` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `absences_management`.`users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`users` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`users` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `registration` VARCHAR(45) NULL,
  `password` VARCHAR(45) NULL,
  `role_id` INT NOT NULL,
  PRIMARY KEY (`id`, `role_id`),
  CONSTRAINT `fk_users_role1`
    FOREIGN KEY (`role_id`)
    REFERENCES `absences_management`.`role` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_users_role1_idx` ON `absences_management`.`users` (`role_id` ASC);


-- -----------------------------------------------------
-- Table `absences_management`.`employes`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`employes` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`employes` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `last_name` VARCHAR(45) NULL,
  `first_name` VARCHAR(45) NULL,
  `email` VARCHAR(45) NULL,
  `registration` VARCHAR(45) NULL,
  `team_id` INT NOT NULL,
  `rh_department_id` INT NOT NULL,
  `users_id` INT NOT NULL,
  PRIMARY KEY (`id`, `team_id`, `rh_department_id`, `users_id`),
  CONSTRAINT `fk_employe_equipe`
    FOREIGN KEY (`team_id`)
    REFERENCES `absences_management`.`teams` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employe_service_rh1`
    FOREIGN KEY (`rh_department_id`)
    REFERENCES `absences_management`.`rh_department` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_employes_users1`
    FOREIGN KEY (`users_id`)
    REFERENCES `absences_management`.`users` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_employe_equipe_idx` ON `absences_management`.`employes` (`team_id` ASC);

CREATE INDEX `fk_employe_service_rh1_idx` ON `absences_management`.`employes` (`rh_department_id` ASC);

CREATE INDEX `fk_employes_users1_idx` ON `absences_management`.`employes` (`users_id` ASC);


-- -----------------------------------------------------
-- Table `absences_management`.`statut`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`statut` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`statut` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `statut_code` VARCHAR(45) NULL,
  `statut_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `absences_management`.`type`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`type` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`type` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `type_code` VARCHAR(45) NULL,
  `type_name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `absences_management`.`absences`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`absences` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`absences` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `request_date` DATE NULL,
  `request_number` VARCHAR(45) NULL,
  `begin_date` DATE NULL,
  `end_date` DATE NULL,
  `commentaire` VARCHAR(45) NULL,
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


-- -----------------------------------------------------
-- Table `absences_management`.`request_number`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`request_number` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`request_number` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `absence_type_code` VARCHAR(45) NULL,
  `request_number` VARCHAR(45) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `absences_management`.`reliquat`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `absences_management`.`reliquat` ;

CREATE TABLE IF NOT EXISTS `absences_management`.`reliquat` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `ca_number` INT NULL,
  `rtt_number` INT NULL,
  `rc_number` INT NULL,
  `cm_number` INT NULL,
  `at_number` INT NULL,
  `divers_number` INT NULL,
  `employe_id` INT NOT NULL,
  PRIMARY KEY (`id`, `employe_id`),
  CONSTRAINT `fk_reliquat_employe1`
    FOREIGN KEY (`employe_id`)
    REFERENCES `absences_management`.`employes` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_reliquat_employe1_idx` ON `absences_management`.`reliquat` (`employe_id` ASC);


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
