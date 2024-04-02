CREATE TABLE IF NOT EXISTS users(
    id SERIAL PRIMARY KEY,
    user_name VARCHAR (255) NOT NULL,
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);