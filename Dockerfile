FROM openjdk:8-jdk-alpine
ADD k8s_demo-0.0.1-SNAPSHOT.jar app.jar
#ָ����������ʱҪִ�е�����
ENTRYPOINT ["java","-jar","/app.jar"]
EXPOSE 8085
