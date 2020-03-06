FROM clojure:openjdk-14-alpine AS builder

COPY . /app
WORKDIR /app

RUN lein uberjar

FROM openjdk:14

WORKDIR /app

COPY --from=builder /app/target/uberjar/verifier-mock-0.1.0-SNAPSHOT-standalone.jar /app/verifier-mock.jar
COPY --from=builder /app/config.edn /app/config.edn

CMD ["java", "-jar", "verifier-mock.jar"]

