FROM openjdk:22
COPY ./target/demo.jar demo.jar
CMD ["java","-jar","demo.jar"]