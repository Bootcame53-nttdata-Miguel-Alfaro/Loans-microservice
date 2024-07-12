# Loan Microservice

Este microservicio se encarga de la administración de las cuentas de crédito de los usuarios, gestionando todos los productos de crédito ofrecidos por el banco. Está registrado en un API Gateway y puede ser consumido desde la siguiente dirección: [http://4.152.240.150:8080/](http://4.152.240.150:8080/).

## Descripción del Proyecto

El microservicio de créditos proporciona diversas operaciones para la gestión de cuentas de crédito, incluyendo la creación, actualización, eliminación y consulta de créditos, así como operaciones de pago, cargos y validación de saldo. A continuación se detallan los endpoints disponibles y su funcionalidad.

## Endpoints

### Crear un Crédito
- **Descripción**: Añadir un nuevo crédito a la base de datos.
- **Método**: `POST`
- **Ruta**: `http://4.152.240.150:8080/credits`
- **Código de Respuesta**: 201 - Crédito creado exitosamente.

### Obtener Todos los Créditos
- **Descripción**: Obtener una lista de todos los créditos.
- **Método**: `GET`
- **Ruta**: `http://4.152.240.150:8080/credits`
- **Código de Respuesta**: 200 - Operación exitosa.

### Obtener Créditos de un Cliente
- **Descripción**: Obtener todos los créditos asociados a un cliente específico.
- **Método**: `GET`
- **Ruta**: `http://4.152.240.150:8080/credits/customer/{customerId}`
- **Códigos de Respuesta**: 200 - Operación exitosa, 404 - Cliente no encontrado.

### Obtener un Crédito por ID
- **Descripción**: Obtener la información de un crédito específico por su ID.
- **Método**: `GET`
- **Ruta**: `http://4.152.240.150:8080/credits/{id}`
- **Códigos de Respuesta**: 200 - Operación exitosa, 404 - Crédito no encontrado.

### Realizar un Pago a un Crédito
- **Descripción**: Realizar un pago a un crédito específico.
- **Método**: `POST`
- **Ruta**: `http://4.152.240.150:8080/credits/{id}/payment`
- **Código de Respuesta**: 200 - Pago exitoso.

### Realizar un Cargo a un Crédito
- **Descripción**: Realizar un cargo a un crédito específico.
- **Método**: `POST`
- **Ruta**: `http://4.152.240.150:8080/credits/{id}/charge`
- **Código de Respuesta**: 200 - Cargo exitoso.

### Obtener Balance Diario Promedio de Créditos
- **Descripción**: Obtener el balance diario promedio de todos los créditos de un cliente en el mes actual.
- **Método**: `GET`
- **Ruta**: `http://4.152.240.150:8080/credits/{customerId}/average-daily-balance`
- **Códigos de Respuesta**: 200 - Operación exitosa, 404 - Cliente no encontrado.

### Obtener Balance de un Crédito
- **Descripción**: Obtener el balance actual de un crédito.
- **Método**: `GET`
- **Ruta**: `http://4.152.240.150:8080/credits/{id}/balance`
- **Códigos de Respuesta**: 200 - Operación exitosa, 404 - Crédito no encontrado.

### Obtener Reporte de Comisiones
- **Descripción**: Obtener un reporte de todas las comisiones cobradas por producto en un periodo de tiempo especificado.
- **Método**: `GET`
- **Ruta**: `http://4.152.240.150:8080/credits/commission-report`
- **Códigos de Respuesta**: 200 - Operación exitosa, 404 - No se encontraron transacciones para el rango de fechas dado.

### Obtener Transacciones de un Crédito
- **Descripción**: Obtener todas las transacciones realizadas en un crédito específico.
- **Método**: `GET`
- **Ruta**: `http://4.152.240.150:8080/credits/{id}/transactions`
- **Códigos de Respuesta**: 200 - Operación exitosa, 404 - Crédito no encontrado.

## Integración y Despliegue

Este microservicio está integrado dentro de un clúster de AKS (Azure Kubernetes Service) con integración continua. Cada commit se almacena en un registro y el despliegue se realiza de manera automática, garantizando que siempre esté disponible la versión más reciente y funcional del servicio.

## Información Adicional

Para ver más información de las peticiones, tanto body, request y response, revisar el contrato API en el recurso del proyecto.
