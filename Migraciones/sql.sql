# Host: localhost  (Version 5.5.5-10.1.28-MariaDB)
# Date: 2017-12-02 18:14:38
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "clientes"
#

DROP TABLE IF EXISTS `clientes`;
CREATE TABLE `clientes` (
  `cod_cli` int(11) NOT NULL AUTO_INCREMENT,
  `nom_cli` varchar(255) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `ape_cli` varchar(255) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `dni_cli` int(2) NOT NULL DEFAULT '0',
  `tel_cli` varchar(255) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_cli`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

#
# Data for table "clientes"
#

INSERT INTO `clientes` VALUES (3,'Diego','Lopez Solorzano',265659856,'56565659'),(7,'Perla Joselyn','Pariona Quispe',789653265,'963696369'),(10,'bica erik','pinto economia',789654455,'98574522'),(11,'Jesus Daniel ','LLancari Carrasco',789654147,'963258963'),(14,'Victor Hugo','Lanazca Riu',98746632,'963693369'),(16,'victgor','llancari',12312,'123123'),(17,'Daniel Jesus','LLancari carrasco',78944565,'96939639');

#
# Structure for table "tecnicos"
#

DROP TABLE IF EXISTS `tecnicos`;
CREATE TABLE `tecnicos` (
  `cod_tec` int(3) NOT NULL AUTO_INCREMENT,
  `nom_tec` varchar(50) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `ape_tec` varchar(70) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  `esp_tec` varchar(30) COLLATE utf8_spanish_ci NOT NULL DEFAULT '',
  PRIMARY KEY (`cod_tec`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

#
# Data for table "tecnicos"
#

INSERT INTO `tecnicos` VALUES (1,'Juan Alexis','Luque ','Ing, de Sistemas'),(2,'Juan Pedro','De la Vega Ortiz','Tecnico en ventas'),(3,'victor ','llancari Carrasco','Agente vengador '),(4,'Jesus Daniel','LLancari carrasco','Ins. Mecatronico'),(5,'Pedro ','Del Pino Lopez','tec.en amor');

#
# Structure for table "consultas"
#

DROP TABLE IF EXISTS `consultas`;
CREATE TABLE `consultas` (
  `cod_con` int(11) NOT NULL AUTO_INCREMENT,
  `cliente_cod_cli` int(11) NOT NULL DEFAULT '0',
  `tecnico_cod_tec` int(11) NOT NULL DEFAULT '0',
  `fec_rev` date NOT NULL DEFAULT '0000-00-00',
  `pro_con` text COLLATE utf8_spanish_ci NOT NULL,
  `sol_con` text COLLATE utf8_spanish_ci,
  `fec_ter` date DEFAULT NULL,
  PRIMARY KEY (`cod_con`),
  KEY `cliente_cod_cli` (`cliente_cod_cli`),
  KEY `tecnico_cod_tec` (`tecnico_cod_tec`),
  CONSTRAINT `consultas_ibfk_1` FOREIGN KEY (`cliente_cod_cli`) REFERENCES `clientes` (`cod_cli`) ON UPDATE CASCADE,
  CONSTRAINT `consultas_ibfk_2` FOREIGN KEY (`tecnico_cod_tec`) REFERENCES `tecnicos` (`cod_tec`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

#
# Data for table "consultas"
#

INSERT INTO `consultas` VALUES (1,17,5,'2017-11-26','Desconeccion de los puertos de conexion\ndel la laptop','Ella','2017-12-01'),(2,17,5,'2017-11-26','asdasd','asdasdas','2017-11-29'),(3,7,4,'2017-11-23','Se descontrolo','Ella no te ama','2017-11-25');
