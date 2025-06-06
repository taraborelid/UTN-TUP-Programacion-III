DROP DATABASE IF EXISTS servicio;

CREATE DATABASE servicio;

USE servicio;

-- Tabla de usuarios (clientes y trabajadores)
CREATE TABLE users (
    id_users INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password_hash TEXT NOT NULL,
    phone VARCHAR(20),
    role ENUM('client', 'worker') NOT NULL,
    dni VARCHAR(20) NOT NULL
);

-- Tabla de categorías (plomería, carpintería, etc.)
CREATE TABLE categories (
    id_categories INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) UNIQUE NOT NULL
);

-- Tabla de servicios ofrecidos por los trabajadores
CREATE TABLE services (
    id_services INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    category_id INT NOT NULL,
    title VARCHAR(100) NOT NULL,
    description TEXT,
    price DECIMAL(10, 2),
    is_active BOOLEAN DEFAULT TRUE,
    FOREIGN KEY (user_id) REFERENCES users(id_users) ON DELETE CASCADE,
    FOREIGN KEY (category_id) REFERENCES categories(id_categories)
);

-- Tabla de solicitudes de servicio hechas por clientes
CREATE TABLE service_requests (
    id_service_request INT AUTO_INCREMENT PRIMARY KEY,
    client_id INT,
    service_id INT,
    request_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    status ENUM('pending', 'accepted', 'completed', 'cancelled') DEFAULT 'pending',
    description TEXT,
    FOREIGN KEY (client_id) REFERENCES users(id_users) ON DELETE SET NULL,
    FOREIGN KEY (service_id) REFERENCES services(id_services) ON DELETE SET NULL
);

-- Tabla de calificaciones de clientes a trabajadores
CREATE TABLE ratings (
    id_ratings INT AUTO_INCREMENT PRIMARY KEY,
    service_request_id INT,
    rating INT CHECK (rating BETWEEN 1 AND 5),
    comment TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (service_request_id) REFERENCES service_requests(id_service_request) ON DELETE CASCADE
);