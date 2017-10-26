#Yippie Ki Yay MotherDocker

FROM gradle
ADD src/ /home/gradle/project/src/
ADD build.gradle /home/gradle/project/build.gradle
WORKDIR /home/gradle/project/
USER root
RUN chmod -R 777 .
USER gradle
RUN gradle clean build

FROM openjdk:8-jre-alpine
COPY --from=0 /home/gradle/project/build/libs/filesystem-0.0.1-SNAPSHOT.jar /usr/bin/filesystem-0.0.1-SNAPSHOT.jar
ENV SPRING_DATASOURCE_URL=jdbc:postgresql://file-database:5432/postgres \
    SPRING_DATASOURCE_USERNAME=postgres \
    SPRING_DATASOURCE_PASSWORD=postgres \
    SPRING_JPA_GENERATE-DDL=true
EXPOSE 8080
CMD ["java", "-jar", "/usr/bin/filesystem-0.0.1-SNAPSHOT.jar"]