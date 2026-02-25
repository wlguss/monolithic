# jar 파일로 패키징하기 위한 jdk image pull
FROM eclipse-temurin:17-jdk-alpine

# jar
ARG JAR_FILE=build/libs/*.jar

# copy
COPY ${JAR_FILE} ./backend.jar 

# run
ENTRYPOINT [ "java", "-jar", "./backend.jar" ]