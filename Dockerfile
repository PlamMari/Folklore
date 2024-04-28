FROM openjdk:22-slim

WORKDIR /home

COPY ./build/libs/Folklore-0.0.1-SNAPSHOT.jar ./spring.jar

CMD ["java", "-jar", "spring.jar"]

#LABEL authors="Plamena Petrova"
#
#ENTRYPOINT ["top", "-b"]