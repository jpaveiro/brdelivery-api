FROM gradle:8.5-jdk21 AS deps
WORKDIR /app
COPY gradlew .
COPY gradle ./gradle
COPY build.gradle settings.gradle ./
RUN mkdir -p presentation domain infrastructure application
RUN ./gradlew dependencies --no-daemon

FROM gradle:8.5-jdk21 AS builder
WORKDIR /app
COPY --from=deps /home/gradle/.gradle /home/gradle/.gradle
COPY gradlew .
COPY gradle ./gradle
COPY build.gradle settings.gradle ./
RUN mkdir -p presentation domain infrastructure application
COPY presentation ./presentation
COPY domain ./domain
COPY infrastructure ./infrastructure
COPY application ./application

RUN ./gradlew :presentation:clean :presentation:bootJar -x test --no-daemon

FROM amazoncorretto:21 AS runtime
WORKDIR /app
COPY --from=builder /app/presentation/build/libs/*.jar app.jar
RUN java -Djarmode=layertools -jar app.jar extract

EXPOSE 8080
ENTRYPOINT ["java", "-Xms256m", "-Xmx512m", "-jar", "app.jar"]
