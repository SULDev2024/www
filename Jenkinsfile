pipeline {
    agent any

    tools {
        // Replace 'MAVEN' with the exact name of your Maven installation in Jenkins
        maven 'MAVEN'
    }

    stages {
        stage('Checkout') {
            steps {
                // Checkout the correct branch from your Git repository
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']], // Replace 'main' with your actual branch name
                    userRemoteConfigs: [[
                        url: 'https://github.com/SULDev2024/TsT-pipline.git' // Replace with your repository URL
                    ]]
                ])
            }
        }

        stage('Build') {
            steps {
                // Build the project
                sh 'mvn clean compile'
            }
        }

        stage('Test') {
            steps {
                // Run the tests
                sh 'mvn test'
            }
        }

        stage('Archive Test Results') {
            steps {
                // Archive test results
                junit '**/target/surefire-reports/*.xml'
            }
        }
    }

    post {
        always {
            cleanWs() // Clean up the workspace
        }
        success {
            echo 'Build and tests completed successfully.'
        }
        failure {
            echo 'Pipeline failed. Check the logs for details.'
        }
    }
}
