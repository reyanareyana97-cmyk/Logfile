pipeline {
    agent any

    tools {
        maven 'mvn 3.9.9'
    }

    stages {

        stage('Checkout') {
            steps {
                git branch: 'main',
                    credentialsId: 'github_root_crentional',
                    url: 'https://github.com/reyanareyana97-cmyk/Logfile.git'
            }
        }

        stage('List Files') {
            steps {
                bat 'dir'
            }
        }

        stage('Build Application') {
            steps {
                bat 'mvn clean package'
            }
        }

        stage('Docker Version') {
            steps {
                bat 'docker --version'
                bat 'docker info'
            }
        }

        stage('Verify JAR') {
            steps {
                bat 'dir target'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t logfile-app .'
            }
        }
    }
}
