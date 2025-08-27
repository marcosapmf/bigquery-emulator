# Start with a Gradle-enabled base image that has JDK 17.
FROM gradle:8.8-jdk17-jammy AS builder

# Set the working directory inside the container
WORKDIR /app

# Copy the Gradle wrapper files and source code
COPY gradlew .
COPY gradle gradle
COPY build.gradle .
COPY settings.gradle .
COPY src src

# Make the Gradle wrapper executable
RUN chmod +x ./gradlew

# Execute the Gradle build
RUN ./gradlew build --no-daemon

# --- Final image stage (remains unchanged) ---
FROM azul/zulu-openjdk-alpine:21.0.4-jre@sha256:172ed07c8fb58f8683b6fe26394e9698fbe78c11f6a62817c837e4692cb4c7d4

WORKDIR /app
EXPOSE 8080
COPY --from=builder /app/build/libs/bigquery-emulator-0.0.1-SNAPSHOT.jar app.jar
CMD ["java", "-jar", "app.jar"]