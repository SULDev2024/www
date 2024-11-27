pipeline {
    agent any

    tools {
        // Specify the Maven version to use
        maven 'Maven_3.9.9' // Ensure this matches the Maven installation in Jenkins
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout code from the repository
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Compile the Java code and package it
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run the unit tests
                sh 'mvn test'
            }
        }

        stage('Archive') {
            steps {
                // Archive test results (e.g., surefire reports)
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            // Clean up the workspace after the pipeline run
            cleanWs()
        }
        success {
            echo 'Build and tests completed successfully.'
        }
        failure {
            echo 'Pipeline failed. Check the logs for details.'
        }
    }
}
