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

        stage('Check Maven') {
            steps {
                bat 'echo %PATH%'
            }
        }

        stage('Run Tests') {
            steps {
                bat 'mvn test'
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
        bat 'dir'
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
