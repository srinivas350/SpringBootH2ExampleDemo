FROM openjdk:11
EXPOSE 8081
ADD target/springbooth2example.jar springbooth2example.jar
ENTRYPOINT ["java","-jar","springbooth2example.jar"]