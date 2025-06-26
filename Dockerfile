# Imagen base de Java
FROM openjdk:17-jdk-alpine

# Copia el archivo jar generado al contenedor
COPY target/productoservice-0.0.1-SNAPSHOT.jar app.jar

# Expone el puerto (debes asegurarte que tu app use el 9898)
EXPOSE 9898

# Comando para ejecutar el jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
