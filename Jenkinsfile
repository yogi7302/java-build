pipeline {
    agent any

    tools {
        maven 'Maven3' // Name of Maven installation in Jenkins
        jdk 'JDK11'    // Name of JDK installation in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Pull code from Git repository
                git url: 'https://github.com/your-repo/your-project.git', branch: 'main'
            }
        }

        stage('Build') {
            steps {
                // Run Maven build
                sh 'mvn clean install'
            }
        }

        stage('Test') {
            steps {
                // Run Maven tests
                sh 'mvn test'
            }
        }

        stage('Package') {
            steps {
                // Optional: Package or deploy
                sh 'mvn package'
            }
        }
    }

    post {
        success {
            echo 'Build and tests succeeded!'
        }
        failure {
            echo 'Build or tests failed.'
        }
    }
}
