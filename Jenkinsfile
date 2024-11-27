pipeline {
    agent any
    stages {
        stage('Build') {
            steps {
                script {
                    if (isUnix()) {
                        // Unix/Linux specific command
                        sh 'nohup some-command &'
                    } else {
                        // Windows specific command
                        bat 'start some-command'
                    }
                }
            }
        }
    }
}
