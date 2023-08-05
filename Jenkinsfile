pipeline {

    agent none

    stages {

        stage('Checkout SCM') {
            steps {
                sh 'echo Salam Dunya 01Selam dunya'
            }
        }

        stage('Build') {
            steps {
                sh 'echo Salam Dunya'
            }
        }

        stage('Test') {
            steps {
                sh 'echo Salam Dunya'
            }
        }

        stage('Deploy') {
            steps {
                sh 'echo Salam Dunya'
            }
        }

        stage('Back-end') {
            agent {
                docker { image 'maven:3.9.3-eclipse-temurin-17-alpine' }
            }
            steps {
                sh 'mvn --version'
            }
        }
        stage('Front-end') {
            agent {
                docker { image 'node:18.17.0-alpine3.18' }
            }
            steps {
                sh 'node --version'
            }
        }

    }

}