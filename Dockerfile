FROM openjdk:8
COPY ./build/libs/Apple-0.0.1.jar apple-0.0.1.jar
CMD ["java","-jar", "apple-0.0.1.jar"]