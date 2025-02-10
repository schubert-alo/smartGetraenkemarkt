-- Datei: init-scripts/01-init.sql

-- Erstelle die products Tabelle
CREATE TABLE products (
                          id SERIAL PRIMARY KEY,
                          product_name VARCHAR(255) NOT NULL,
                          quantity INT NOT NULL,
                          import_source VARCHAR(50),
                          import_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Erstelle die weather_data Tabelle
CREATE TABLE weather_data (
                              id SERIAL PRIMARY KEY,
                              location VARCHAR(255),
                              temperature DECIMAL,
                              humidity DECIMAL,
                              import_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Optional: Füge einige Testdaten hinzu
INSERT INTO products (id, product_name, quantity, import_source)
VALUES
    ('Test Product 1', 100, 'Initial Import'),
    ('Test Produkt 2', 50, 'Initial Import');

INSERT INTO weather_data (location, temperature, humidity)
VALUES
    ('Berlin', 20.5, 65.0),
    ('Hamburg', 18.5, 70);