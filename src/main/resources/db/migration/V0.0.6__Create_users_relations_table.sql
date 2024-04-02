CREATE TABLE IF NOT EXISTS users_relations
(   user_1_id INTEGER NOT NULL REFERENCES users (id),
    user_2_id INTEGER NOT NULL REFERENCES users (id),
    relation_type_id INTEGER NOT NULL REFERENCES role_relation_type (id),
    created_at TIMESTAMP,
    updated_at TIMESTAMP
    );