FROM openjdk:11
EXPOSE 8089
ADD http://192.168.1.192:8081/service/rest/v1/search/assets/download?sort=version&repository=project-devops-repo&maven.groupId=tn.esprit.rh&maven.artifactId=achat&maven.extension=jar tpachatproject.jar
ENTRYPOINT ["java","-jar","/tpachatproject.jar"]



