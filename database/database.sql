CREATE DATABASE voitures;
USE voitures;

CREATE TABLE voitures (
    id INT NOT NULL AUTO_INCREMENT,
    marque VARCHAR(255) NOT NULL,
    modele VARCHAR(255) NOT NULL,
    annee VARCHAR(50) NOT NULL,
    couleur VARCHAR(50) NOT NULL, 
    prix INT NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB;

INSERT INTO voitures (marque, modele, annee, couleur, prix)
VALUES ("volkswagen", "Caddy 5", "2017", "rouge", 349000);