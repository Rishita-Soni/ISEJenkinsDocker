pipeline {
    agent any

    stages {
        stage('Build app') {
            steps {
                checkout scmGit(branches: [[name: '*/main']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/Rishita-Soni/ISEJenkinsDocker.git']])
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    bat 'docker build -t isejenkinsjavaapp .'
                }
            }
        }
        stage('Change image tag'){
            steps{
                script{
                    bat 'docker tag isejenkinsjavaapp rishitasoni/isejenkinsjava_app:image-tag'
                }
            }
        }
        stage('Push image to docker hub'){
            steps{
                script{
                   
                    bat 'docker login -u rishitasoni -p welcome123'
                    
                    bat 'docker push rishitasoni/isejenkinsjava_app:image-tag'
                }
            }
        }
    }
}
