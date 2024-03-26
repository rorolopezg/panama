#FROM openjdk:21-oraclelinux8
#FROM eclipse-temurin
#FROM eclipse-temurin:21.0.2_13-jdk
FROM eclipse-temurin:21.0.2_13-jdk-alpine as builder
WORKDIR /app/msvc-cursos
#COPY ./target/msvc-cursos-0.0.1-SNAPSHOT.jar .

#Descarga de dependencias con Maven
COPY ./pom.xml /app
COPY ./msvc-cursos/.mvn ./.mvn
COPY ./msvc-cursos/mvnw .
COPY ./msvc-cursos/pom.xml .
RUN ./mvnw clean package -Dmaven.test.skip -Dmaven.main.skip -Dspring-boot.repackage.skip && rm -r ./target
#RUN ./mvnw dependency:go-offline

#Compilar fuentes y empaquetar
COPY ./msvc-cursos/src ./src
RUN ./mvnw clean package -DskipTests


FROM eclipse-temurin:21.0.2_13-jdk-alpine
WORKDIR /app
RUN mkdir s
COPY --from=builder /app/msvc-cursos/target/msvc-cursos-0.0.1-SNAPSHOT.jar .

EXPOSE 8002
#ENTRYPOINT ["java", "-jar", "msvc-cursos-0.0.1-SNAPSHOT.jar"]
CMD ["java", "-jar", "msvc-cursos-0.0.1-SNAPSHOT.jar"]