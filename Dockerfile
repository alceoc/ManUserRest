FROM openjdk:12
ADD ManUserRest.jar /UserRest/ManUserRest.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/UserRest/ManUserRest.jar"]
