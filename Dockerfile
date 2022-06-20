FROM openjdk:17-oracle
EXPOSE 8081
ADD /target/mc-zip-code-validator-0.0.1-SNAPSHOT.jar mc-zip-code-validator.jar
ENTRYPOINT ["java", "-jar", "mc-zip-code-validator.jar"]
