pipeline {
    agent any

    tools {
        maven 'MAVEN'  // Maven installation
        jdk 'JDK25'    // JDK installation
    }

    environment {
        IMAGE_NAME = 'my-java-app:latest' // Docker image name
        CONTAINER_NAME = 'java-app'       // Docker container name
        HOST_PORT = '9090'                // Port on host (to avoid conflict with Jenkins)
        CONTAINER_PORT = '8080'           // Port your app listens to inside container
    }

    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/yogi7302/java-build.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }

        stage('Archive Artifact') {
            steps {
                archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
            }
        }

        stage('Build Docker Image') {
            steps {
                // Build Docker image using the archived JAR
                bat "docker build -t %IMAGE_NAME% ."
            }
        }

        stage('Run Docker Container') {
            steps {
                
                // Run the new container with mapped port
                bat "docker run -d --name %CONTAINER_NAME% -p %HOST_PORT%:%CONTAINER_PORT% %IMAGE_NAME%"
            }
        }
    }

    post {
        success {
            echo 'Build, Docker image creation, and deployment succeeded!'
        }
        failure {
            echo 'Build or deployment failed.'
        }
    }
}
