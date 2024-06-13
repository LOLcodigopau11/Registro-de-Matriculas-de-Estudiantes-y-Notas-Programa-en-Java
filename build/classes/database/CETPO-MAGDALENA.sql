
create database magdalenacetpro;

use magdalenacetpro;

CREATE TABLE tb_alumno	(	
cod_alumno CHAR(5) PRIMARY KEY, 
nombre	VARCHAR(100) NOT NULL,	
apellido VARCHAR(100) NOT NULL,	
dni INT	UNIQUE NOT NULL,
direccion VARCHAR(100) NOT NULL,	
telefono INT UNIQUE NOT NULL,
correo VARCHAR(100) UNIQUE
);

INSERT INTO tb_alumno VALUES ('A0001', 'Angie', 'Gibaja Mauricio', 12345678, 'Chacarita 145', 911223344, 'concodra@example.'),
			('A0002', 'Mateo', 'González Pérez', 42414546,'Jr. Los Jazmines', 970987654, 'mate297@gmail.com'),
            ('A0003', 'Emilio', 'Plasencia Solís', 43210987, 'Jirón Los Eucaliptos', 979876543, '1506506@senati.pe'),
            ('A0004', 'Juan', 'Pérez Gómez', 40000004, 'Av. Los Rosales 123', 900000004, 'juanpg@example.com'),
			('A0005', 'Camila', 'Hernández Rodríguez', 40000005, 'Calle Las Orquídeas 456', 900000005, 'camila.hr@example.com'),
			('A0006', 'Luis', 'Martínez López', 40000006, 'Jr. Las Margaritas 789', 900000006, 'luismart@example.com'),
			('A0007', 'Karla', 'Sánchez García', 40000007, 'Pasaje Los Girasoles 1011', 900000007, 'karla.sg@example.com'),
			('A0008', 'Lucas', 'Rodríguez González', 40000008, 'Av. Los Cerezos 1213', 900000008, 'lucasrg@example.com'),
			('A0009', 'Valentina', 'Fernández Martínez', 40000009, 'Calle Las Violetas 1415', 900000009, 'valentina.fm@example.com'),
			('A0010', 'Sofía', 'López Sánchez', 40000010, 'Jr. Los Tulipanes 1617', 900000010, 'sofials@example.com'),
			('A0011', 'Miguel', 'García Rodríguez', 40000011, 'Av. Los Girasoles 1819', 900000011, 'miguelgr@example.com'),
			('A0012', 'Elena', 'Pérez Martínez', 40000012, 'Calle Los Naranjos 2021', 900000012, 'elenapm@example.com'),
			('A0013', 'Javier', 'Fernández López', 40000013, 'Jr. Las Azucenas 2223', 900000013, 'javierfl@example.com'),
			('A0014', 'Sara', 'Sánchez Pérez', 40000014, 'Pasaje Las Rosas 2425', 900000014, 'sarasp@example.com'),
			('A0015', 'Diego', 'Martínez García', 40000015, 'Av. Las Hortensias 2627', 900000015, 'diegomg@example.com'),
			('A0016', 'Paula', 'Gómez Rodríguez', 40000016, 'Calle Las Gardenias 2829', 900000016, 'paulagr@example.com'),
			('A0017', 'Hugo', 'González Martínez', 40000017, 'Pasaje Las Orquídeas 3031', 900000017, 'hugogm@example.com'),
			('A0018', 'Ana', 'Rodríguez López', 40000018, 'Av. Los Lirios 3233', 900000018, 'anarl@example.com'),
			('A0019', 'Daniel', 'Martínez García', 40000019, 'Jr. Los Geranios 3435', 900000019, 'danielmg@example.com'),
			('A0020', 'María', 'González Sánchez', 40000020, 'Calle Los Claveles 3637', 900000020, 'mariags@example.com'),
            ('A0021', 'David', 'Castillo Sánchez', 40000021, 'Calle Los Claveles 3637', 900000021, 'daviss@example.com'),
            ('A0022', 'Daniel', 'González Romero', 40000022, 'Calle Los Claveles 3637', 900000022, 'denielle@example.com'),
            ('A0023', 'Alvaro', 'Gutierrez Ramos', 40000023, 'Calle Los Claveles 3637', 900000023, 'alavardon@example.com'),
            ('A0024', 'Luis', 'Quintana Perez', 40000024, 'Calle Los Claveles 3637', 900000024, 'luusiño@example.com'),
            ('A0025', 'Raul', 'De las Casas Guitierrez', 40000025, 'Calle Los Claveles 3637', 900000025, 'laraul@example.com'),
            ('A0026', 'Rosario', 'Mamani Chucuito', 40000026, 'Calle Los Claveles 3637', 900000026, 'roxas@example.com'),
            ('A0027', 'Nelly', 'Chuquimantari Abanto', 40000027, 'Calle Los Claveles 3637', 900000027, 'charly25@example.com'),
            ('A0028', 'Miguel', 'Del Prado Torres', 40000028, 'Calle Los Claveles 3637', 900000028, 'ignacio45@example.com');

-- SELECT COUNT(*) FROM tb_alumno;

CREATE TABLE tb_cargo(		
cod_cargo CHAR(3) PRIMARY KEY,
cargo VARCHAR(50) NOT NULL	
);		

INSERT INTO tb_cargo VALUES('CG1', 'Secretaria Administrativa'),
    ('CG2', 'Asistente'),
    ('CG3', 'Docente');
	
CREATE TABLE tb_empleado(		
cod_emp	CHAR(4)	PRIMARY KEY,
nombre VARCHAR(100) NOT NULL,
apellido VARCHAR(100) NOT NULL,	
dni INT	UNIQUE NOT NULL,
telefono INT UNIQUE NOT NULL,	
correo VARCHAR(100) UNIQUE NOT NULL,	
cod_cargo CHAR(3) NOT NULL,
FOREIGN KEY (cod_cargo) REFERENCES tb_cargo(cod_cargo)
);


INSERT INTO tb_empleado VALUES ('EP01', 'Gladys', 'Tejeda Yunga', 45614587, 945766233, 'gladya12@email.com', 'CG1'),
    ('EP02', 'Valeria', 'Perez Amacifuen', 42439571, 911239541, 'valak@email.com', 'CG2'),
    ('EP03', 'Lucifer', 'Delgado Peso', 45612387, 919366233, 'luzbel@email.com', 'CG3'),
    ('EP04', 'Kimberly Merlina', 'Huaman Cristobal', 55712357, 928367233, 'kimbbl@email.com', 'CG3'),
    ('EP05', 'Gabriela', 'Garcia Marques', 12345678, 914526733, 'gabi24l@email.com', 'CG3'),
    ('EP06', 'David', 'Cajar Huacho', 55712457, 927367433, 'davidl@email.com', 'CG3'),
    ('EP07', 'Aaron Josue', 'Apolinario', 45712357, 928123233, 'aaroncab@email.com', 'CG3'),
    ('EP08', 'Juan Pedro', 'Lopez Paez', 44712357, 988367233, 'llopez@email.com', 'CG3'),
    ('EP09', 'María Gabriela', 'Aller Onocc', 46812357, 928384533, 'marigab@email.com', 'CG3'),
    ('EP10', 'Carlos', 'Gomez Gonzales', 47712457, 928367222, 'carlinl@email.com', 'CG3'),
    ('EP11', 'Pedro', 'Picapiedra Marmol', 43712257, 928344333, 'pedrinstone@email.com', 'CG3'),
    ('EP12', 'Kim Stefanny', 'Sportacus Posible', 74571235, 974367233, 'kimposible@email.com', 'CG3'),
	('EP13', 'Hugo', 'Frugo yugol', 43745257, 928554333, 'hugor@email.com', 'CG3'),
    ('EP14', 'Grecia', 'Licantropa Flores', 44912257, 928366333, 'licaflower@email.com', 'CG3'),
    ('EP15', 'Keiko', 'Fujimori Japo', 45712257, 928777333, 'fujikeiko@email.com', 'CG3'),
    ('EP16', 'Kenji', 'Fujimori Japo', 48112257, 928888333, 'kenjifujio@email.com', 'CG3');

	
CREATE TABLE tb_curso(		
cod_curso CHAR(4) PRIMARY KEY,
tipo VARCHAR(50) NOT NULL,	
curso VARCHAR(100) UNIQUE NOT NULL
);


INSERT INTO tb_curso VALUES('CR01', 'Libre', 'Mantenimiento preventivo correctivo de motores de combustión interna'),
('CR02', 'Libre', 'Mantenimiento y reparación de equipos de audio'),
('CR03', 'Libre', 'Mantenimiento y reparación de equipos de video'),
('CR04', 'Libre', 'Mantenimiento básico en carpintería'),
('CR05', 'Libre', 'Mantenimiento básico en gasfiteria'),
('CR06', 'Libre', 'Mantenimiento básico en albañilería'),
('CR07', 'Libre', 'Carpintería metálica'),
('CR08', 'Libre', 'Digitación'),
('CR09', 'Libre', 'Pintura automotriz'),
('CR10', 'Libre', 'Mantenimiento básico en instalaciones eléctricas'),
('CR11', 'Modular', 'Acabados en edificaciones y obras civiles'),
('CR12', 'Modular', 'Albañilería'),
('CR13', 'Modular', 'Apoyo administrativo'),
('CR14', 'Modular', 'Artículos de cuero y marroquinería');


/*
UPDATE tb_curso 
SET curso = 'Pintura automotriz'
WHERE cod_curso = 'CR09';
*/		
				
CREATE TABLE tb_matricula(		
num_matricula INT AUTO_INCREMENT PRIMARY KEY,
periodo VARCHAR(15) NOT NULL,
mes_inicio VARCHAR(30) NOT NULL,	
fecha DATE NOT NULL,
turno VARCHAR(50) NOT NULL,	
cod_alumno CHAR(5) NOT NULL,
cod_curso CHAR(4) NOT NULL,	
cod_emp	CHAR(4) NOT NULL,
FOREIGN KEY (cod_alumno) REFERENCES tb_alumno(cod_alumno),
FOREIGN KEY (cod_curso) REFERENCES tb_curso(cod_curso),
FOREIGN KEY (cod_emp) REFERENCES tb_empleado(cod_emp)	
);


INSERT INTO tb_matricula (periodo, mes_inicio, fecha, turno, cod_alumno, cod_curso, cod_emp)
VALUES ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0001', 'CR01', 'EP03'),
    ('2024-1', 'Febrero', '2024-03-15', 'Mañana', 'A0002', 'CR01', 'EP03'),
    ('2024-1', 'Febrero', '2024-03-15', 'Tarde', 'A0003', 'CR02', 'EP04'),
    ('2024-1', 'Marzo', '2024-04-15', 'Mañana', 'A0004', 'CR02', 'EP04'),
    ('2024-1', 'Marzo', '2024-04-15', 'Noche', 'A0005', 'CR03', 'EP05'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0006', 'CR03', 'EP05'),
    ('2024-1', 'Febrero', '2024-02-15', 'Noche', 'A0007', 'CR04', 'EP06'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0008', 'CR04', 'EP06'),
    ('2024-1', 'Abril', '2024-04-15', 'Tarde', 'A0009', 'CR05', 'EP07'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0010', 'CR05', 'EP07'),
    ('2024-1', 'Febrero', '2024-02-15', 'Tarde', 'A0011', 'CR06', 'EP08'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0012', 'CR06', 'EP08'),
    ('2024-1', 'Abril', '2024-04-15', 'Noche', 'A0013', 'CR07', 'EP09'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0014', 'CR07', 'EP09'),
    ('2024-1', 'Febrero', '2024-02-15', 'Tarde', 'A0015', 'CR08', 'EP10'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0016', 'CR08', 'EP10'),
    ('2024-1', 'Febrero', '2024-02-15', 'Noche', 'A0017', 'CR09', 'EP11'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0018', 'CR09', 'EP11'),
    ('2024-1', 'Febrero', '2024-02-15', 'Tarde', 'A0019', 'CR10', 'EP12'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0020', 'CR10', 'EP12'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0021', 'CR11', 'EP13'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0022', 'CR11', 'EP13'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0023', 'CR12', 'EP14'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0024', 'CR12', 'EP14'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0025', 'CR13', 'EP15'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0026', 'CR13', 'EP15'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0027', 'CR14', 'EP16'),
    ('2024-1', 'Febrero', '2024-02-15', 'Mañana', 'A0028', 'CR14', 'EP16');

CREATE TABLE tb_nota(		
num_nota INT PRIMARY KEY auto_increment,
num_matricula INT NOT NULL,
nota INT,
FOREIGN KEY (num_matricula) REFERENCES tb_matricula(num_matricula)
);

insert into tb_nota (num_matricula, nota) values (1, 15), (2, 16), (3, 13), (4, 17),
	(5, 17), (6, 15), (7, 12), (8, 19), (9, 16), (10, 14), (11, 20), (12, 11), (13, 10), 
    (14, 9), (15, 15), (16, 17), (17, 16), (18, 18), (19, 12), (20, 13), (21, 14), 
    (22, 18), (23, 14), (24, 15), (25, 16), (26, 16), (27, 16), (28, 16);
		
CREATE TABLE tb_usuario(	
cod_user CHAR(4) PRIMARY KEY,
usuario	VARCHAR(50) UNIQUE NOT NULL,	
u_contra VARCHAR(50) NOT NULL,	
cod_emp	CHAR(4) NOT NULL,
FOREIGN KEY (cod_emp) REFERENCES tb_empleado(cod_emp)
);

/*-- Promedio de notas por curso
SELECT tc.curso, AVG(tn.nota) AS promedio
FROM tb_matricula tm
JOIN tb_nota tn ON tm.num_matricula = tn.num_matricula
JOIN tb_curso tc ON tm.cod_curso = tc.cod_curso
GROUP BY tc.curso;*/


INSERT INTO tb_usuario values ('U-01', 'GladysAdmi', 'Gladys45614587', 'EP01'),
('U-02', 'Valencia20', 'Valeria4243', 'EP02'), 
('U-03', 'Luzbel', 'Lucifer4561', 'EP03'),
('U-04', 'karmaloco', 'Kimberly557', 'EP04'),
('U-05', 'gabbo51', 'Gabriela1234', 'EP05'),
('U-06', 'darriel', 'David557485', 'EP06'),
('U-07', 'Astarmoul', 'Aaron457', 'EP07'),
('U-08', 'stoneray', 'JuanPedro447', 'EP08'),
('U-09', 'delbarrio22', 'maríaGabriela4687', 'EP09'),
('U-10', 'carrosuel34', 'Carlos47712457', 'EP10'),
('U-11', 'rocaenvalle', 'pedro43712257', 'EP11'),
('U-12', 'lulupesa15', 'fanny#123', 'EP12'),
('U-13', 'Hugor', 'higonorth3', 'EP13'),
('U-14', 'loba', 'Wakaka4040', 'EP14'),
('U-15', 'naranjita', 'Orange2020', 'EP15'),
('U-16', 'chinitojr', 'Perro1998', 'EP16');


/*
SELECT 
    tm.num_matricula,
    tm.periodo,
    tm.mes_inicio,
    tm.fecha,
    tm.turno,
    CONCAT(ta.nombre, ' ', ta.apellido) AS nombre_alumno,
    tc.curso AS nombre_curso,
    CONCAT(te.nombre, ' ', te.apellido) AS nombre_empleado
FROM 
    tb_matricula tm
JOIN 
    tb_alumno ta ON tm.cod_alumno = ta.cod_alumno
JOIN 
    tb_curso tc ON tm.cod_curso = tc.cod_curso
JOIN 
    tb_empleado te ON tm.cod_emp = te.cod_emp
ORDER BY num_matricula ASC;/*