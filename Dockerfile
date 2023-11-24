FROM openjdk
WORKDIR /app
COPY . /app
RUN javac javaApplication.java
CMD ["java","javaApplication"]