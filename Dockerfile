FROM openjdk:11
MAINTAINER Koshaev Kirill <k.koshaev@qwep.ru>
ENTRYPOINT ["java", "-jar", "/qwep/userapi.jar"]
ARG JAR_FILE
ADD target/${JAR_FILE} /org/qwep/userapi.jar