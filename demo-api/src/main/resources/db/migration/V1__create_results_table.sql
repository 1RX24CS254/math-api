CREATE TABLE calculation_history (
    id SERIAL PRIMARY KEY,
    val_a INT NOT NULL,
    val_b INT NOT NULL,
    result INT NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


