FROM amazoncorretto:8u252-al2
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} logistic.jar
ENTRYPOINT ["java","-jar","/logistic.jar"]