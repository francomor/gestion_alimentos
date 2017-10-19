-- MySQL Script generated by MySQL Workbench
-- Thu Oct 19 00:21:01 2017
-- Model: New Model    Version: 1.0
-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema uresa
-- -----------------------------------------------------
DROP SCHEMA IF EXISTS `uresa` ;

-- -----------------------------------------------------
-- Schema uresa
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `uresa` DEFAULT CHARACTER SET utf8 ;
SHOW WARNINGS;
USE `uresa` ;

-- -----------------------------------------------------
-- Table `uresa`.`Localidad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Localidad` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Localidad` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Empresa`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Empresa` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Empresa` (
  `CUIT` INT NOT NULL,
  `email` VARCHAR(45) NULL,
  `nombre` VARCHAR(45) NULL,
  `razon_social` VARCHAR(45) NULL,
  `telefono` INT NULL,
  `Localidad_id` INT NOT NULL,
  PRIMARY KEY (`CUIT`),
  INDEX `fk_Empresa_Localidad1_idx` (`Localidad_id` ASC),
  CONSTRAINT `fk_Empresa_Localidad1`
    FOREIGN KEY (`Localidad_id`)
    REFERENCES `uresa`.`Localidad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Categoria`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Categoria` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Categoria` (
  `idCategoria` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(1) NOT NULL,
  PRIMARY KEY (`idCategoria`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Establecimiento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Establecimiento` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Establecimiento` (
  `idEstablecimiento` INT NOT NULL AUTO_INCREMENT,
  `direccion` VARCHAR(45) NULL,
  `fecha_carga` DATE NULL,
  `nombre` VARCHAR(45) NULL,
  `telefono` INT NULL,
  `archivos_adjuntos` VARCHAR(45) NULL,
  `nro_RNE` VARCHAR(45) NULL,
  `vencimiento_RNE` DATE NULL,
  `nro_factura` INT NULL,
  `Empresa_CUIT` INT NOT NULL,
  `Categoria_idCategoria` INT NOT NULL,
  `Localidad_id` INT NOT NULL,
  PRIMARY KEY (`idEstablecimiento`),
  INDEX `fk_Establecimiento_Empresa1_idx` (`Empresa_CUIT` ASC),
  INDEX `fk_Establecimiento_Categoria1_idx` (`Categoria_idCategoria` ASC),
  INDEX `fk_Establecimiento_Localidad1_idx` (`Localidad_id` ASC),
  CONSTRAINT `fk_Establecimiento_Empresa1`
    FOREIGN KEY (`Empresa_CUIT`)
    REFERENCES `uresa`.`Empresa` (`CUIT`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Establecimiento_Categoria1`
    FOREIGN KEY (`Categoria_idCategoria`)
    REFERENCES `uresa`.`Categoria` (`idCategoria`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Establecimiento_Localidad1`
    FOREIGN KEY (`Localidad_id`)
    REFERENCES `uresa`.`Localidad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Producto_Alimenticio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Producto_Alimenticio` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Producto_Alimenticio` (
  `id_Prod_Alimenticio` INT ZEROFILL UNSIGNED NOT NULL AUTO_INCREMENT,
  `nro_factura` INT UNSIGNED NULL,
  `nro_RNPA` INT UNSIGNED NULL,
  `rotulo` LONGTEXT NULL,
  `CAA` VARCHAR(45) NULL,
  `contenido` VARCHAR(45) NULL,
  `denominacion` VARCHAR(45) NULL,
  `fecha_duracion` DATE NULL,
  `marca` VARCHAR(45) NOT NULL,
  `nombre_comercial` VARCHAR(45) NOT NULL,
  `num_y_tipo_reg_marca` VARCHAR(45) NULL,
  `fecha_carga_solicitud` DATE NULL,
  `Controles_y_cuidados` VARCHAR(45) NULL,
  `destino_prod` VARCHAR(45) NULL,
  `forma_uso` VARCHAR(45) NULL,
  `info_adicional` VARCHAR(45) NULL,
  `instrucciones_preparacion` VARCHAR(45) NULL,
  `lugar_venta` VARCHAR(45) NULL,
  `modo_conservacion` VARCHAR(45) NULL,
  `periodo_aptitud` VARCHAR(45) NULL,
  `Vencimiento_RNPA` DATE NULL,
  `Establecimiento_idEstablecimiento` INT NOT NULL,
  PRIMARY KEY (`id_Prod_Alimenticio`),
  UNIQUE INDEX `id_Prod_Alimenticio_UNIQUE` (`id_Prod_Alimenticio` ASC),
  INDEX `fk_Producto_Alimenticio_Establecimiento1_idx` (`Establecimiento_idEstablecimiento` ASC),
  CONSTRAINT `fk_Producto_Alimenticio_Establecimiento1`
    FOREIGN KEY (`Establecimiento_idEstablecimiento`)
    REFERENCES `uresa`.`Establecimiento` (`idEstablecimiento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Material`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Material` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Material` (
  `idMaterial` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`idMaterial`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Unidad`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Unidad` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Unidad` (
  `idUnidad` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(5) NOT NULL,
  PRIMARY KEY (`idUnidad`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Envase`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Envase` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Envase` (
  `idEnvase` INT NOT NULL AUTO_INCREMENT,
  `capacidad` INT NULL,
  `Material_idMaterial1` INT NOT NULL,
  `Unidad_idUnidad` INT NOT NULL,
  PRIMARY KEY (`idEnvase`),
  INDEX `fk_Envase_Material1_idx` (`Material_idMaterial1` ASC),
  INDEX `fk_Envase_Unidad1_idx` (`Unidad_idUnidad` ASC),
  CONSTRAINT `fk_Envase_Material1`
    FOREIGN KEY (`Material_idMaterial1`)
    REFERENCES `uresa`.`Material` (`idMaterial`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Envase_Unidad1`
    FOREIGN KEY (`Unidad_idUnidad`)
    REFERENCES `uresa`.`Unidad` (`idUnidad`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Producto_Alimenticio_has_Envase`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Producto_Alimenticio_has_Envase` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Producto_Alimenticio_has_Envase` (
  `Producto_Alimenticio_id_Prod_Alimenticio` INT ZEROFILL UNSIGNED NOT NULL,
  `Envase_idEnvase` INT NOT NULL,
  PRIMARY KEY (`Producto_Alimenticio_id_Prod_Alimenticio`, `Envase_idEnvase`),
  INDEX `fk_Producto_Alimenticio_has_Envase_Envase1_idx` (`Envase_idEnvase` ASC),
  INDEX `fk_Producto_Alimenticio_has_Envase_Producto_Alimenticio_idx` (`Producto_Alimenticio_id_Prod_Alimenticio` ASC),
  CONSTRAINT `fk_Producto_Alimenticio_has_Envase_Producto_Alimenticio`
    FOREIGN KEY (`Producto_Alimenticio_id_Prod_Alimenticio`)
    REFERENCES `uresa`.`Producto_Alimenticio` (`id_Prod_Alimenticio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Producto_Alimenticio_has_Envase_Envase1`
    FOREIGN KEY (`Envase_idEnvase`)
    REFERENCES `uresa`.`Envase` (`idEnvase`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`materia_prima`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`materia_prima` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`materia_prima` (
  `id_materia_prima` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_materia_prima`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`materia_prima_has_Producto_Alimenticio`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`materia_prima_has_Producto_Alimenticio` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`materia_prima_has_Producto_Alimenticio` (
  `materia_prima_id_materia_prima` INT NOT NULL,
  `Producto_Alimenticio_id_Prod_Alimenticio` INT ZEROFILL UNSIGNED NOT NULL,
  `cantidad_mat_prima` INT NOT NULL,
  PRIMARY KEY (`materia_prima_id_materia_prima`, `Producto_Alimenticio_id_Prod_Alimenticio`),
  INDEX `fk_materia_prima_has_Producto_Alimenticio_Producto_Alimenti_idx` (`Producto_Alimenticio_id_Prod_Alimenticio` ASC),
  INDEX `fk_materia_prima_has_Producto_Alimenticio_materia_prima1_idx` (`materia_prima_id_materia_prima` ASC),
  CONSTRAINT `fk_materia_prima_has_Producto_Alimenticio_materia_prima1`
    FOREIGN KEY (`materia_prima_id_materia_prima`)
    REFERENCES `uresa`.`materia_prima` (`id_materia_prima`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_materia_prima_has_Producto_Alimenticio_Producto_Alimenticio1`
    FOREIGN KEY (`Producto_Alimenticio_id_Prod_Alimenticio`)
    REFERENCES `uresa`.`Producto_Alimenticio` (`id_Prod_Alimenticio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Rubro_establecimiento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Rubro_establecimiento` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Rubro_establecimiento` (
  `idRubro_establecimiento` INT NOT NULL,
  `nombre` VARCHAR(45) NULL,
  PRIMARY KEY (`idRubro_establecimiento`))
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`Rubro_establecimiento_has_Establecimiento`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`Rubro_establecimiento_has_Establecimiento` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`Rubro_establecimiento_has_Establecimiento` (
  `Rubro_establecimiento_idRubro_establecimiento` INT NOT NULL,
  `Establecimiento_idEstablecimiento` INT NOT NULL,
  PRIMARY KEY (`Rubro_establecimiento_idRubro_establecimiento`, `Establecimiento_idEstablecimiento`),
  INDEX `fk_Rubro_establecimiento_has_Establecimiento_Establecimient_idx` (`Establecimiento_idEstablecimiento` ASC),
  INDEX `fk_Rubro_establecimiento_has_Establecimiento_Rubro_establec_idx` (`Rubro_establecimiento_idRubro_establecimiento` ASC),
  CONSTRAINT `fk_Rubro_establecimiento_has_Establecimiento_Rubro_establecim1`
    FOREIGN KEY (`Rubro_establecimiento_idRubro_establecimiento`)
    REFERENCES `uresa`.`Rubro_establecimiento` (`idRubro_establecimiento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_Rubro_establecimiento_has_Establecimiento_Establecimiento1`
    FOREIGN KEY (`Establecimiento_idEstablecimiento`)
    REFERENCES `uresa`.`Establecimiento` (`idEstablecimiento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

-- -----------------------------------------------------
-- Table `uresa`.`provincia`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `uresa`.`provincia` ;

SHOW WARNINGS;
CREATE TABLE IF NOT EXISTS `uresa`.`provincia` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `nombre` VARCHAR(25) NOT NULL,
  `Localidad_id` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk_provincia_Localidad1_idx` (`Localidad_id` ASC),
  CONSTRAINT `fk_provincia_Localidad1`
    FOREIGN KEY (`Localidad_id`)
    REFERENCES `uresa`.`Localidad` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

SHOW WARNINGS;

SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
