CREATE DATABASE rcb;
CREATE SCHEMA rcb;

DROP TABLE rcb.hop;
CREATE TABLE rcb.hop
(
    id               serial PRIMARY KEY,
    name             CHAR(50) NOT NULL,
    date             DATE DEFAULT CURRENT_DATE,
    supplier         CHAR(50) NOT NULL,
    lot_number       CHAR(50),
    crop_year        NUMERIC (4),
    price            MONEY,
    alpha            NUMERIC(5,2),
    initial_quantity numeric(6,2),
    current_quantity numeric(6,2)


);

DROP TABLE rcb.yeast;
CREATE TABLE rcb.yeast
(
    id                   serial PRIMARY KEY,
    name                 CHAR(50) NOT NULL,
    date                 DATE DEFAULT CURRENT_DATE,
    supplier             CHAR(50) NOT NULL,
    lot_number           CHAR(50),
    brand                CHAR(20),
    previous_batch_id    NUMERIC(18),
    previous_batch_brand CHAR(20),
    generation           NUMERIC(4),
    cell_count           NUMERIC(5,2),
    viability            NUMERIC(5,2),
    initial_quantity     numeric(6,2),
    current_quantity     numeric(6,2)

);

DROP TABLE rcb.grain;
CREATE TABLE rcb.grain
(
    id                serial PRIMARY KEY,
    name              CHAR(50) NOT NULL,
    date              DATE DEFAULT CURRENT_DATE,
    supplier          CHAR(50) NOT NULL,
    category          CHAR(50),
    sack_weight       INTEGER,
    moisture_content  NUMERIC(5,2),
    fgdb              NUMERIC(5,2),
    protein_content   NUMERIC(5,2),
    color             NUMERIC(5,2),
    diastatic_power   NUMERIC(5,2),
    base_price        MONEY,
    milling_price     MONEY,
    shipping_price    MONEY,
    initial_quantity  numeric(6,2),
    current_quantity  numeric(6,2)


);

DROP TABLE rcb.adjunct;
CREATE TABLE rcb.adjunct
(
    id                serial PRIMARY KEY,
    name              CHAR(50) NOT NULL,
    date              DATE DEFAULT CURRENT_DATE,
    supplier          CHAR(50) NOT NULL,
    type              CHAR(15),
    category          CHAR(50),
    extract           INTEGER,
    ppg               NUMERIC(5,2),
    color_lov         NUMERIC(5,2),
    price             MONEY,
    initial_quantity  numeric(6,2),
    current_quantity  numeric(6,2)


);

DROP TABLE rcb.recipe CASCADE;
CREATE TABLE rcb.recipe
(
    recipe_id         serial PRIMARY KEY,
    name              CHAR(50) NOT NULL,
    status            CHAR(20) NOT NULL,
    batch_no          CHAR(20) NOT NULL,
    previous_batch_no CHAR(20) NOT NULL,
    date              DATE DEFAULT CURRENT_DATE,
    type              CHAR(20) NOT NULL,
    batch_yield       NUMERIC,
    target_og         NUMERIC,
    target_eff        NUMERIC(5,2),
    target_ibus       NUMERIC(5,2),
    target_color      NUMERIC(5,2),
    yeast_vessel      CHAR(20),
    fermentor_vessel  CHAR(20),
    pitch_volume      NUMERIC(5,2),
    description       CHAR(50)
);


DROP TABLE rcb.recipegrain;
CREATE TABLE rcb.recipegrain
(
    id                serial PRIMARY KEY,
    recipe_id         BIGINT,
    name              CHAR(50) NOT NULL,
    quantity          NUMERIC(5,2)

);

DROP TABLE rcb.recipehop;
CREATE TABLE rcb.recipehop
(
    id                serial PRIMARY KEY,
    recipe_id         BIGINT,
    name              CHAR(50) NOT NULL,
    quantity          NUMERIC(5,2)

);

DROP TABLE rcb.recipeyeast;
CREATE TABLE rcb.recipeyeast
(
    id                serial PRIMARY KEY,
    recipe_id         BIGINT,
    name              CHAR(50) NOT NULL,
    quantity          NUMERIC(5,2),
    cell_count        NUMERIC(5,2),
    viability         NUMERIC(5,2)


);

DROP TABLE rcb.recipeadjunct;
CREATE TABLE rcb.recipeadjunct
(
    id                serial PRIMARY KEY,
    recipe_id         BIGINT,
    name              CHAR(50) NOT NULL,
    quantity          NUMERIC(5,2)

);

DROP TABLE rcb.recipesalt;
CREATE TABLE rcb.recipesalt
(
    id                serial PRIMARY KEY,
    recipe_id         BIGINT,
    name              CHAR(20) NOT NULL,
    quantity          NUMERIC(5,2)

);


DROP TABLE rcb.brewer;
CREATE TABLE rcb.brewer
(
    id                serial PRIMARY KEY,
    recipe_id         BIGINT,
    name              CHAR(20) NOT NULL
);





DROP TABLE rcb.brewday;
CREATE TABLE rcb.brewday
(
    id                          serial PRIMARY KEY,
    recipe_id                   BIGINT,
    mash_in_time                TIME,
    strike_temp_upper           INTEGER,
    strike_temp_lower           INTEGER,
    strike_ph                   NUMERIC(5,2),
    mash_rest_time              TIME,
    mash_rest_time_target       INTEGER,
    rest_temp                   INTEGER,
    rest_temp_target            INTEGER,
    rest_ph                     NUMERIC(5,2),
    vorlauf_time                TIME,
    lauter_start_time           TIME,
    mash_temp                   INTEGER,
    first_gravity               NUMERIC(5,2),
    first_ph                    NUMERIC(5,2),
    lauter_end_time             TIME,
    max_temp                    INTEGER,
    max_temp_target             INTEGER,
    last_gravity                NUMERIC(5,2),
    last_ph                     NUMERIC(5,2),
    kettle_temp                 INTEGER,
    boil_time                   TIME,
    boil_time_target            INTEGER,
    boil_kettle_volume          NUMERIC(5,2),
    boil_kettle_volume_target   NUMERIC(5,2),
    pre_boil_gravity            NUMERIC(5,2),
    pre_boil_gravity_target     NUMERIC(5,2),
    pre_boil_ph                 NUMERIC(5,2),
    koppa_clear                 NUMERIC(5,2),
    zinc_grams                  NUMERIC(5,2),
    flame_out_time              TIME,
    flame_kettle_volume         NUMERIC(5,2),
    flame_kettle_volume_target  NUMERIC(5,2),
    original_gravity            NUMERIC(5,2),
    original_gravity_target     NUMERIC(5,2),
    post_boil_ph                NUMERIC(5,2),
    whirlpool_time              TIME,
    knockout_time               TIME,
    end_knockout_time           TIME,
    knockout_temp               INTEGER,
    knockout_temp_target        INTEGER,
    pitch_time                  TIME,
    ferm_temp                   INTEGER,
    ferm_temp_target            INTEGER
);


DROP TABLE rcb.brewlog;
CREATE TABLE rcb.brewlog
(
    id                serial PRIMARY KEY,
    recipe_id         BIGINT,
    date_time         TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    temp              NUMERIC(5,2),
    gravity           NUMERIC(5,2),
    ph                NUMERIC(5,2),
    name              CHAR(20),
    note              VARCHAR(100)
);
