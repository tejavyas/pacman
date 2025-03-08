# Use an OpenJDK base image
FROM openjdk:17

# Set the working directory
WORKDIR /app

# Copy the source code
COPY . /app

# Compile the Java application (adjust filenames if needed)
RUN javac -d out src/*.java

# Run the application
CMD ["java", "-cp", "out", "Main"]
