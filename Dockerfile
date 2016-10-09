FROM anapsix/alpine-java
ADD /target/javawebhello-jar-with-dependencies.jar /
EXPOSE 4567
CMD java -jar javawebhello-jar-with-dependencies.jar