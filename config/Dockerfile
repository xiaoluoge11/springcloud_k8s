FROM devops/jdk:v1
VOLUME /tmp
ADD target/*.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JVM_OPTS="-Xss256k -Duser.timezone=Asia/Shanghai -Djava.security.egd=file:/dev/./urandom"
ENV JAVA_OPTS=""
ENV APP_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JVM_OPTS $JAVA_OPTS -jar /app.jar $APP_OPTS" ]
