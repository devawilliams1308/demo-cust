FROM openjdk:11
EXPOSE 8089
ADD target/demo-cust-0.0.1-SNAPSHOT.jar demo-cust-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-cust-0.0.1-SNAPSHOT.jar"]