-- --------------------------------------------------------
-- Host:                         localhost
-- Server version:               10.4.6-MariaDB - mariadb.org binary distribution
-- Server OS:                    Win64
-- HeidiSQL Version:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Dumping database structure for rumahsakit
CREATE DATABASE IF NOT EXISTS `rumahsakit` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `rumahsakit`;

-- Dumping structure for table rumahsakit.dokter
CREATE TABLE IF NOT EXISTS `dokter` (
  `id_dokter` varchar(5) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `keahlian` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`id_dokter`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table rumahsakit.dokter: ~2 rows (approximately)
/*!40000 ALTER TABLE `dokter` DISABLE KEYS */;
INSERT INTO `dokter` (`id_dokter`, `nama`, `alamat`, `keahlian`) VALUES
	('D-01', 'Riswan', 'Bandung', 'Jantung'),
	('D-02', 'Rudi', 'Bandung', 'Bedah'),
	('D-03', 'Sukmadi', 'Banten', 'Tenaga Dalam');
/*!40000 ALTER TABLE `dokter` ENABLE KEYS */;

-- Dumping structure for table rumahsakit.obat
CREATE TABLE IF NOT EXISTS `obat` (
  `id_obat` varchar(5) NOT NULL,
  `nama_obat` varchar(50) DEFAULT NULL,
  `jenis_obat` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id_obat`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table rumahsakit.obat: ~2 rows (approximately)
/*!40000 ALTER TABLE `obat` DISABLE KEYS */;
INSERT INTO `obat` (`id_obat`, `nama_obat`, `jenis_obat`) VALUES
	('PM-01', 'Oskadon', 'Tablet'),
	('PS-01', 'Inzana', 'Cair Anak');
/*!40000 ALTER TABLE `obat` ENABLE KEYS */;

-- Dumping structure for table rumahsakit.pemeriksaan
CREATE TABLE IF NOT EXISTS `pemeriksaan` (
  `id_periksa` varchar(5) NOT NULL,
  `tgl_periksa` date DEFAULT NULL,
  `rawat` varchar(10) DEFAULT NULL,
  `diagnosa` varchar(30) DEFAULT NULL,
  `penyakit` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id_periksa`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table rumahsakit.pemeriksaan: ~2 rows (approximately)
/*!40000 ALTER TABLE `pemeriksaan` DISABLE KEYS */;
INSERT INTO `pemeriksaan` (`id_periksa`, `tgl_periksa`, `rawat`, `diagnosa`, `penyakit`) VALUES
	('1', '2020-07-14', 'tidak', 'berat', 'miskin'),
	('2', '2020-09-09', 'Ya', 'Berat', 'bebas');
/*!40000 ALTER TABLE `pemeriksaan` ENABLE KEYS */;

-- Dumping structure for table rumahsakit.rawatinap
CREATE TABLE IF NOT EXISTS `rawatinap` (
  `kode_ruangan` varchar(5) NOT NULL,
  `nama_ruangan` varchar(30) DEFAULT NULL,
  `id_pasien` varchar(5) DEFAULT NULL,
  `nama_pasien` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`kode_ruangan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table rumahsakit.rawatinap: ~0 rows (approximately)
/*!40000 ALTER TABLE `rawatinap` DISABLE KEYS */;
INSERT INTO `rawatinap` (`kode_ruangan`, `nama_ruangan`, `id_pasien`, `nama_pasien`) VALUES
	('M-01', 'Melati', '101', 'Gilang');
/*!40000 ALTER TABLE `rawatinap` ENABLE KEYS */;

-- Dumping structure for table rumahsakit.registrasi
CREATE TABLE IF NOT EXISTS `registrasi` (
  `id_pasien` varchar(5) NOT NULL,
  `nama` varchar(50) DEFAULT NULL,
  `alamat` varchar(50) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `no_telp` varchar(12) DEFAULT NULL,
  PRIMARY KEY (`id_pasien`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table rumahsakit.registrasi: ~5 rows (approximately)
/*!40000 ALTER TABLE `registrasi` DISABLE KEYS */;
INSERT INTO `registrasi` (`id_pasien`, `nama`, `alamat`, `email`, `no_telp`) VALUES
	('101', 'Gilang', 'JL.Barunagri', 'mohammadgilangg10@gmail.com', '089527056776'),
	('102', 'Saddam', 'jl.Garut', 'saddam@gmail.com', '08976578921'),
	('103', 'rizal', 'jl.ledeng', 'rizal@gmail.com', '0223457981'),
	('104', 'rafi', 'jln.Pahwalan', 'rafi@gmail.com', '09812128131'),
	('105', 'Kiki', 'jl.Dago', 'kiki@gmail.com', '0897251212'),
	('106', 'Sumad', 'bandung', 'hehe', '0857'),
	('107', 'sueb', 'bandung', 'hehe', '012');
/*!40000 ALTER TABLE `registrasi` ENABLE KEYS */;

-- Dumping structure for table rumahsakit.ruangan
CREATE TABLE IF NOT EXISTS `ruangan` (
  `kode_ruangan` varchar(6) NOT NULL,
  `nama_ruangan` varchar(35) DEFAULT NULL,
  PRIMARY KEY (`kode_ruangan`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Dumping data for table rumahsakit.ruangan: ~2 rows (approximately)
/*!40000 ALTER TABLE `ruangan` DISABLE KEYS */;
INSERT INTO `ruangan` (`kode_ruangan`, `nama_ruangan`) VALUES
	('M-01', 'Melati'),
	('M-02', 'Melati Standar');
/*!40000 ALTER TABLE `ruangan` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
