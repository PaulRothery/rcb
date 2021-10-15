CREATE DATABASE rcb;
CREATE SCHEMA rcb;

DROP TABLE rcb.hop;
CREATE TABLE rcb.hop
(
    id         serial PRIMARY KEY,
    name       VARCHAR(50) NOT NULL,
    date       DATE DEFAULT CURRENT_DATE,
    supplier   VARCHAR(50) NOT NULL,
    lot_number VARCHAR(50),
    crop_year  NUMERIC (4),
    price      MONEY,
    alpha      NUMERIC(5, 2)

);

DROP TABLE rcb.yeast;
CREATE TABLE rcb.yeast
(
    id                   serial PRIMARY KEY,
    name                 VARCHAR(50) NOT NULL,
    date                 DATE DEFAULT CURRENT_DATE,
    supplier             VARCHAR(50) NOT NULL,
    lot_number           VARCHAR(50),
    brand                VARCHAR(20),
    previous_batch_id    NUMERIC(18),
    previous_batch_brand VARCHAR(20),
    generation           NUMERIC(4),
    cell_count           NUMERIC(4),
    viability            NUMERIC(5, 2)

);

DROP TABLE rcb.grain;
CREATE TABLE rcb.grain
(
    id                serial PRIMARY KEY,
    name              VARCHAR(50) NOT NULL,
    date              DATE DEFAULT CURRENT_DATE,
    supplier          VARCHAR(50) NOT NULL,
    category          VARCHAR(50),
    sack_weight       INTEGER,
    moisture_content  NUMERIC(5,2),
    fgdb              NUMERIC(5,2),
    protein_content   NUMERIC(5,2),
    color             NUMERIC(5,2),
    diastatic_power   NUMERIC(5,2),
    base_price        MONEY,
    milling_price     MONEY,
    shipping_price    MONEY
);

DROP TABLE rcb.adjunct;
CREATE TABLE rcb.adjunct
(
    id                serial PRIMARY KEY,
    name              VARCHAR(50) NOT NULL,
    date              DATE DEFAULT CURRENT_DATE,
    supplier          VARCHAR(50) NOT NULL,
    type              CHAR(15),
    category          VARCHAR(50),
    extract           INTEGER,
    ppg               NUMERIC(5,2),
    color_lov         NUMERIC(5,2),
    price             MONEY
);

DROP TABLE rcb.adjunct_non_fermentable;
CREATE TABLE rcb.adjunct_non_fermentable
(
    id                serial PRIMARY KEY,
    name              VARCHAR(50) NOT NULL,
    date              DATE DEFAULT CURRENT_DATE,
    supplier          VARCHAR(50) NOT NULL,
    category          VARCHAR(50),
    extract           INTEGER,
    ppg               NUMERIC(5,2),
    color_lov         NUMERIC(5,2),
    price             MONEY
);
