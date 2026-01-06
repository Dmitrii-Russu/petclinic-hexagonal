DROP TABLE IF EXISTS owners;

CREATE TABLE owners (
    id UUID PRIMARY KEY,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    address VARCHAR(100) NOT NULL,
    city VARCHAR(50) NOT NULL,
    telephone VARCHAR(20) NOT NULL
);
