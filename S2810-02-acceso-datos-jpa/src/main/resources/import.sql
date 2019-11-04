INSERT INTO provincias (provincia_id, nombre) values (1, 'SANTA FE');
INSERT INTO provincias (provincia_id, nombre) values (2, 'CORDOBA');
INSERT INTO provincias (provincia_id, nombre) values (3, 'LA RIOJA');
INSERT INTO provincias (provincia_id, nombre) values (4, 'ENTRE RIOS');

INSERT INTO localidades (localidad_id, nombre, provincia_id) VALUES (1, 'ROSARIO', 1);
INSERT INTO localidades (localidad_id, nombre, provincia_id) VALUES (2, 'FUNES', 1);

INSERT INTO barrios (localidad_id, barrio_id, nombre) VALUES (1, 1, 'BARRIO UNO');

