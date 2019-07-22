FROM openjdk:8
ADD target/OompaLoompasREST-0.0.1-SNAPSHOT.jar OompaLoompasREST-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","OompaLoompasREST-0.0.1-SNAPSHOT.jar"]