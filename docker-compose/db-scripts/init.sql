CREATE DATABASE docker_compose_example;

USE docker_compose_example;

-- CLEAN UP
DROP TABLE IF EXISTS users_example;

-- DDL
CREATE TABLE IF NOT EXISTS users_example (
    id INT NOT NULL AUTO_INCREMENT,
    first_name VARCHAR(150) NOT NULL,
    last_name VARCHAR(150) NOT NULL,
    email VARCHAR(150) NOT NULL,
    PRIMARY KEY (id)
);


-- DML
INSERT INTO users_example (first_name, last_name, email)
VALUES ('user1', 'lastname1', 'user1@gmail.com');