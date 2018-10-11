FROM openjdk:8-jre-alpine

WORKDIR /usr/src/app

COPY ./target/camunda-example-prometheus-1.0-SNAPSHOT-exec.jar /usr/src/app
COPY prometheus-metrics.yml /usr/src/app

ENTRYPOINT ["java","-jar","camunda-example-prometheus-1.0-SNAPSHOT-exec.jar"]
