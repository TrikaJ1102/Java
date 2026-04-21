CREATE DATABASE RestaurantDB;
USE RestaurantDB;

CREATE TABLE Restaurant (
    Id INT PRIMARY KEY,
    Name VARCHAR(100),
    Address VARCHAR(200)
);

CREATE TABLE MenuItem (
    Id INT PRIMARY KEY,
    Name VARCHAR(100),
    Price DOUBLE,
    ResId INT,
    FOREIGN KEY (ResId) REFERENCES Restaurant(Id)
);