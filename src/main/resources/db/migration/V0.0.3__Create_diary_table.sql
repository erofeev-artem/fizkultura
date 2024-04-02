CREATE TABLE IF NOT EXISTS diary
(id SERIAL PRIMARY KEY,
    user_id INTEGER REFERENCES users (id),
    record_date TIMESTAMP NOT NULL,
    weight DECIMAL,
    created_at TIMESTAMP NOT NULL,
    updated_at TIMESTAMP NOT NULL
);