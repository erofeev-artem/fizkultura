CREATE TABLE IF NOT EXISTS requests
(id SERIAL PRIMARY KEY,
 status INTEGER NOT NULL,
 initiator_id INTEGER NOT NULL REFERENCES users (id),
 recipient_id INTEGER NOT NULL REFERENCES users (id),
 created_at TIMESTAMP,
 updated_at TIMESTAMP
);