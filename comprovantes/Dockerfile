FROM openjdk:14-alpine
COPY build/libs/comprovantes-*-all.jar comprovantes.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "comprovantes.jar"]