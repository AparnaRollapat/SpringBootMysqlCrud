pipeline{
    agent any
    tools {
        maven "3.8.3"
    }
    stages{
        stage('Build'){
            steps{
                sh "mvn -version"
                sh "mvn clean"
                sh "mvn install"
            }
        }
    }
    post{
        always {
            cleanWs()
        }
    }
}