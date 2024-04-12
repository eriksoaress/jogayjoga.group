pipeline {
    agent any
    stages {
        stage('Jenkins Group') {
            steps {
                echo 'Group interface'
            }
        }
        stage('Build') { 
            steps {
                sh 'mvn clean install'
            }
        }      
    }
}