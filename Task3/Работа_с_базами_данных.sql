CREATE DATABASE humanFriends;
USE humanFriends;

CREATE TABLE homeAnimals (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    comand TEXT,
    birthday DATE
);

CREATE TABLE PackAnimals (
	id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(20),
    comand TEXT,
    birthday DATE
);

INSERT INTO homeAnimals (name, comand, birthday) VALUES
('Собака', 'сидеть, лежать', '2020-01-01'),
('Кошка', 'мяукать, спать', '2019-02-02'),
('Хомяк', 'бегать, прятаться', '2021-03-03');

INSERT INTO PackAnimals (name, comand, birthday) VALUES
('Лошадь', 'бегать, прыгать', '2018-04-04'),
('Верблюд', 'нести груз, идти', '2017-05-05'),
('Осел', 'нести груз, стоять', '2019-06-06');

SELECT * FROM homeAnimals;
SELECT * FROM PackAnimals;

SET SQL_SAFE_UPDATES = 0;

DELETE FROM PackAnimals WHERE name = 'Верблюд';

CREATE TABLE Horses_Donkeys AS
SELECT * FROM PackAnimals WHERE name IN ('Лошадь', 'Осел');


CREATE TABLE youngAnimals AS
SELECT *, TIMESTAMPDIFF(MONTH, birthday, CURDATE()) AS age_in_months
FROM (
    SELECT * FROM homeAnimals
    UNION ALL
    SELECT * FROM Horses_Donkeys
) AS allAnimals
WHERE DATEDIFF(CURDATE(), birthday) BETWEEN 365 AND 1095;


CREATE TABLE allAnimals AS
SELECT * FROM homeAnimals
UNION ALL
SELECT * FROM PackAnimals;
