FROM ubuntu:latest
LABEL authors="Ohara"
RUN apt-get update
RUN apt-get install -y openjdk-21-jdk-headless
#créer un dossier /opt/app
RUN mkdir /opt/app

#copie le fichier de notre machine locale vers /opt/app/myapp.jar
COPY target/mon_app-0.0.1-SNAPSHOT.jar /opt/app/myapp.jar
#Signale a docker quel est le dossier de travail
WORKDIR  /opt/app
EXPOSE 8090

#demmare l'application
ENTRYPOINT ["java", "-jar","myapp.jar"]