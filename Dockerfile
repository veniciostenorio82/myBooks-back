FROM eclipse-temurin:21-jdk-alpine AS build

WORKDIR /app

COPY pom.xml .
COPY ./mvnw .
COPY .mvn .mvn
COPY src ./src

RUN ./mvnw clean package -DskipTests