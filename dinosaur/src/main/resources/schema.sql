CREATE TABLE IF NOT EXISTS dinosaur(
    id SERIAL PRIMARY KEY,
    name VARCHAR(255) not null ,
    description VARCHAR(255) not null ,
    fun_fact VARCHAR(255) not null
);
