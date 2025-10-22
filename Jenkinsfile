pipeline {
    agent any

    tools {
        maven 'MAVEN' // Name of Maven installation in Jenkins
        jdk 'JDK25'    // Name of JDK installation in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Pull code from Git repository
                git url: 'https://github.com/yogi7302/java-build.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Run Maven build
                bat 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run Maven tests
                bat 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Optional: Package or deploy
                bat 'mvn package'
            }
        }
    }

   post {
        success {
            echo 'Build succeeded!'
            // Archive the JAR file
            archiveArtifacts artifacts: 'target/*.jar', fingerprint: true
        }
        failure {
            echo 'Build failed.'
        }
    }
}
