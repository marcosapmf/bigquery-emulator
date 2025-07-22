#FROM openjdk:17-jdk-alpine
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar

#EXPOSE 8080 5005

#ENV JAVA_OPTS="-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005"

#ENTRYPOINT ["java", "${JAVA_OPTS}", "-jar","/app.jar"]
#ENTRYPOINT java ${JAVA_OPTS} -jar /app.jar
#ENTRYPOINT ["java", "-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=0.0.0.0:5005", "-jar", "app.jar"]
FROM azul/zulu-openjdk-alpine:21.0.4-jre AS builder

WORKDIR /builder

#COPY ./build/libs/*application.jar app.jar
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar

RUN java -Djarmode=layertools -jar app.jar extract

FROM azul/zulu-openjdk-alpine:21.0.4-jre

ARG LABEL_BUILD_DATE
ARG LABEL_VCS_REF

CMD ["sh", "-c", "java ${JAVA_OPTS} ${JAVA_OPTS_EXT} -XshowSettings:vm -XX:+PrintCommandLineFlags org.springframework.boot.loader.launch.JarLauncher"]

EXPOSE 8080

USER root

WORKDIR /root

COPY --from=builder /builder/dependencies .
COPY --from=builder /builder/spring-boot-loader .

COPY --from=builder /builder/application .