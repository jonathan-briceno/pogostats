DROP TABLE IF EXISTS POKEMON;

CREATE TABLE POKEMON (
  ID INT AUTO_INCREMENT  PRIMARY KEY,
  POKEDEX_NUMBER NUMBER NOT NULL,
  NAME  VARCHAR(250) NOT NULL,
  TYPE_1 VARCHAR(250) NOT NULL,
  TYPE_2 VARCHAR(250) DEFAULT NULL,
  MAX_PC NUMBER NOT NULL,
  ATK NUMBER NOT NULL,
  DEF NUMBER NOT NULL,
  STA NUMBER NOT NULL,
  REGION VARCHAR(250) NOT NULL
);

INSERT INTO POKEMON (POKEDEX_NUMBER, NAME, TYPE_1, TYPE_2, MAX_PC, ATK, DEF, STA, REGION) VALUES
(1, 'BULBASAUR', 'PLANT', 'POISON', 1115, 118, 111, 128, 'KANTO'),
(2, 'IVYSAUR', 'PLANT', 'POISON', 2720, 198, 189, 190, 'KANTO');