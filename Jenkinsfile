pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                checkout([
                    $class: 'GitSCM',
                    branches: [[name: '*/main']], // Replace 'main' with your branch name
                    userRemoteConfigs: [[
                        url: 'https://github.com/SULDev2024/TsT-pipline.git' // Replace with your repository URL
                    ]]
                ])
            }
        }
    }
}
