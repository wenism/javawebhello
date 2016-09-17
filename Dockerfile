FROM anapsix/alpine-java
ADD /target/javawebhello-jar-with-dependencies.jar /
CMD java -jar javawebhello-jar-with-dependencies.jar