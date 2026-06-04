CREATE DATABASE yenaial;
USE yenaial;


-- TABLA CLIENTE

CREATE TABLE cliente (
    dniCli      VARCHAR(10)  NOT NULL,
    nombre      VARCHAR(30)  NOT NULL,
    apellidos        VARCHAR(30)  NOT NULL,
    telefono    VARCHAR(15)  NULL,
    correo      VARCHAR(80)  NOT NULL,
    fecha_registro      DATETIME,
    PRIMARY KEY (dniCli)
);


-- TABLA BICICLETAS
CREATE TABLE bicicleta (
    id_bicicleta      VARCHAR(10)  NOT NULL,
    marca      VARCHAR(30)  NOT NULL,
    modelo        VARCHAR(30)  NOT NULL,
    tipo    VARCHAR(15)  NULL,
    color      VARCHAR(80)  NULL,
    numero_serie      VARCHAR(50),
    notas_tecnicas	VARCHAR(50) NULL,
    PRIMARY KEY (id_bicicleta)
);

-- TABLA RESERVAS

CREATE TABLE reservas (
    id_reservas      VARCHAR(10)  NOT NULL,
    fecha_hora      DATETIME,
    motivo_consulta        VARCHAR(30)  NOT NULL,
    estado_reserva    VARCHAR(15)  NOT NULL,
    PRIMARY KEY (id_reservas)
);


-- TABLA PIEZAS

CREATE TABLE piezas (
    id_piezas      VARCHAR(10)  NOT NULL,
    nombre      VARCHAR(30)  NOT NULL,
    categoría        VARCHAR(30)  NOT NULL,
    precio_costo    DECIMAL(10,2)  NOT NULL,
    precio_venta      DECIMAL(10,2)  NOT NULL,
    stock_actual      INT  NOT NULL,
    stock_minimo	INT NOT NULL,
    PRIMARY KEY (id_piezas)
);

-- TABLA REPARACIONES

CREATE TABLE reparaciones (
    id_reparaciones      VARCHAR(10)  NOT NULL,
    fecha_entrada      DATETIME  NOT NULL,
    descripcion_problema        VARCHAR(30)  NOT NULL,
    diagnostico_mecanico    VARCHAR(15)  NULL,
    estado      VARCHAR(80)  NOT NULL,
    costo_actual      DECIMAL(10,2)  NOT NULL,
    fecha_entrega	DATETIME NULL,
    PRIMARY KEY (id_reparaciones)
);

-- Tabla reparacion piezas

CREATE TABLE reparacion_piezas (
    id_reparacion VARCHAR(10) NOT NULL,
    id_pieza VARCHAR(10) NOT NULL,
    cantidad INT NOT NULL DEFAULT 1,
    PRIMARY KEY (id_reparacion, id_pieza),
    CONSTRAINT fk_det_reparacion FOREIGN KEY (id_reparacion) REFERENCES reparaciones(id_reparaciones),
    CONSTRAINT fk_det_pieza FOREIGN KEY (id_pieza) REFERENCES piezas(id_piezas)
);

-- TABLA TÉCNICOS

CREATE TABLE tecnico (
    id_tecnico      VARCHAR(10)  NOT NULL,
    nombre      VARCHAR(30)  NOT NULL,
    apellidos        VARCHAR(30)  NOT NULL,
    telefono    VARCHAR(15)  NULL,
    especialidad      VARCHAR(80)  NULL,
    estado_laboral      VARCHAR(20)  NOT NULL,
    PRIMARY KEY (id_tecnico)
);

ALTER TABLE bicicleta
	ADD	bicicleta_cliente VARCHAR(10)  NOT NULL;
    
ALTER TABLE bicicleta
	ADD CONSTRAINT fk_bicicleta_cliente
    FOREIGN KEY (bicicleta_cliente) REFERENCES cliente(dniCli);

ALTER TABLE reservas
	ADD dni_reservas VARCHAR(10)  NOT NULL;

ALTER TABLE reservas
	ADD reservas_bicicleta VARCHAR(10)  NOT NULL;
    
ALTER TABLE reservas
	ADD CONSTRAINT fk_reservas_cliente
    FOREIGN KEY (dni_reservas) REFERENCES cliente(dniCli),
    ADD CONSTRAINT fk_reservas_bicicleta
    FOREIGN KEY (reservas_bicicleta) REFERENCES bicicleta(id_bicicleta);
    
ALTER TABLE reparaciones
	ADD reparaciones_bicicleta VARCHAR(10)  NOT NULL;

ALTER TABLE reparaciones
	ADD reparaciones_tecnico VARCHAR(10)  NOT NULL;
    
ALTER TABLE reparaciones
	ADD reparaciones_piezas VARCHAR(10)  NOT NULL;   

ALTER TABLE reparaciones
    ADD CONSTRAINT fk_reparaciones_bicicleta
    FOREIGN KEY (reparaciones_bicicleta) REFERENCES bicicleta(id_bicicleta),
    ADD CONSTRAINT fk_reparaciones_tecnico
    FOREIGN KEY (reparaciones_tecnico) REFERENCES tecnico(id_tecnico),
    ADD CONSTRAINT fk_reparaciones_piezas
    FOREIGN KEY (reparaciones_piezas) REFERENCES piezas(id_piezas);
    
    
ALTER TABLE reservas DROP CONSTRAINT fk_reservas_cliente;
ALTER TABLE reservas DROP CONSTRAINT fk_reservas_bicicleta;
ALTER TABLE reparaciones DROP CONSTRAINT fk_reparaciones_bicicleta;
ALTER TABLE reparaciones DROP CONSTRAINT fk_reparaciones_tecnico;
