FROM openjdk:8-jdk-alpine

RUN apk add --update \
    curl \
    tzdata \
    busybox-extras

ENV TZ Asia/Jakarta
RUN ln -snf /usr/share/zoneinfo/$TZ /etc/localtime && echo $TZ > /etc/timezone

MAINTAINER Haris Rafiq <haris.srafiq@gmail.com>
ADD target/*.jar alfacart-0.0.1-SNAPSHOT.jar

ENTRYPOINT exec java -jar alfacart-0.0.1-SNAPSHOT.jar
