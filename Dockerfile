# Imagen base con Java 17 (la versión actual recomendada)
FROM eclipse-temurin:21-jdk-alpine

# Directorio de trabajo dentro del contenedor
WORKDIR /app

# Copiar el archivo JAR generado del proyecto al contenedor
COPY target/*.jar app.jar

# Exponer el puerto del servicio
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app.jar"]
