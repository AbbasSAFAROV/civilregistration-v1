pipeline {

    agent any

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

        stage('Initialize'){
            def dockerHome = tool 'myDocker'
            env.PATH = "${dockerHome}/bin:${env.PATH}"
        }
        stage('Build docker image') {
            steps {
                script {
                    sh 'docker build -t abbas1997/testImage .'
                }
            }
        }

         stage('Initialize'){
            def dockerHome = tool 'myDocker'
            env.PATH = "${dockerHome}/bin:${env.PATH}"
         }
        stage('Push image to dockerHub') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerHubPwd', variable: 'dockerHubPwd')]) {
                        sh 'docker login -u abbas1997 -p ${dockerHubPwd}'
                    }
                    sh 'docker push abbas1997/testImage'
                }
            }
        }

    }

}