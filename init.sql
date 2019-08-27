CREATE DATABASE pinpoint;
GRANT ALL PRIVILEGES ON DATABASE pinpoint TO postgres;
\l
\c pinpoint
CREATE TABLE users(
    id serial PRIMARY KEY,
    firstname VARCHAR (50) NOT NULL,
    lastname VARCHAR (50) NOT NULL,
    age int NOT NULL
);
INSERT INTO users VALUES (1, 'joe', 'walker', 20);
INSERT INTO users VALUES (2, 'jonhney', 'walker', 21);

CREATE TABLE books(
    id serial PRIMARY KEY,
    author VARCHAR (50) NOT NULL,
    bookname VARCHAR (50) NOT NULL,
    total int NOT NULL
);

INSERT INTO books VALUES (1, 'joe walker', 'book 1', 1);
INSERT INTO books VALUES (2, 'jonhney walker', 'book 2', 2);