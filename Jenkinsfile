pipeline {
    agent any

    tools {
        maven 'Maven_3.9.9' // Make sure this matches the configured Maven version in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the source code from your repository
                git branch: 'main', url: 'https://github.com/SULDev2024/your-repo.git'
            }
        }

        stage('Build') {
            steps {
                // Clean and compile the project
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run tests
                sh 'mvn test'
            }
        }
    }

    post {
        success {
            echo 'Build and tests completed successfully!'
        }
        failure {
            echo 'Build or tests failed. Check the logs for details.'
        }
    }
}
