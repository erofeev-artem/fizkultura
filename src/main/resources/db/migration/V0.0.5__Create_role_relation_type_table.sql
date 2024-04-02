CREATE TABLE IF NOT EXISTS role_relation_type
(id SERIAL PRIMARY KEY,
 role_1 INTEGER NOT NULL REFERENCES roles (id),
 role_2 INTEGER NOT NULL REFERENCES roles (id),
 created_at TIMESTAMP,
 updated_at TIMESTAMP
);