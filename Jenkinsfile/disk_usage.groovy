pipeline {
    agent any 
    stages {
        stage('Clone Repository') {
            steps {
                sh(script: 'echo clone')
            }
        }
        stage('Deploy') { 
            steps {
                sh(script: 'echo deploy')
                sh(script: 'df -h')
            }
        }
    }
}
