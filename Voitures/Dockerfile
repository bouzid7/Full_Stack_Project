# Utiliser une image de base qui contient Java (par exemple, OpenJDK)
FROM openjdk:17
# Copier le fichier JAR de l'application dans le conteneur
COPY  target/voitures-0.0.1-SNAPSHOT.jar spring-boot-mysql-docker-voitures.jar
# Commande pour lancer l'application Spring Boot
ENTRYPOINT ["java", "-jar", "/spring-boot-mysql-docker-voitures.jar"]
