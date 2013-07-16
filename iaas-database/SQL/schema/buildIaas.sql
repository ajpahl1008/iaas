SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL';

DROP SCHEMA IF EXISTS `iaas` ;
CREATE SCHEMA IF NOT EXISTS `iaas` DEFAULT CHARACTER SET latin1 ;
USE `iaas` ;

-- -----------------------------------------------------
-- Table `iaas`.`applications`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`applications` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`applications` (
  `id` INT(11) NOT NULL ,
  `application_name` VARCHAR(45) NOT NULL ,
  `installation_command` MEDIUMTEXT NOT NULL ,
  `software_location` VARCHAR(255) NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`categories`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`categories` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`categories` (
  `id` INT(11) NOT NULL ,
  `category` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`directives`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`directives` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`directives` (
  `id` INT(11) NOT NULL ,
  `directive` VARCHAR(255) NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`properties`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`properties` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`properties` (
  `id` INT(11) NOT NULL ,
  `parameter` VARCHAR(45) NULL DEFAULT NULL ,
  `value` VARCHAR(255) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`request_queue`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`request_queue` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`request_queue` (
  `id` INT(11) NOT NULL ,
  `user_id` INT(11) NOT NULL ,
  `category_id` INT(11) NOT NULL ,
  `application_id` INT(11) NOT NULL ,
  `directive_id` INT(11) NOT NULL ,
  `completed` VARCHAR(1) NOT NULL ,
  `timestamp` VARCHAR(32) NOT NULL ,
  `server_id` INT(11) NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`server_parent_map`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`server_parent_map` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`server_parent_map` (
  `id` INT(11) NOT NULL ,
  `parent_id` INT(11) NULL DEFAULT NULL ,
  `parent_name` VARCHAR(45) NULL DEFAULT NULL ,
  `child_id` INT(11) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `SERVER_PARENT_FK` (`child_id` ASC) )
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`servers`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`servers` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`servers` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `server_name` VARCHAR(45) NULL DEFAULT NULL ,
  `start_date` VARCHAR(11) NULL DEFAULT NULL ,
  `expiration_date` VARCHAR(11) NULL DEFAULT NULL ,
  `user_id` INT(11) NULL DEFAULT NULL ,
  `category_id` INT(11) NULL DEFAULT NULL ,
  `software` VARCHAR(255) NULL DEFAULT NULL ,
  `status_id` INT(11) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `id` (`user_id` ASC) ,
  INDEX `user_fk` (`user_id` ASC) ,
  INDEX `category_fk` (`category_id` ASC) )
ENGINE = InnoDB
AUTO_INCREMENT = 52
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`statistics`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`statistics` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`statistics` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `server_id` INT(11) NULL DEFAULT NULL ,
  `server_uptime` VARCHAR(11) NULL DEFAULT NULL ,
  `server_context_switching` VARCHAR(45) NULL DEFAULT NULL ,
  `server_load` VARCHAR(45) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `filesystems` (`id` ASC) ,
  INDEX `filesystems_fk` (`id` ASC) ,
  INDEX `server_fk` (`server_id` ASC) )
ENGINE = InnoDB
AUTO_INCREMENT = 8
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`status`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`status` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`status` (
  `id` INT(11) NOT NULL ,
  `status` VARCHAR(45) NOT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = MyISAM
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`storage`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`storage` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`storage` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `storage_entity` VARCHAR(45) NULL DEFAULT NULL ,
  `storage_size` VARCHAR(45) NULL DEFAULT NULL ,
  `percent_free` VARCHAR(45) NULL DEFAULT NULL ,
  `server_id` INT(11) NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) ,
  INDEX `server_fk` (`server_id` ASC) ,
  INDEX `filesystem_server_fk` (`server_id` ASC) )
ENGINE = InnoDB
AUTO_INCREMENT = 7
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Table `iaas`.`users`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `iaas`.`users` ;

CREATE  TABLE IF NOT EXISTS `iaas`.`users` (
  `id` INT(11) NOT NULL AUTO_INCREMENT ,
  `first_name` VARCHAR(45) NOT NULL ,
  `last_name` VARCHAR(45) NOT NULL ,
  `phone_number` VARCHAR(12) NOT NULL ,
  `login` VARCHAR(45) NOT NULL ,
  `ssh_public` LONGBLOB NULL DEFAULT NULL ,
  `ssh_private` LONGBLOB NULL DEFAULT NULL ,
  PRIMARY KEY (`id`) )
ENGINE = InnoDB
AUTO_INCREMENT = 21
DEFAULT CHARACTER SET = latin1;


-- -----------------------------------------------------
-- Placeholder table for view `iaas`.`overview_j04`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `iaas`.`overview_j04` (`id` INT, `server_name` INT, `start_date` INT, `expiration_date` INT, `status` INT, `category` INT, `first_name` INT, `last_name` INT, `phone_number` INT, `login` INT, `parent_name` INT);

-- -----------------------------------------------------
-- Placeholder table for view `iaas`.`stats_j03`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `iaas`.`stats_j03` (`server_name` INT, `server_uptime` INT, `server_context_switching` INT, `server_load` INT);

-- -----------------------------------------------------
-- Placeholder table for view `iaas`.`storage_j02`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `iaas`.`storage_j02` (`server_name` INT, `storage_entity` INT, `storage_size` INT, `percent_free` INT);

-- -----------------------------------------------------
-- View `iaas`.`overview_j04`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `iaas`.`overview_j04` ;
DROP TABLE IF EXISTS `iaas`.`overview_j04`;
USE `iaas`;
CREATE  OR REPLACE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `iaas`.`overview_j04` AS select `iaas`.`servers`.`id` AS `id`,`iaas`.`servers`.`server_name` AS `server_name`,`iaas`.`servers`.`start_date` AS `start_date`,`iaas`.`servers`.`expiration_date` AS `expiration_date`,`iaas`.`status`.`status` AS `status`,`iaas`.`categories`.`category` AS `category`,`iaas`.`users`.`first_name` AS `first_name`,`iaas`.`users`.`last_name` AS `last_name`,`iaas`.`users`.`phone_number` AS `phone_number`,`iaas`.`users`.`login` AS `login`,`iaas`.`server_parent_map`.`parent_name` AS `parent_name` from ((((`iaas`.`servers` join `iaas`.`users` on((`iaas`.`servers`.`user_id` = `iaas`.`users`.`id`))) join `iaas`.`categories` on((`iaas`.`servers`.`category_id` = `iaas`.`categories`.`id`))) join `iaas`.`status` on((`iaas`.`servers`.`status_id` = `iaas`.`status`.`id`))) join `iaas`.`server_parent_map` on((`iaas`.`servers`.`id` = `iaas`.`server_parent_map`.`child_id`)));

-- -----------------------------------------------------
-- View `iaas`.`stats_j03`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `iaas`.`stats_j03` ;
DROP TABLE IF EXISTS `iaas`.`stats_j03`;
USE `iaas`;
CREATE  OR REPLACE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `iaas`.`stats_j03` AS select `iaas`.`servers`.`server_name` AS `server_name`,`iaas`.`statistics`.`server_uptime` AS `server_uptime`,`iaas`.`statistics`.`server_context_switching` AS `server_context_switching`,`iaas`.`statistics`.`server_load` AS `server_load` from (`iaas`.`servers` join `iaas`.`statistics` on((`iaas`.`servers`.`id` = `iaas`.`statistics`.`server_id`)));

-- -----------------------------------------------------
-- View `iaas`.`storage_j02`
-- -----------------------------------------------------
DROP VIEW IF EXISTS `iaas`.`storage_j02` ;
DROP TABLE IF EXISTS `iaas`.`storage_j02`;
USE `iaas`;
CREATE  OR REPLACE ALGORITHM=UNDEFINED DEFINER=`root`@`%` SQL SECURITY DEFINER VIEW `iaas`.`storage_j02` AS select `iaas`.`servers`.`server_name` AS `server_name`,`iaas`.`storage`.`storage_entity` AS `storage_entity`,`iaas`.`storage`.`storage_size` AS `storage_size`,`iaas`.`storage`.`percent_free` AS `percent_free` from (`iaas`.`servers` join `iaas`.`storage` on((`iaas`.`servers`.`id` = `iaas`.`storage`.`server_id`)));


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
