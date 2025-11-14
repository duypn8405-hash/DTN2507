CREATE DATABASE IF NOT EXISTS ex1;
USE ex1;


-- tao bang
CREATE TABLE IF NOT EXISTS trainee(
trainee_id INT,
full_name VARCHAR(50),
birth_day DATE,
training_class VARCHAR(50)
);


DROP DATABASE IF EXISTS ex1;
DROP TABLE IF EXISTS trainee;
