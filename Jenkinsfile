pipeline {
    agent { docker { image 'maven:3.8.4-openjdk-11-slim' } }
    stages {
        stage('build') {
            steps {
                sh 'mvn clean compile'
            }
        }
        stage('Test'){
            steps{
                sh 'mvn test'
            }

            post {
                always {
                    junit '**/target/surefire-reports/TEST-*.xml'
                }
            }

        }
    }
}

