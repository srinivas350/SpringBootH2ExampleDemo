FROM openjdk:8
EXPOSE 8080
COPY target/springbooth2example.jar springbooth2example.jar
ENTRYPOINT ["java","-jar","/springbooth2example.jar"]