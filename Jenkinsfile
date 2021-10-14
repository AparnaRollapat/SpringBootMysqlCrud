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