FROM devops/jdk:v1
VOLUME /tmp
ADD target/scloudk8s.config-1.0-SNAPSHOT.jar app.jar
RUN  touch /app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
