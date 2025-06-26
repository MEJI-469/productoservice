
-- 1. Datos para tabla clasificacion
INSERT INTO clasificacion (id_clasificacion, grupo) VALUES
(1, 'Tecnología'),
(2, 'Alimentos'),
(3, 'Hogar'),
(4, 'Ropa'),
(5, 'Educación');

-- 2. Datos para tabla competencia
INSERT INTO competencia (id_competencias, descripcion, nombre) VALUES
(1, 'Capacidad lógica avanzada', 'Lógica'),
(2, 'Conocimiento en lenguajes', 'Programación'),
(3, 'Análisis de datos', 'Estadística'),
(4, 'Habilidad comunicativa', 'Comunicación'),
(5, 'Capacidad de liderar', 'Liderazgo');

-- 3. Datos para tabla tipo_pago
INSERT INTO tipo_pago (id_tipo_pago, tipo_pago) VALUES
(1, 'Efectivo'),
(2, 'Tarjeta'),
(3, 'Transferencia'),
(4, 'Cheque'),
(5, 'Crédito');

-- 4. Datos para tabla rol
INSERT INTO rol (id_rol, rol, estado) VALUES
(1, 'ADMIN', b'1'),
(2, 'USER', b'1'),
(3, 'AUDITOR', b'1'),
(4, 'VENDEDOR', b'1'),
(5, 'SUPERVISOR', b'1');

-- 5. Datos para tabla proveedores
INSERT INTO proveedores (id_proveedor, correo, moneda, pais, ruc, telefono) VALUES
(1, 'prov1@correo.com', 'USD', 'Ecuador', '0999999999001', '0987654321'),
(2, 'prov2@correo.com', 'USD', 'Ecuador', '0999999999002', '0987654322'),
(3, 'prov3@correo.com', 'USD', 'Ecuador', '0999999999003', '0987654323'),
(4, 'prov4@correo.com', 'USD', 'Ecuador', '0999999999004', '0987654324'),
(5, 'prov5@correo.com', 'USD', 'Ecuador', '0999999999005', '0987654325');

-- 6. Datos para tabla persona
INSERT INTO persona (id_persona, apellido, correo, direccion, nombre, telefono) VALUES
(1, 'Pérez', 'juanp@example.com', 'Av. Loja', 'Juan', '0991111111'),
(2, 'Gómez', 'anag@example.com', 'Av. Cuenca', 'Ana', '0992222222'),
(3, 'Mendoza', 'luism@example.com', 'Av. Quito', 'Luis', '0993333333'),
(4, 'Ruiz', 'mariar@example.com', 'Av. Ambato', 'Maria', '0994444444'),
(5, 'Andrade', 'carlos@example.com', 'Av. Guayaquil', 'Carlos', '0995555555');

-- 7. Datos para tabla usuario
INSERT INTO usuario (id_usuario, contrasena, estado, nombre_usuario, persona_id) VALUES
(1, '1234', b'1', 'admin1', 1),
(2, 'abcd', b'1', 'user2', 2),
(3, 'pass3', b'1', 'auditor3', 3),
(4, 'clave4', b'1', 'vendedor4', 4),
(5, 'key5', b'1', 'supervisor5', 5);

-- 8. Datos para tabla producto
INSERT INTO producto (id_producto, nombre, descripcion, precio, stock, clasificacion_id, proveedor_id) VALUES
(1, 'Laptop', 'Portátil moderna', 1200.00, 10, 1, 1),
(2, 'Pan', 'Pan artesanal', 1.50, 50, 2, 2),
(3, 'Silla', 'Silla de oficina', 45.00, 20, 3, 3),
(4, 'Camiseta', 'Ropa deportiva', 10.00, 30, 4, 4),
(5, 'Libro', 'Libro técnico', 25.00, 15, 5, 5);

-- 9. Datos para tabla usuario_roles
INSERT INTO usuario_roles (id, id_usuario, id_rol) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);

-- 10. Datos para tabla rol_competencias
INSERT INTO rol_competencias (id, id_rol, id_competencias) VALUES
(1, 1, 1),
(2, 2, 2),
(3, 3, 3),
(4, 4, 4),
(5, 5, 5);

-- 11. Datos para tabla factura
INSERT INTO factura (id_factura, fecha_emision, id_persona, id_tipo_pago, total) VALUES
(1, '2024-01-01', 1, 1, 1200.00),
(2, '2024-01-02', 2, 2, 3.00),
(3, '2024-01-03', 3, 3, 90.00),
(4, '2024-01-04', 4, 4, 20.00),
(5, '2024-01-05', 5, 5, 125.00);

-- 12. Datos para tabla item_factura
INSERT INTO item_factura (id_item, cantidad, subtotal, id_factura, id_producto) VALUES
(1, 1, 1200.00, 1, 1),
(2, 2, 3.00, 2, 2),
(3, 2, 90.00, 3, 3),
(4, 2, 20.00, 4, 4),
(5, 5, 125.00, 5, 5);
