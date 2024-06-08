pipeline {
    agent any 
    stages {
        stage('Clone Repository') {
            steps {
                sh(script: 'echo clone')
            }
        }
        stage('Build') { 
            steps {
                sh(script: 'echo build')
            }
        }
        stage('Test') { 
            steps {
                sh(script: 'echo test')
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
