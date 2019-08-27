FROM openjdk:8 as build

WORKDIR /opt
COPY . .
RUN ./gradlew clean build -x test && \
    curl -LKSs https://github.com/naver/pinpoint/releases/download/1.8.4/pinpoint-agent-1.8.4.tar.gz -o pinpoint-agent-1.8.4.tar.gz && \
    tar xvzf pinpoint-agent-1.8.4.tar.gz && \
    mv pinpoint-bootstrap-1.8.4.jar pinpoint-bootstrap.jar

FROM openjdk:8-jre-alpine as run
LABEL maintainer="joewalker"
WORKDIR /opt
COPY --from=build /opt/build/libs/book.jar app.jar
COPY --from=build /opt/pinpoint-bootstrap.jar pinpoint-bootstrap.jar

CMD java -javaagent:/opt/pinpoint-bootstrap.jar -Dpinpoint.agentId=$(cat /etc/machine-id) -Dpinpoint.applicationName=books -jar app.jar