#FROM eclipse-temurin:21.0.1_12-jdk-jammy
#WORKDIR /app
#COPY build/*.jar .
#ENTRYPOINT ["java","-jar","demoDocker-0.0.1-SNAPSHOT.jar"]

FROM eclipse-temurin:21.0.1_12-jdk-jammy
WORKDIR /app
COPY .mvn .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY src ./src
ENTRYPOINT ["./mvnw", "spring-boot:run"]

#FROM eclipse-temurin
#WORKDIR /app
#COPY .mvn/ .mvn
#COPY mvnw pom.xml ./
#RUN ./mvnw dependency:go-offline
#COPY src ./src
#CMD ["./mvnw", "spring-boot:run"]