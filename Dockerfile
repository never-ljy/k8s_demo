FROM openjdk:8-jdk-alpine
ADD k8s_demo-0.0.1-SNAPSHOT.jar app.jar
#指定容器启动时要执行的命令
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8085
