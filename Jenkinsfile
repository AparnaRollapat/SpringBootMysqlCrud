pipeline{
    agent {
        docker {
            image "mvn:3.8.3-openjdk-11"
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