pipeline{
    agent {
        docker {
            image "mvn:3.6.0-openjdk-13"
            label "docker"
        }
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