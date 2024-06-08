pipeline {
    agent any

    stages {
        stage('Clone Repository') {
            steps {
                // Этот этап выполняется автоматически при использовании "Pipeline Script from SCM"
                script {
                    echo "Repository cloned"
                }
            }
        }
        stage('Run Disk Usage Script') {
            steps {
                script {
                    def os = System.getProperty('os.name').toLowerCase()
                    if (os.contains('win')) {
                        bat 'groovy disk_usage.groovy'
                    } else {
                        sh 'groovy disk_usage.groovy'
                    }
                }
            }
        }
    }
}
