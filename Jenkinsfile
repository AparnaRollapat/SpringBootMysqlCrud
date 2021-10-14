pipeline{
    agent any
    tools {
        maven "3.8.3"
    }
    stages{
        stage('Build'){
            steps{
                sh "sudo apt update"
                sh "sudo apt install -y openssh-server"
                sh "ssh -V"
                sh "mvn -version"
                sh "mvn clean"
            }
        }
    }
    post{
        always {
            cleanWs()
        }
    }
}