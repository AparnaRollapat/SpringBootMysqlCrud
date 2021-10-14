pipeline{
    agent {
        docker {
            image "mvn:3.8.3-openjdk-11"
            label "master"
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