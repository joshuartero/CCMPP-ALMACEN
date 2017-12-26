/*
SQLyog Ultimate v12.4.1 (64 bit)
MySQL - 5.6.21 : Database - bd_ccm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bd_ccm` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `bd_ccm`;

/*Table structure for table `area` */

DROP TABLE IF EXISTS `area`;

CREATE TABLE `area` (
  `ID` char(3) NOT NULL,
  `AREA` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `area` */

insert  into `area`(`ID`,`AREA`) values 
('101','ALUMBRADO PUBLICO'),
('102','BAJA TENSION'),
('103','CALIDAD DE PRODUCTO'),
('104','EMERGENCIAS'),
('105','MEDIA TENSION'),
('106','PODAS'),
('107','LOGISTICA'),
('108','SEGURIDAD'),
('109','TODAS'),
('110','TERMOGRAFIA');

/*Table structure for table `articulo` */

DROP TABLE IF EXISTS `articulo`;

CREATE TABLE `articulo` (
  `CODIGO` char(7) NOT NULL,
  `DESCRIPCION` varchar(60) NOT NULL,
  `IDTIPOARTICULO` char(4) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  PRIMARY KEY (`CODIGO`),
  KEY `IDTIPOARTICULO` (`IDTIPOARTICULO`),
  CONSTRAINT `articulo_ibfk_1` FOREIGN KEY (`IDTIPOARTICULO`) REFERENCES `tipo_articulo` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `articulo` */

insert  into `articulo`(`CODIGO`,`DESCRIPCION`,`IDTIPOARTICULO`,`CANTIDAD`) values 
('1210001','HEBILLAS DE 3/4','TA01',38),
('1210002','FLEJE DE 3/4','TA01',20),
('1210003','CINTA DE PVC','TA01',100),
('1210004','BENTONITA','TA01',0),
('1210005','CEMENTO','TA01',0),
('1210006','LENTES DE LUNA OSCURA','TA02',114),
('1210007','CINTA MASTIC','TA01',20),
('1210008','GUANTES DE CUERO DE BADANA','TA02',37),
('1210009','GUANTES DE CUERO REFORZADO','TA02',9),
('1210010','CORTAVIENTOS O PROTECTOR SOLAR','TA02',30),
('1210011','MALLAS','TA04',14),
('1220012','Cascos azul','TA02',25),
('1220013','Cascos Blanco','TA02',20),
('1220014','Barbiquejo','TA02',108),
('1220015','Cortaviento','TA02',90),
('1220016','Camisas Manga Larga','TA02',180),
('1220017','Pantalones Jean C/cierre Plástico','TA02',180),
('1220018','Botines Dieléctricos','TA02',103),
('1220019','Zapatos Marrones Dielectricos','TA02',19),
('1220020','Chalecos con Cintas Reflectivas','TA02',90),
('1220021','Lentes de seguridad transparentes','TA02',161),
('1220022','Lentes de seguridad oscuros','TA02',180),
('1220023','Guantes de Cuero de Badana','TA02',94),
('1220024','Guantes de Cuero reforzado','TA02',100),
('1220025','Guantes de Hilo','TA02',66),
('1220026','Guantes de Nitrilo','TA02',49),
('1220027','Sobre guantes de cuero liviano BT','TA02',36),
('1220028','Sobre guantes de cuero liviano MT','TA02',18),
('1220029','Careta Facial Transparente con porta careta','TA02',60),
('1220030','Respirador Buconazal (N°( 8511-N95)(1012)','TA02',18),
('1220031','Guantes dieléctrico clase 0, 1 Kv - Talla N° 9','TA02',22),
('1220032','Guantes dieléctrico clase 0, 1 Kv - Talla N° 10','TA02',2),
('1220033','Guantes dieléctrico clase 1, 7.5 Kv','TA02',12),
('1220034','Guantes dieléctrico clase 3, 17 Kv - Talla N° 9','TA02',22),
('1220035','Guantes dieléctrico clase 3, 17 Kv - Talla N° 10','TA02',2),
('1220036','Arnes de Seguridad','TA02',30),
('1220037','Traje protector contra abejas','TA02',12),
('1220038','PONCHOS DE PVC PARA LLUVIA','TA02',90),
('1220039','BOTAS DE JEBE PARA LLUVIA','TA02',22),
('1220040','TAPON DE OIDO','TA02',214),
('1220041','BLOQUEADOR SOLAR, FRASCO 200 GR.','TA02',24),
('1220042','BLOQUEADOR SOLAR, SACHET','TA02',100),
('1220043','REGLAMENTO DE SEGURIDAD YSALUD EN EL TRABAJO','TA02',90),
('1220044','REGLAMENTO INTERNO DE TRABAJO','TA02',90),
('1220045','REGLAMENTO ENSEGURIDAD ELECTRICA','TA02',90),
('1230001','Cinta Amarilla señalizadora','TA04',22),
('1230002','Cinta Roja señalizadora','TA04',10),
('1230003','Malla de seguridad anaranjada','TA04',14),
('1230004','Cachacos/Parantes de señalización','TA04',37),
('1230005','Conos de Señalización','TA04',21),
('1230006','Cercos o tranqueras','TA04',24),
('1230007','Letreros de desvio de Tránsito','TA04',10),
('1250001','Aflojatodo','TA01',30),
('1250002','Agua de Mesa','TA01',60),
('1250003','Arandelas','TA01',0),
('1250004','Arena','TA01',0),
('1250005','Bentonita','TA01',0),
('1250006','Brea','TA01',0),
('1250007','Cemento','TA01',0),
('1250008','Cinta Aislante simple N° 1600','TA01',500),
('1250009','Cinta auto vulcanizante Nº 23','TA01',50),
('1250010','Cinta 3/4\" band-it','TA01',20),
('1250011','Hebillas 3/4\" P/ Cinta band-it','TA01',400),
('1250012','Cinta de aislante de alta performance Nº 33','TA01',240),
('1250013','Cinta Mastic 2229  x 03 meses','TA01',100),
('1250014','Cinta Señalizadora Amarilla','TA01',0),
('1250015','Cinta señalizadora Roja','TA01',0),
('1250016','Clavos','TA01',0),
('1250017','Cristaflex','TA01',0),
('1250018','Detergente Granulado Industrial','TA01',50),
('1250019','Formularios solicitados por ENOSA','TA01',0),
('1250020','Gas','TA01',0),
('1250021','Gasolina','TA01',0),
('1250022','Grasa','TA01',0),
('1250023','Hilos de conductor de cobre','TA01',0),
('1250024','Hojas de Sierra','TA01',60),
('1250025','Hormigón','TA01',0),
('1250026','Kerosene','TA01',0),
('1250027','Ladrillos para señalización','TA01',0),
('1250028','Letreros de desvió de tránsito','TA01',0),
('1250029','Lijas de todo tipo y elementos de desgaste','TA01',0),
('1250030','Masilla','TA01',0),
('1250031','Perno esparrago de 3/8 + arandelas + tuercas','TA01',200),
('1250032','Pernos','TA01',0),
('1250033','Piedra chancada','TA01',0),
('1250034','Piedras de esmeril','TA01',0),
('1250035','Pintura anticorrosiva','TA01',0),
('1250036','Pintura reflexiva','TA01',0),
('1250037','Pinturas de esmalte sintético','TA01',0),
('1250038','Silicona para camionetas x 03 meses','TA01',8),
('1250039','Soldadura de plomo-estaño','TA01',0),
('1250040','Soldaduras','TA01',0),
('1250041','Solvente dieléctrico','TA01',10),
('1250042','Thinner industrial','TA01',0),
('1250043','Tierra de chacra','TA01',0),
('1250044','Tocuyo - Mtto. Limpieza de Aisladores','TA01',100),
('1250045','Tornillos','TA01',0),
('1250046','Trapo industrial','TA01',50),
('1250047','Undercouting','TA01',0),
('1250048','Waype','TA01',0),
('1250049','Yeso','TA01',0),
('1260001','Computadoras','TA05',11),
('1260002','Impresora Matricial','TA05',2),
('1260003','Impresora A3','TA05',2),
('1260004','IMPRESORA Multifuncional HP 426 fdw','TA05',2),
('1260005','Escritorios','TA05',14),
('1260006','Estantes de Oficina','TA05',14),
('1260007','Folder Manila A-4','TA05',46),
('1260008','Sobre Manila A-4','TA05',247),
('1260009','Sobre Manila Extra Oficio','TA05',113),
('1260010','Fasters','TA05',2),
('1260011','Forro Vinifan','TA05',2),
('1260012','Archivador de palanca','TA05',70),
('1260013','Borrador','TA05',12),
('1260014','Lapicero Azul','TA05',8),
('1260015','Lapicero Negro','TA05',9),
('1260016','Cinta scotch 3/4 X 36 yd.','TA05',8),
('1260017','Regla Metalica 30 cm.','TA05',8),
('1260018','Resaltador Amarillo','TA05',10),
('1260019','Lapiz','TA05',5),
('1260020','Cuaderno carpeta cuadriculado','TA05',30),
('1260021','Papel A-4','TA05',30),
('1260022','Papel A-3','TA05',10),
('1260023','Papael de Lustre Azul','TA05',19),
('1260024','Papel de Lustre Rojo','TA05',27),
('1260025','Papelera 12 Lt.','TA05',14),
('1260026','Plumon punta gruesa','TA05',22),
('1270001','DESINFECTANTE - AMBIENTADOR','TA06',10),
('1270002','LEJIA','TA06',6),
('1270003','ESPONJA','TA06',20),
('1270004','FRANELA','TA06',50),
('1270005','PASTILLA PARA BAÑO','TA06',20),
('1270006','Balde Plastico','TA06',12),
('1270007','Papel Higienico','TA06',10),
('1270008','Acido Muriatico Ecologico','TA06',6),
('1270009','CERA LIQUIDA','TA06',6),
('1270010','DETERGENTE GRANULADO','TA06',10),
('1270011','BOLSAS PARA BASURA','TA06',100),
('1270012','GUANTES PARA USO DE LIMPIEZA','TA06',25),
('1270013','DEPOSITO PARA JABON LIQUIDO','TA06',6),
('1270014','TRAPEADORES','TA06',10),
('1270015','Jabon liquido','TA06',10),
('1270016','Escoba Para Patio','TA06',4),
('1270017','Tacho para Basura de Colores','TA06',4),
('1270018','Rcogedor','TA06',4),
('1270019','Balde para trapear','TA06',4);

/*Table structure for table `cargo` */

DROP TABLE IF EXISTS `cargo`;

CREATE TABLE `cargo` (
  `CODIGO` char(17) NOT NULL,
  `CODENTREGADO` char(4) NOT NULL,
  `CODRECIBIDO` char(4) NOT NULL,
  `FECHA` date NOT NULL,
  PRIMARY KEY (`CODIGO`),
  KEY `CODRECIBIDO` (`CODRECIBIDO`),
  KEY `CODENTREGADO` (`CODENTREGADO`),
  CONSTRAINT `cargo_ibfk_1` FOREIGN KEY (`CODRECIBIDO`) REFERENCES `trabajador` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `cargo_ibfk_2` FOREIGN KEY (`CODENTREGADO`) REFERENCES `trabajador` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cargo` */

insert  into `cargo`(`CODIGO`,`CODENTREGADO`,`CODRECIBIDO`,`FECHA`) values 
('CCMPP171208103851','8001','8124','2017-12-08');

/*Table structure for table `cargo_herramienta` */

DROP TABLE IF EXISTS `cargo_herramienta`;

CREATE TABLE `cargo_herramienta` (
  `CODCARGO` char(17) NOT NULL,
  `CODHERRAMIENTA` char(10) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `SERIE` varchar(50) DEFAULT NULL,
  KEY `CODHERRAMIENTA` (`CODHERRAMIENTA`),
  KEY `CODCARGO` (`CODCARGO`),
  CONSTRAINT `cargo_herramienta_ibfk_2` FOREIGN KEY (`CODHERRAMIENTA`) REFERENCES `herramienta` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `cargo_herramienta_ibfk_3` FOREIGN KEY (`CODCARGO`) REFERENCES `cargo` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cargo_herramienta` */

insert  into `cargo_herramienta`(`CODCARGO`,`CODHERRAMIENTA`,`CANTIDAD`,`SERIE`) values 
('CCMPP171208103851','1240071',1,'013033'),
('CCMPP171208103851','1240074',1,'000014'),
('CCMPP171208103851','1240073',1,'0159776'),
('CCMPP171208103851','1240072',1,'015930');

/*Table structure for table `detalleherramienta` */

DROP TABLE IF EXISTS `detalleherramienta`;

CREATE TABLE `detalleherramienta` (
  `CODHERRAMIENTA` char(10) NOT NULL,
  `IDMARCA` char(5) DEFAULT NULL,
  `IDMODELO` char(11) DEFAULT NULL,
  `SERIE` varchar(50) NOT NULL,
  `IDESTADO` char(2) NOT NULL,
  PRIMARY KEY (`SERIE`),
  KEY `CODHERRAMIENTA` (`CODHERRAMIENTA`),
  KEY `IDESTADO` (`IDESTADO`),
  KEY `IDMARCA` (`IDMARCA`),
  CONSTRAINT `detalleherramienta_ibfk_1` FOREIGN KEY (`CODHERRAMIENTA`) REFERENCES `herramienta` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detalleherramienta_ibfk_3` FOREIGN KEY (`IDESTADO`) REFERENCES `estado` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `detalleherramienta_ibfk_4` FOREIGN KEY (`IDMARCA`) REFERENCES `marca` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `detalleherramienta` */

insert  into `detalleherramienta`(`CODHERRAMIENTA`,`IDMARCA`,`IDMODELO`,`SERIE`,`IDESTADO`) values 
('1240074','M0022','M0000000028','000001','E1'),
('1240074','M0022','M0000000028','000002','E1'),
('1240074','M0022','M0000000028','000003','E1'),
('1240074','M0022','M0000000028','000005','E1'),
('1240074','M0022','M0000000028','000007','E1'),
('1240074','M0022','M0000000028','000008','E1'),
('1240074','M0022','M0000000028','000009','E1'),
('1240074','M0022','M0000000028','000010','E1'),
('1240074','M0022','M0000000028','000012','E1'),
('1240074','M0022','M0000000028','000015','E1'),
('1240074','M0022','M0000000028','000016','E1'),
('1240074','M0022','M0000000028','000017','E1'),
('1240074','M0022','M0000000028','000018','E1'),
('1240074','M0022','M0000000028','000021','E1'),
('1240074','M0022','M0000000028','000022','E1'),
('1240074','M0022','M0000000028','000027','E1'),
('1240074','M0022','M0000000028','000029','E1'),
('1240074','M0022','M0000000028','000031','E1'),
('1240074','M0022','M0000000028','000032','E1'),
('1240072','M0022','M0000000029','000230','E1'),
('1240072','M0022','M0000000029','000234','E1'),
('1240072','M0022','M0000000029','000236','E1'),
('1240072','M0022','M0000000029','000238','E1'),
('1240072','M0022','M0000000029','000239','E1'),
('1240072','M0022','M0000000029','000240','E1'),
('1240071','M0022','M0000000027','000891','E1'),
('1240071','M0022','M0000000027','000914','E1'),
('1240071','M0022','M0000000027','013003','E1'),
('1240071','M0022','M0000000027','013004','E1'),
('1240071','M0022','M0000000027','013013','E1'),
('1240071','M0022','M0000000027','013015','E1'),
('1240071','M0022','M0000000027','013020','E1'),
('1240071','M0022','M0000000027','013021','E1'),
('1240071','M0022','M0000000027','013022','E1'),
('1240071','M0022','M0000000027','013027','E1'),
('1240071','M0022','M0000000027','013031','E1'),
('1240071','M0022','M0000000027','013032','E1'),
('1240071','M0022','M0000000027','013034','E1'),
('1240071','M0022','M0000000027','013035','E1'),
('1240071','M0022','M0000000027','013036','E1'),
('1240071','M0022','M0000000027','013037','E1'),
('1240074','M0022','M0000000028','0130371','E1'),
('1240073','M0022','M0000000030','0130372','E1'),
('1240071','M0022','M0000000027','013038','E1'),
('1240071','M0022','M0000000027','013039','E1'),
('1240071','M0022','M0000000027','013040','E1'),
('1240071','M0022','M0000000027','013041','E1'),
('1240072','M0022','M0000000029','014021','E1'),
('1240073','M0022','M0000000030','014327','E1'),
('1240073','M0022','M0000000030','015140','E1'),
('1240072','M0022','M0000000029','015428','E1'),
('1240072','M0022','M0000000029','015887','E1'),
('1240072','M0022','M0000000029','015888','E1'),
('1240072','M0022','M0000000029','015889','E1'),
('1240072','M0022','M0000000029','015892','E1'),
('1240072','M0022','M0000000029','015893','E1'),
('1240072','M0022','M0000000029','015894','E1'),
('1240072','M0022','M0000000029','015899','E1'),
('1240072','M0022','M0000000029','015901','E1'),
('1240072','M0022','M0000000029','015912','E1'),
('1240072','M0022','M0000000029','015915','E1'),
('1240072','M0022','M0000000029','015922','E1'),
('1240072','M0022','M0000000029','015926','E1'),
('1240073','M0022','M0000000030','015943','E1'),
('1240073','M0022','M0000000030','015945','E1'),
('1240073','M0022','M0000000030','015947','E1'),
('1240073','M0022','M0000000030','015950','E1'),
('1240073','M0022','M0000000030','015951','E1'),
('1240073','M0022','M0000000030','015952','E1'),
('1240073','M0022','M0000000030','015953','E1'),
('1240073','M0022','M0000000030','015954','E1'),
('1240073','M0022','M0000000030','015955','E1'),
('1240073','M0022','M0000000030','015956','E1'),
('1240073','M0022','M0000000030','015958','E1'),
('1240073','M0022','M0000000030','015960','E1'),
('1240073','M0022','M0000000030','015974','E1'),
('1240073','M0022','M0000000030','015975','E1'),
('1240073','M0022','M0000000030','015980','E1'),
('1240073','M0022','M0000000030','015981','E1'),
('1240073','M0022','M0000000030','015982','E1'),
('1240083','M0005','M0000000024','1093337','E1'),
('1210019','M0001','M0000000001','123123','E1'),
('1210021','M0008','M0000000012','16D2113','E1'),
('1210028','M0021','M0000000026','170316','E1'),
('1210018','M0011','M0000000009','170400597','E1'),
('1210018','M0011','M0000000009','170400600','E1'),
('1210018','M0011','M0000000009','170500442','E1'),
('1210028','M0021','M0000000026','170718','E1'),
('1210028','M0021','M0000000026','170719','E1'),
('1210028','M0021','M0000000026','170721','E1'),
('1210028','M0021','M0000000026','170723','E1'),
('1210028','M0021','M0000000026','170725','E1'),
('1210028','M0021','M0000000026','171158','E1'),
('1210028','M0021','M0000000026','171159','E1'),
('1210028','M0021','M0000000026','171160','E1'),
('1210028','M0021','M0000000026','171161','E1'),
('1210028','M0021','M0000000026','171162','E1'),
('1210028','M0021','M0000000026','171163','E1'),
('1210014','M0008','M0000000010','17C0601','E1'),
('1210013','M0010','M0000000008','18002','E1'),
('1240031','M0017','M0000000019','3611C0A0E0','E1'),
('1210012','M0007','M0000000005','4556756','E1'),
('1210012','M0007','M0000000007','5675676','E1'),
('1210019','M0002','M0000000003','657565','E1'),
('1240084','M0001','M0000000025','7617414563','E1'),
('1240082','M0005','M0000000023','7617420540','E1'),
('1240085','M0001','','7617442468','E1'),
('1210022','M0014','','80KDV0517002','E1'),
('1210030','M0015','M0000000016','CCM-CAMDIG17-01','E1'),
('1210012','M0007','M0000000018','CCM-CAMT17-01','E1'),
('1240079','M0018','M0000000020','CCM-GENPO17-001','E1'),
('1240081','M0020','M0000000022','CCM-MAQS17-001','E1'),
('1240080','M0010','M0000000021','CCM-PFR17-01','E1'),
('1240051','M0016','M0000000017','CCM-PRH17-01','E1'),
('1240051','M0016','M0000000017','CCM-PRH17-02','E1'),
('1240051','M0016','M0000000017','CCM-PRH17-03','E1'),
('1210018','M0013','M0000000015','CCMDT001','E1'),
('1210018','M0011','M0000000014','CCMDT002','E1'),
('1210016','M0009','M0000000011','H170377710','E1'),
('1210016','M0009','M0000000011','H170378979','E1'),
('1240078','M0012','M0000000013','W9AY075493','E1'),
('1240078','M0012','M0000000013','W9AY080515','E1');

/*Table structure for table `equipos$` */

DROP TABLE IF EXISTS `equipos$`;

CREATE TABLE `equipos$` (
  `F3` double DEFAULT NULL,
  `F4` varchar(255) DEFAULT NULL,
  `F8` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `equipos$` */

insert  into `equipos$`(`F3`,`F4`,`F8`) values 
(1210012,'Cámara infrarroja portátil (termovisor)',0),
(1210013,'Luxómetro',0),
(1210014,'Meghómetro 10 kV',0),
(1210015,'Multímetro',0),
(1210016,'Pinza amperimétrica',0),
(1210017,'Probador de cables MT',1),
(1210018,'Revelador / Detector de Tensión',0),
(1210019,'Secuencímetro BT',0),
(1210020,'Secuencímetro MT',0),
(1210021,'Telurómetro',0),
(1210022,'Voltímetro para media tensión',0),
(1210023,'Pinza amperimétrica para MT',0),
(1210024,'Localizador de fallas en cable  BT',1),
(1210025,'Pértiga telescópica de 05 cuerpos',0),
(1210026,'LoadBoster',0),
(1210027,'Tierra temporaria 10KA',0),
(1210028,'Tierra temporaria 12KA',0),
(1210029,'Pistola para conector AMPAC',0),
(1210030,'Camaras Digitales',0);

/*Table structure for table `estado` */

DROP TABLE IF EXISTS `estado`;

CREATE TABLE `estado` (
  `ID` char(2) NOT NULL,
  `ESTADO` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `estado` */

insert  into `estado`(`ID`,`ESTADO`) values 
('E1','ALMACENADO'),
('E2','ENCARGADO'),
('E3','MALOGRADO'),
('E4','DEVUELTO');

/*Table structure for table `herramienta` */

DROP TABLE IF EXISTS `herramienta`;

CREATE TABLE `herramienta` (
  `CODIGO` char(10) NOT NULL,
  `HERRAMIENTA` varchar(200) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `herramienta` */

insert  into `herramienta`(`CODIGO`,`HERRAMIENTA`) values 
('1210012','Cámara infrarroja portátil (termovisor)'),
('1210013','Luxómetro'),
('1210014','Meghómetro 10 kV'),
('1210015','Multímetro'),
('1210016','Pinza amperimétrica'),
('1210017','Probador de cables MT'),
('1210018','Revelador / Detector de Tensión'),
('1210019','Secuencímetro BT'),
('1210020','Secuencímetro MT'),
('1210021','Telurómetro'),
('1210022','Voltímetro para media tensión'),
('1210023','Pinza amperimétrica para MT'),
('1210024','Localizador de fallas en cable  BT'),
('1210025','Pértiga telescópica de 05 cuerpos'),
('1210026','LOAD BUSTER '),
('1210027','Tierra Temporaria 10KA'),
('1210028','Tierra Temporaria 12KA'),
('1210029','Pistola para conector AMPAC'),
('1210030','Camaras Digitales'),
('1240001','Herramientas Eléctricas Aisladas'),
('1240002','ALICATE UNIVERSAL 8\" AISLADO 1000V STANLEY'),
('1240003','ALICATE PUNTA 8\" AISLADO 1000V STANLEY'),
('1240004','ALICATE CORTE DIAGONAL 8\" AISLADO 1000V STANLEY'),
('1240005','ALICATE PICO DE LORO 10\" AISLADO 1000V SIBILLE'),
('1240006','CUCHILLA CURVA AISLADO 1000V TULMEX'),
('1240007','DESTORNILLADORES AISLADO 1000V 7 PZ STANLEY'),
('1240008','ARCO DE SIERRA 15-200 STANLEY'),
('1240009','LLAVE FRANCESA AISLADO 1000V 10\" TRAMONTINA'),
('1240010','MARTILLO C/MANGO AISLADO FIBRA VIDRIO STANLEY'),
('1240011','MALETA PORTAHERRAMIENTAS 24\" STANLEY'),
('1240012','MORRAL PORTAHERRAMIENTAS'),
('1240013','BARRUCOS '),
('1240014','DADOS LARGOS AISLADOS C/PALANCA REVERSIBLE'),
('1240015','LLAVE ALLEN X10 PZS MM STANLEY'),
('1240016','WINCHA METRICA 100 MT. STANLEY'),
('1240017','Extractor de Fusibles NH'),
('1240018','Herramientas Civiles'),
('1240019','Buggi'),
('1240020','Palana'),
('1240021','Barreta'),
('1240022','Pico'),
('1240023','Barrilejo'),
('1240024','Plancha de pulir'),
('1240025','Plomada'),
('1240026','Comba 4 lb.'),
('1240027','Cinceles Plano y Punta'),
('1240028','Cortadora con disco diamantado'),
('1240029','Mezcladora de concreto '),
('1240030','Compactador vibrador tipo plancha'),
('1240031','Martillo Demoledor 2000W C/Generador'),
('1240032','Amoladoras'),
('1240033','Taladro Dewalt 650W'),
('1240034','Herramientas para Podas'),
('1240035','MOTOSIERRA'),
('1240036','MACHETE IDEM BELLOTA MONGO DE PLASTICO'),
('1240037','SERRUCHO DE PODA MARCA TRAMONTINA'),
('1240038','MOSQUETON'),
('1240039','LLAVE MIXTA BOCA Y CORONA STANLEY MM 14 PZ'),
('1240040','LLAVE MIXTA BOCA Y CORONA STANLEY PUL 14 PZ'),
('1240041','Herramientas para Maniobras'),
('1240042','Barrucos de 1/2'),
('1240043','Barrucos de 5/8'),
('1240044','Barrucos de 3/4'),
('1240045','Rana  25-120 mm2'),
('1240046','Tecle Rache / Cadena 1.5 Tn.'),
('1240047','Tirfor de 1 1/2 - 3 Tn.'),
('1240048','Dados tubulares largos con rachet mecanicos'),
('1240049','Soga de Nylon Duro de 1\" (estrobos)'),
('1240050','Ensunchadora Band it'),
('1240051','Prensa hidráulica para cables 35 a 240 mm2'),
('1240052','Binoculares de largo alcance'),
('1240053','Escalera de fibra embonables de 2.50 mts'),
('1240054','Escalera de fibra de vidrio de 02 cuerpos'),
('1240055','Linterna halogena recarg.220v/12v'),
('1240056','Linterna frontal tipo minero'),
('1240057','Linterna frontal \"pirata\" vehiculo'),
('1240058','SOGA DE NYLON DE 1/2\" NACIONAL'),
('1240059','SOGA DE NYLON DE 1\" NACIONAL - DURO/RIGIDA'),
('1240060','SOGA DRIZA 3/8 NACIONAL'),
('1240062','CABLE DE BATERIA'),
('1240063','GATAS DE 10 TN'),
('1240064','CABLE DE REMOLQUE'),
('1240065','LLAVE STILSON 1/2\"'),
('1240066','DESARMADOR REVERSIBLE'),
('1240067','ESLINGA DE 2\" X 1 MT'),
('1240068','ESLINGA DE 2\" X 1.5 MT'),
('1240069','ESLINGA DE 3\" X 2 MT'),
('1240070','FAJAS RACHET DE 3\" X 9 MT'),
('1240071','ARNES DE SEGURIDAD ANTICAIDA'),
('1240072','LINEA DE VIDA CON AMORTIGUACION'),
('1240073','ESTROBO AUXILIAR '),
('1240074','CONECTOR DE ANCLAJE '),
('1240075','UPS'),
('1240076','CPU COMPATIBLE CORE I3 3.7GHZ '),
('1240077','MONITOR LED 19.5\"'),
('1240078','IMPRESORA MULTIFUNCIONAL '),
('1240079','GENERADOR DE POTENCIA'),
('1240080','PROBADOR DE FASE Y ROTACION'),
('1240081','MAQUINA DE SOLDAR'),
('1240082','SIERRA DE PUNTA'),
('1240083','CUCHILLA RETRACTIL'),
('1240084','TIJERAS DE AVIACION'),
('1240085','NIVEL'),
('1240086','Tierra Temporaria 15KA');

/*Table structure for table `herramientas$` */

DROP TABLE IF EXISTS `herramientas$`;

CREATE TABLE `herramientas$` (
  `F3` double DEFAULT NULL,
  `F4` varchar(255) DEFAULT NULL,
  `F8` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `herramientas$` */

insert  into `herramientas$`(`F3`,`F4`,`F8`) values 
(1240001,'Herramientas Eléctricas Aisladas',0),
(1240002,'ALICATE UNIVERSAL 8\" AISLADO 1000V STANLEY',0),
(1240003,'ALICATE PUNTA 8\" AISLADO 1000V STANLEY',0),
(1240004,'ALICATE CORTE DIAGONAL 8\" AISLADO 1000V STANLEY',0),
(1240005,'ALICATE PICO DE LORO 10\" AISLADO 1000V SIBILLE',0),
(1240006,'CUCHILLA CURVA AISLADO 1000V TULMEX',0),
(1240007,'DESTORNILLADORES AISLADO 1000V 7 PZ STANLEY',0),
(1240008,'ARCO DE SIERRA 15-200 STANLEY',0),
(1240009,'LLAVE FRANCESA AISLADO 1000V 10\" TRAMONTINA',0),
(1240010,'MARTILLO C/MANGO AISLADO FIBRA VIDRIO STANLEY',0),
(1240011,'MALETA PORTAHERRAMIENTAS 24\" STANLEY',0),
(1240012,'MORRAL PORTAHERRAMIENTAS',22),
(1240013,'BARRUCOS ',0),
(1240014,'DADOS LARGOS AISLADOS C/PALANCA REVERSIBLE',0),
(1240015,'LLAVE ALLEN X10 PZS MM STANLEY',0),
(1240016,'WINCHA METRICA 100 MT. STANLEY',0),
(1240017,'Extractor de Fusibles NH',0),
(1240018,'Herramientas Civiles',5),
(1240019,'Buggi',2),
(1240020,'Palana',5),
(1240021,'Barreta',2),
(1240022,'Pico',2),
(1240023,'Barrilejo',5),
(1240024,'Plancha de pulir',5),
(1240025,'Plomada',4),
(1240026,'Comba 4 lb.',3),
(1240027,'Cinceles Plano y Punta',10),
(1240028,'Cortadora con disco diamantado',1),
(1240029,'Mezcladora de concreto ',1),
(1240030,'Compactador vibrador tipo plancha',1),
(1240031,'Martillo Demoledor 2000W C/Generador',1),
(1240032,'Amoladoras',0),
(1240033,'Taladro Dewalt 650W',1),
(1240034,'Herramientas para Podas',0),
(1240035,'MOTOSIERRA',0),
(1240036,'MACHETE IDEM BELLOTA MONGO DE PLASTICO',0),
(1240037,'SERRUCHO DE PODA MARCA TRAMONTINA',0),
(1240038,'MOSQUETON',0),
(1240039,'LLAVE MIXTA BOCA Y CORONA STANLEY MM 14 PZ',0),
(1240040,'LLAVE MIXTA BOCA Y CORONA STANLEY PUL 14 PZ',0),
(1240041,'Herramientas para Maniobras',0),
(1240042,'Barrucos de 1/2',0),
(1240043,'Barrucos de 5/8',0),
(1240044,'Barrucos de 3/4',0),
(1240045,'Rana  25-120 mm2',0),
(1240046,'Tecle Rache / Cadena 1.5 Tn.',0),
(1240047,'Tirfor de 1 1/2 - 3 Tn.',0),
(1240048,'Dados tubulares largos con rachet mecanicos',0),
(1240049,'Soga de Nylon Duro de 1\" (estrobos)',0),
(1240050,'Ensunchadora Band it',0),
(1240051,'Prensa hidráulica para cables 35 a 240 mm2',1),
(1240052,'Binoculares de largo alcance',0),
(1240053,'Escalera de fibra embonables de 2.50 mts',0),
(1240054,'Escalera de fibra de vidrio de 02 cuerpos',0),
(1240055,'Linterna halogena recarg.220v/12v                                                                            ',0),
(1240056,'Linterna frontal tipo minero',0),
(1240057,'Linterna frontal \"pirata\" vehiculo                                                                                                                                    ',12),
(1240058,'SOGA DE NYLON DE 1/2\" NACIONAL',0),
(1240059,'SOGA DE NYLON DE 1\" NACIONAL - DURO/RIGIDA',0),
(1240060,'SOGA DRIZA 3/8 NACIONAL',100),
(1240062,'CABLE DE BATERIA',0),
(1240063,'GATAS DE 10 TN',0),
(1240064,'CABLE DE REMOLQUE',0),
(1240065,'LLAVE STILSON 1/2\"',0),
(1240066,'DESARMADOR REVERSIBLE',0),
(1240067,'ESLINGA DE 2\" X 1 MT',0),
(1240068,'ESLINGA DE 2\" X 1.5 MT',0),
(1240069,'ESLINGA DE 3\" X 2 MT',0),
(1240070,'FAJAS RACHET DE 3\" X 9 MT',0);

/*Table structure for table `marca` */

DROP TABLE IF EXISTS `marca`;

CREATE TABLE `marca` (
  `ID` char(5) NOT NULL,
  `MARCA` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `marca` */

insert  into `marca`(`ID`,`MARCA`) values 
('M0001','STANLEY'),
('M0002','BAHCO'),
('M0003','TRUPER'),
('M0004','TRAMONTINA'),
('M0005','DWALT'),
('M0006','LG'),
('M0007','GUIDE'),
('M0008','MEGABRAS'),
('M0009','PRASEK'),
('M0010','AEMC INSTRUMENTS'),
('M0011','AMPROBE'),
('M0012','EPSON'),
('M0013','TIF'),
('M0014','DIGIVOLT '),
('M0015','PANASONIC'),
('M0016','AGRA TOOLS'),
('M0017','BOSCH'),
('M0018','HONDA'),
('M0019','WELD DAF GMF 200 '),
('M0020','WELD'),
('M0021','RITZ'),
('M0022','SAFETY - VEL');

/*Table structure for table `modelo` */

DROP TABLE IF EXISTS `modelo`;

CREATE TABLE `modelo` (
  `ID` char(11) NOT NULL,
  `MODELO` varchar(30) NOT NULL,
  `IDMARCA` char(5) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `IDMARCA` (`IDMARCA`),
  CONSTRAINT `modelo_ibfk_1` FOREIGN KEY (`IDMARCA`) REFERENCES `marca` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `modelo` */

insert  into `modelo`(`ID`,`MODELO`,`IDMARCA`) values 
('M0000000001','SJL-2017','M0001'),
('M0000000002','SJL-2016','M0001'),
('M0000000003','TRACK22','M0002'),
('M0000000004','20MP48A','M0006'),
('M0000000005','C107','M0007'),
('M0000000006','MK102','M0008'),
('M0000000007','C108','M0007'),
('M0000000008','CA813','M0010'),
('M0000000009','TIC 300 PRO','M0011'),
('M0000000010','MD10KVX','M0008'),
('M0000000011','PR202A','M0009'),
('M0000000012','MTD20KWE','M0008'),
('M0000000013','L575','M0012'),
('M0000000014','TIC 300 HV','M0011'),
('M0000000015','TIC TRACER 300 HV','M0013'),
('M0000000016','DMCSZ10','M0015'),
('M0000000017','YYQ120','M0016'),
('M0000000018','C400','M0007'),
('M0000000019','GSH 27 VC ','M0017'),
('M0000000020','EP 2500 CX','M0018'),
('M0000000021','6608','M0010'),
('M0000000022','GMF 200','M0020'),
('M0000000023','DWHT20540','M0005'),
('M0000000024','DWHT10046','M0005'),
('M0000000025','14-563','M0001'),
('M0000000026','AT-ATR13628-1-43 ','M0021'),
('M0000000027','E1HM3A','M0022'),
('M0000000028','C-1M','M0022'),
('M0000000029','LPA - 1CHS','M0022'),
('M0000000030','LI 518 180 5','M0022');

/*Table structure for table `nota_salida` */

DROP TABLE IF EXISTS `nota_salida`;

CREATE TABLE `nota_salida` (
  `CODIGO` char(12) NOT NULL,
  `COD_TRAB_ENTREG` char(4) NOT NULL,
  `COD_TRAB_RECIB` char(4) NOT NULL,
  `FECHA` datetime NOT NULL,
  `IDAREA` char(3) NOT NULL,
  `CODARTICULO` char(7) NOT NULL,
  `CANTIDAD` int(11) NOT NULL,
  `NRO_OM` char(9) NOT NULL,
  KEY `NRO_OM` (`NRO_OM`),
  KEY `CODARTICULO` (`CODARTICULO`),
  KEY `IDAREA` (`IDAREA`),
  KEY `COD_TRAB_ENTREG` (`COD_TRAB_ENTREG`),
  KEY `COD_TRAB_RECIB` (`COD_TRAB_RECIB`),
  CONSTRAINT `nota_salida_ibfk_2` FOREIGN KEY (`CODARTICULO`) REFERENCES `articulo` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `nota_salida_ibfk_3` FOREIGN KEY (`IDAREA`) REFERENCES `area` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `nota_salida_ibfk_4` FOREIGN KEY (`COD_TRAB_ENTREG`) REFERENCES `trabajador` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `nota_salida_ibfk_5` FOREIGN KEY (`COD_TRAB_RECIB`) REFERENCES `trabajador` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `nota_salida` */

insert  into `nota_salida`(`CODIGO`,`COD_TRAB_ENTREG`,`COD_TRAB_RECIB`,`FECHA`,`IDAREA`,`CODARTICULO`,`CANTIDAD`,`NRO_OM`) values 
('171128104421','8001','8038','2017-11-28 10:44:25','103','1210003',1,'500275578'),
('171128112618','8001','8072','2017-11-28 11:26:22','105','1210008',3,'500252525'),
('171128112618','8001','8072','2017-11-28 11:26:22','105','1210009',1,'500252525'),
('171128113408','8001','8072','2017-11-28 11:34:11','105','1210010',1,'500252525'),
('171128120042','8001','8032','2017-11-28 12:00:44','102','1210001',18,'500275646'),
('171128122427','8001','8047','2017-11-28 12:24:31','104','1210011',2,'500252525'),
('171128123202','8001','8000','2017-11-28 12:32:03','109','1210011',1,'500252525'),
('171129115410','8001','8005','2017-11-29 11:54:15','101','1210008',1,'500252525'),
('171130053029','8001','8015','2017-11-30 05:30:36','101','1210008',1,'500252525'),
('171130053730','8001','8010','2017-11-30 05:37:33','104','1220030',7,'500252525'),
('171130054038','8001','8065','2017-11-30 05:40:40','105','1220030',4,'500252525'),
('171130054144','8001','8018','2017-11-30 05:41:47','102','1220030',6,'500252525'),
('171130194404','8001','8009','2017-11-30 19:44:07','104','1210003',2,'500275431'),
('17121101034','8001','8017','2017-12-01 10:10:37','104','1210006',1,'500252525'),
('17121174905','8001','8037','2017-12-01 17:49:07','101','1210003',3,'500271863'),
('17121175156','8001','8011','2017-12-01 17:51:58','102','1210001',6,'500175646'),
('171204082502','8001','8011','2017-12-04 08:25:04','102','1210003',2,'500275646'),
('171204145846','8001','8007','2017-12-04 14:59:02','104','1220022',1,'500275431'),
('171206084606','8001','8011','2017-12-06 08:46:07','102','1210001',20,'500275646'),
('171206084606','8001','8011','2017-12-06 08:46:12','102','1210003',5,'500275646'),
('171206084713','8001','8011','2017-12-06 08:47:14','102','1210003',2,'500274188'),
('171206145559','8001','8011','2017-12-06 14:56:02','102','1210003',3,'500175646'),
('171207090728','8001','8015','2017-12-07 09:07:31','101','1210003',1,'500271863'),
('171208084726','8001','8008','2017-12-08 08:47:28','105','1210003',1,'500252525'),
('171211082053','8001','8032','2017-12-11 08:20:54','102','1210001',16,'500275629'),
('171211082053','8001','8032','2017-12-11 08:20:56','102','1210003',4,'500275629');

/*Table structure for table `orden_mantenimiento` */

DROP TABLE IF EXISTS `orden_mantenimiento`;

CREATE TABLE `orden_mantenimiento` (
  `NRO` char(9) NOT NULL,
  PRIMARY KEY (`NRO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `orden_mantenimiento` */

/*Table structure for table `persona` */

DROP TABLE IF EXISTS `persona`;

CREATE TABLE `persona` (
  `DNI` char(8) NOT NULL,
  `NOMBRES` varchar(30) NOT NULL,
  `APELLIDOP` varchar(30) NOT NULL,
  `APELLIDOM` varchar(30) NOT NULL,
  `FECHANACIMIENTO` date NOT NULL,
  PRIMARY KEY (`DNI`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `persona` */

insert  into `persona`(`DNI`,`NOMBRES`,`APELLIDOP`,`APELLIDOM`,`FECHANACIMIENTO`) values 
('02642599','Anibal','Calderon','Garcia','2017-11-20'),
('02709857','Jorge Eduardo','Chunga','Garcia','2017-11-20'),
('02792991','Angel','Ceferino','Cordova','2017-11-20'),
('02822709','Manuel Enrique','Ipanaque','Montero','2017-12-06'),
('02840831','Yave','Palomino','Arbayza','2017-11-20'),
('02887065','Pascual','Yangua','Chuquicondor','2017-12-06'),
('02893467','Roder Luis','Torres','Lizano','2017-12-06'),
('03234191','Walter','Guerrero','Vilcherrez','2017-11-20'),
('03474217','Guillermo Tomas','Benites','Sosa','2017-12-06'),
('03508104','Pedro Miguel','Lopez','Correa','2017-12-01'),
('03564460','Luis','Estrada','Pardo','2017-11-20'),
('03621916','Walter','Flores','Ruiz','2017-11-20'),
('03632634','Luis Humberto','Tavara','Sabalu','2017-11-20'),
('03643734','Mario Martin','Ruiz','Ramirez','2017-12-06'),
('03659044','Jaime Santiago','Mereci','Valdiviezo','2017-11-20'),
('03661740','Luis Alberto','Gutierrez','Requena','2017-11-20'),
('03681144','Luis Manuel','Torres','Cordova','2017-11-20'),
('03878463','Cesar Augusto','Navarro','Gonzales','2017-12-06'),
('03901810','Carlos Manuel','Valladares ','Carrasco','2017-12-06'),
('06572087','Yul','Palomino','Gutierrez','2017-12-06'),
('10000001','Constancio Jose','Ramos ','Moscol','2017-12-06'),
('10000002','Pedro Miguel','Sandoval','Valdiviezo','2017-12-07'),
('10000003','Santos Taurino','Campoverde ','alama','2017-12-07'),
('10000004','Victor Raul','Galvez','Cordova','2017-12-07'),
('10000005','Cristhian','Valladares','Tello','2017-12-07'),
('10000006','Harold','Alburqueque','Durand','2017-12-07'),
('10000007','Josue Jesus','Guevara','Reque','2017-12-07'),
('16555947','Edwin Homero','Yaipen','Custodio','2017-11-20'),
('16696117','Nestor Martin','Guzman','Campos','2017-12-06'),
('17537336','Cesar','Coronado','Silupu','2017-11-15'),
('20113585','Percy Juan','Verastegui','Lazo','2017-11-28'),
('21881121','Victor Angel','Almeyda','Tasayco','2017-11-20'),
('2771617','Pedro Lizandro','Iturria','Yarleque','2017-11-15'),
('3561817','Victor Andres','Correa','Nieves','2017-11-20'),
('3569871','Gaston','Navarro','Castillo','2017-11-20'),
('3651535','Manuel Estevez','Vasquez','Pacherrez','2017-11-20'),
('3669617','Edward Alejandro','Curay','Herna','2017-11-20'),
('3679064','Jose Javier','Ancajima','Reyes','2017-11-20'),
('3879045','Raul','Suarez','Nole','2017-11-20'),
('40088413','Ducblis','Castillo','Cevallos','2017-11-20'),
('40302255','Elber','Tavara','Saavedra','2017-11-20'),
('40569500','Marco','Espinoza','Sanchez','2017-11-20'),
('40693789','Jorge Nemesio','Arevalo','Cevallos','2017-11-20'),
('40800513','Jorge Salvador','Serquen','Zuñiga','2017-12-06'),
('41053324','Jimmy Ronald','Ynoquio ','Garcia','2017-11-20'),
('41221938','Joel Praxedes','Alejo','Gomez','2017-12-06'),
('41511901','Roberto Carlos','Tavara','Rivera','2017-11-20'),
('41600491','Carlos','Litano','Coveñas','2017-11-20'),
('41715724','Danny Daniel','Castillo','Dioses','2017-11-20'),
('41735712','Jose Alberto','Santamaria','Bellodas','2017-11-20'),
('41795541','Wilmer Darwin','Hidalgo','Abad','2017-11-20'),
('41935445','Ronald Williams','Martinez','Muñoz','2017-12-06'),
('42210186','Nelson Enrique','Anacleto','Villegas','2017-12-06'),
('42843559','Luis Carlos','Agurto','Meca','2017-11-20'),
('43246013','Javier','Huamnchumo','Llenque','2017-11-20'),
('43262539','Tonny Cayetano','Heredia','Perez','2017-11-20'),
('43666076','Maria Esther','Litano','Coveñas','2017-11-20'),
('43878294','Santos Alfredo','Sandoval','Namuche','2017-11-20'),
('44182117','Joshua','Ormachea','Del Aguila','1986-12-29'),
('44316318','Erick','Sernaque','Rivera','2017-11-20'),
('44444444','Jose David','Galvez','Gonzales','2017-11-20'),
('44444445','Elvis','Mozombite','Zulueta','2017-11-20'),
('44444446','Paulo','Curay','Herna','2017-11-20'),
('44454276','Luis Enrique','Tavara','Rivera','2017-11-20'),
('44569843','Rufino','Ibarra','Coronado','2017-12-06'),
('44633130','Yunior','Cornejo','Urteaga','2017-11-20'),
('44775997','Juan Augusto','Santos','Villegas','2017-11-20'),
('44803053','Esdras Daniel','Elera','Castillo','2017-11-20'),
('45151584','Renzo Kield','Inga','Zacarias','2017-11-20'),
('45380816','Harry','Mori','Lopez','2017-11-20'),
('45517898','Erly Erson','Cuadros','Castillo','2017-12-06'),
('45748150','Cristhian','Ramos','Berru','2017-11-20'),
('45764210','Jose Joaquin','Ramos','Berru','2017-11-20'),
('45818963','Paul','Oniel','Ortega Palacios','2017-12-06'),
('45823555','Diomedes Ivan','Ubillus','Ruiz','2017-12-07'),
('45884287','Keny Irvin','Pingo','Castillo','2017-12-06'),
('46110143','Guillermo Jesus','De la Cruz','Alcocer','2017-12-06'),
('46248420','Jarol','Gonzales','Delgado','2017-11-20'),
('46543376','Darwin','Miñope','Yaipen','2017-11-15'),
('46642210','Irvin','Vasquez','Cordova','2017-11-15'),
('46691311','Hermiz Jhon','Garcia','Hernandez','2017-11-20'),
('46870086','Jose Aldair','Castillo','Moreira','2017-12-07'),
('46932616','Jhon','Agurto','Alburqueque','2017-11-20'),
('47255879','Danni Efrain','Acaro','Hernadez','1991-09-05'),
('47468968','Carlos Alberto','Godos','Peña','2017-11-20'),
('47817460','Edson Joel','Moran','Calderon','2017-11-20'),
('47854139','Edinson','Yarleque','Vilchez','2017-11-20'),
('48308452','Kedyon Joel','Flores','Navarro','2017-12-06'),
('48632942','Miguel Alfredo','Cielo','Briceño','2017-11-20'),
('48644685','Veronica','Ramos','Berru','2017-11-20'),
('48720806','Jimmy Maico','Flores','Navarro','2017-12-06'),
('70038532','Pool','Palacios','Changano','2017-11-20'),
('70046216','Javier Arturo','Reto','Castillo','2017-11-20'),
('70087251','Percy Junior','Castillo','Carrion','2017-11-20'),
('70384817','Julio Cesar','Nima','Vasquez','2017-11-20'),
('71061812','Walter','Palacios','Rodriguez','2017-11-20'),
('71299351','Elvis','Mozombite','Zulueta','2017-11-20'),
('71997581','Anthony Christian','Silupu','Cochachi','2017-11-20'),
('72624976','Luis Alvaro','Zapata','Villar','2017-12-06'),
('73173592','Marco Antonio','Sandoval','Ordinola','2017-11-20'),
('73236834','Humberto Marlui','Requena','Castillo','2017-12-07'),
('73354201','Jose benjamin','Chong','Guerrero','2017-11-20'),
('75104119','Luis Kevin','Atoche','De la Cruz','2017-11-20'),
('75442583','Alexander','Navarro','Rojas','2017-11-15'),
('76942722','Josue Jhonatan','Otero','Querevalu','2017-11-20'),
('80315191','Pedro Miguel','Sabalu','Martinez','2017-12-06'),
('80662265','Jose David','Espinoza','Becerra','2017-11-20');

/*Table structure for table `puesto` */

DROP TABLE IF EXISTS `puesto`;

CREATE TABLE `puesto` (
  `ID` char(3) NOT NULL,
  `PUESTO` varchar(30) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `puesto` */

insert  into `puesto`(`ID`,`PUESTO`) values 
('201','GERENTE'),
('202','ADMINISTRADOR'),
('203','SUPERVISOR'),
('204','JEFE DE CUADRILLA'),
('205','TECNICO ELECTRICISTA'),
('206','TECNICO CHOFER'),
('207','AYUDANTE'),
('208','ENCARGADO');

/*Table structure for table `recarga` */

DROP TABLE IF EXISTS `recarga`;

CREATE TABLE `recarga` (
  `ID` char(7) NOT NULL,
  `CODVEHICULO` char(5) NOT NULL,
  `IDCOMBUSTIBLE` char(5) NOT NULL,
  `CANTCOMBUSTIBLE` int(11) NOT NULL,
  `KM` int(11) NOT NULL,
  `FECHA` date NOT NULL,
  `CODTRABAJADOR` char(5) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `CODVEHICULO` (`CODVEHICULO`),
  CONSTRAINT `recarga_ibfk_1` FOREIGN KEY (`CODVEHICULO`) REFERENCES `vehiculo` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `recarga` */

/*Table structure for table `tipo_articulo` */

DROP TABLE IF EXISTS `tipo_articulo`;

CREATE TABLE `tipo_articulo` (
  `ID` char(4) NOT NULL,
  `TIPO` varchar(20) NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `tipo_articulo` */

insert  into `tipo_articulo`(`ID`,`TIPO`) values 
('TA01','MATERIAL'),
('TA02','EPP'),
('TA03','OTROS'),
('TA04','SEÑALIZACION'),
('TA05','UTILES DE OFICINA'),
('TA06','UTILES DE ASEO'),
('TA07','EQUIPOS'),
('TA08','HERRAMIENTAS');

/*Table structure for table `trabajador` */

DROP TABLE IF EXISTS `trabajador`;

CREATE TABLE `trabajador` (
  `CODIGO` char(4) NOT NULL,
  `DNI` char(8) NOT NULL,
  `IDPUESTO` char(3) NOT NULL,
  `IDAREA` char(3) NOT NULL,
  `CORREO` varchar(60) NOT NULL,
  `CODIGOUN` char(4) DEFAULT NULL,
  PRIMARY KEY (`CODIGO`),
  KEY `DNI` (`DNI`),
  KEY `IDPUESTO` (`IDPUESTO`),
  KEY `IDAREA` (`IDAREA`),
  KEY `CODIGOUN` (`CODIGOUN`),
  CONSTRAINT `trabajador_ibfk_2` FOREIGN KEY (`DNI`) REFERENCES `persona` (`DNI`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `trabajador_ibfk_3` FOREIGN KEY (`IDPUESTO`) REFERENCES `puesto` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `trabajador_ibfk_4` FOREIGN KEY (`CODIGOUN`) REFERENCES `unidadnegocio` (`CODIGO`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `trabajador` */

insert  into `trabajador`(`CODIGO`,`DNI`,`IDPUESTO`,`IDAREA`,`CORREO`,`CODIGOUN`) values 
('8000','20113585','201','109','pverastegui@procesosproductivos.com','UN01'),
('8001','44182117','208','107','Joshuaormachea1987@gmail.com','UN01'),
('8002','46642210','205','105','irvin110389@hotmail.com','UN01'),
('8003','2771617','203','108','liturria@procesosproductivos.com','UN01'),
('8004','46543376','203','105','dminope@procesosproductivos.com','UN01'),
('8005','75442583','205','101','navrojas.96@hotmail.com','UN01'),
('8006','17537336','203','104','ccoronado@procesosproductivos.com','UN01'),
('8007','3561817','204','104','vcorrea@procesosproductivos.com','UN01'),
('8008','42843559','204','105','lagurto@procesosproductivos.com','UN01'),
('8009','3879045','204','104','rsuarez@procesosproductivos.com ','UN01'),
('8010','3651535','205','104','mvasquez@procesosproductivos.com','UN01'),
('8011','43262539','203','102','tcayetano@procesosproductivos.com','UN01'),
('8012','45380816','203','104','hmori@procesosproductivos.com','UN01'),
('8013','70046216','206','105','logisticaccmpp@gmail.com','UN01'),
('8014','41053324','203','101','jynoquio@procesosproductivos.com','UN01'),
('8015','46932616','205','101','alianza994@hotmail.com','UN01'),
('8016','3569871','204','103','gnavarro@procesosproductivos.com','UN01'),
('8017','3679064','206','104','jjancajima15@gmail.com','UN01'),
('8018','44454276','205','102','luis_tavaraxx@hotmail.com','UN01'),
('8019','44444446','206','104','logisticaccmpp@gmail.com','UN01'),
('8020','45764210','206','101','jramos@procesosproductivos.com','UN01'),
('8021','40693789','206','103','logisticaccmpp@gmail.com','UN01'),
('8022','75104119','205','104','logisticaccmpp@gmail.com','UN01'),
('8023','41795541','204','103','logisticaccmpp@gmail.com','UN01'),
('8024','45748150','206','105','cramos@procesosproductivos.com','UN01'),
('8025','3669617','204','101','ecuray@procesosproductivos.com','UN01'),
('8026','43666076','202','109','elitano@procesosproductivos.com','UN01'),
('8027','43878294','207','102','logisticaccmpp@gmail.com','UN01'),
('8028','40302255','207','105','logisticaccmpp@gmail.com','UN01'),
('8029','47817460','205','102','ejmc383@gmail.com','UN01'),
('8030','03659044','206','101','logisticaccmpp@gmail.com','UN01'),
('8031','03632634','206','102','logisticaccmpp@gmail.com','UN01'),
('8032','03681144','204','102','ltorres@procesosproductivos.com','UN01'),
('8033','03621916','207','105','logisticaccmpp@gmail.com','UN01'),
('8034','03661740','206','104','logisticaccmpp@gmail.com','UN01'),
('8035','46248420','205','104','jarol19_13@hotmail.com','UN01'),
('8036','47255879','206','101','logisticaccmpp@gmail.com','UN01'),
('8037','73354201','207','101','jcsergen2016@gmail.com','UN01'),
('8038','44316318','205','103','erik_16_16@hotmail.com','UN01'),
('8039','21881121','205','104','angel.almeyda@hotmail.com','UN01'),
('8040','71061812','206','105','logisticaccmpp@gmail.com','UN01'),
('8041','47854139','203','110','eyarleque@procesosproductivos.com','UN01'),
('8042','47468968','205','106','logisticaccmpp@gmail.com','UN01'),
('8043','46691311','207','105','logisticaccmpp@gmail.com','UN01'),
('8044','40088413','207','109','dcastillo@procesosproductivos.com','UN01'),
('8045','44633130','203','104','ycornejo@procesosproductivos.com','UN01'),
('8046','41511901','205','104','rtavararivera@gmail.com','UN01'),
('8047','02792991','206','104','djanghelus848@gmail.com','UN01'),
('8048','70087251','203','103','pcastillo@procesosproductivos.com','UN01'),
('8049','41715724','203','108','ddcastillo@procesosproductivos.com','UN01'),
('8050','48632942','207','105','logisticaccmpp@gmail.com','UN01'),
('8051','80662265','205','101','logisticaccmpp@gmail.com','UN01'),
('8052','76942722','207','102','logisticaccmpp@gmail.com','UN01'),
('8053','48644685','202','109','vramos@procesosproductivos.com','UN01'),
('8054','02642599','207','105','logisticaccmpp@gmail.com','UN01'),
('8055','44775997','204','104','logisticaccmpp@gmail.com','UN01'),
('8056','70384817','207','105','logisticaccmpp@gmail.com','UN01'),
('8057','45151584','203','104','ringa@procesosproductivos.com','UN01'),
('8058','41735712','203','104','jsantamaria@procesosproductivos.com','UN01'),
('8059','02709857','203','108','jchunga@procesosproductivos.com','UN01'),
('8060','40569500','205','102','logisticaccmpp@gmail.com','UN01'),
('8061','03234191','205','105','logisticaccmpp@gmail.com','UN01'),
('8062','73173592','205','102','logisticaccmpp@gmail.com','UN01'),
('8063','71299351','207','105','logisticaccmpp@gmail.com','UN01'),
('8064','43246013','203','103','jhuamanchumo@procesosproductivos.com','UN01'),
('8065','41600491','207','105','dminope@procesosproductivos.com','UN01'),
('8066','70038532','205','101','logisticaccmpp@gmail.com','UN01'),
('8067','02840831','206','104','logisticaccmpp@gmail.com','UN01'),
('8068','44444444','204','105','jgalvez@procesosproductivos.com','UN01'),
('8069','16555947','203','104','eyaipen@procesosproductivos.com','UN01'),
('8070','03564460','206','104','logisticaccmpp@gmail.com','UN01'),
('8071','44444445','207','105','logisticaccmpp@gmail.com','UN01'),
('8072','44803053','203','105','eelera@procesosproductivos.com','UN01'),
('8073','71997581','205','102','logisticaccmpp@gmail.com','UN01'),
('8100','03508104','208','107','plopez@procesosproductivos.com','UN02'),
('8101','45517898','205','104','logisticaccmpp@gmail.com','UN02'),
('8102','02887065','204','104','logisticaccmpp@gmail.com','UN02'),
('8103','45884287','206','104','logisticaccmpp@gmail.com','UN02'),
('8104','02893467','203','104','logisticaccmpp@gmail.com','UN02'),
('8105','02822709','206','104','logisticaccmpp@gmail.com','UN02'),
('8106','80315191','205','101','logisticaccmpp@gmail.com','UN02'),
('8108','45818963','205','101','logisticaccmpp@gmail.com','UN02'),
('8109','42210186','203','104','logisticaccmpp@gmail.com','UN02'),
('8110','03901810','206','104','logsticaccmpp@gmail.com','UN02'),
('8111','03878463','204','104','cnavarro@procesosproductivos.com','UN02'),
('8112','72624976','205','104','logisticaccmpp@gmail.com','UN02'),
('8113','41221938','205','104','logisticaccmpp@gmail.com','UN02'),
('8114','41935445','203','104','logisticaccmpp@gmail.com','UN02'),
('8115','03474217','205','104','logisticaccmpp@gmail.com','UN02'),
('8116','44569843','205','104','logisticaccmpp@gmail.com','UN02'),
('8117','46110143','205','101','logisticaccmpp@gmail.com','UN02'),
('8118','48308452','205','101','logisticaccmpp@gmail.com','UN02'),
('8119','03643734','207','106','logisticaccmpp@gmail.com','UN02'),
('8120','40800513','203','109','logisticaccmpp@gmail.com','UN02'),
('8121','06572087','201','109','logisticaccmpp@gmail.com','UN02'),
('8122','10000001','206','101','logisticaccmpp@gmail.com','UN02'),
('8123','16696117','203','101','logisticaccmpp@gmail.com','UN02'),
('8124','48720806','207','101','logisticaccmpp@gmail.com','UN02'),
('8125','10000002','204','106','logisticaccmpp@gmail.com','UN02'),
('8126','10000003','205','106','logisticaccmpp@gmail.com','UN02'),
('8127','10000004','205','101','logisticaccmpp@gmail.com','UN02'),
('8128','10000005','205','101','logisticaccmpp@gmail.com','UN02'),
('8130','45823555','207','106','logisticaccmpp@gmail.com','UN02'),
('8131','10000006','206','105','logisticaccmpp@gmail.com','UN02'),
('8132','10000007','203','105','logisticaccmpp@gmail.com','UN02'),
('8133','46870086','207','109','logisticaccmpp@gmail.com','UN02'),
('8134','73236834','207','109','logisticaccmpp@gmail.com','UN02');

/*Table structure for table `unidadnegocio` */

DROP TABLE IF EXISTS `unidadnegocio`;

CREATE TABLE `unidadnegocio` (
  `CODIGO` char(4) NOT NULL,
  `UNIDADNEGOCIO` varchar(100) NOT NULL,
  `DIRECCION` varchar(200) NOT NULL,
  PRIMARY KEY (`CODIGO`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `unidadnegocio` */

insert  into `unidadnegocio`(`CODIGO`,`UNIDADNEGOCIO`,`DIRECCION`) values 
('UN01','SULLANA','CALLE SANTA TERESA #620 URB. STA. ROSA - SULLANA'),
('UN02','PAITA','COMUNIDAD CAMPESINA SAN FRANCISCO MZ-C2 LT 16-17 - PAITA');

/*Table structure for table `vehiculo` */

DROP TABLE IF EXISTS `vehiculo`;

CREATE TABLE `vehiculo` (
  `CODIGO` char(5) NOT NULL,
  `PLACA` char(7) NOT NULL,
  `MARCA` varchar(40) NOT NULL,
  `IDAREA` char(3) NOT NULL,
  PRIMARY KEY (`CODIGO`),
  KEY `IDAREA` (`IDAREA`),
  CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`IDAREA`) REFERENCES `area` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vehiculo` */

insert  into `vehiculo`(`CODIGO`,`PLACA`,`MARCA`,`IDAREA`) values 
('101','ASB-701','JAC','102'),
('102','C1K-939','NISSAN','103'),
('103','ARX-862','FOTON','109'),
('104','P2U-767','NISSAN','105'),
('105','P3S-927','NISSAN','104'),
('106','P3S-928','NISSAN','104'),
('107','P3S-933','NISSAN','104'),
('108','P3S-934','NISSAN','102'),
('109','P3S-937','NISSAN','105'),
('110','P3S-944','NISSAN','101'),
('111','W2V-927','HYUNDAI','109');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
