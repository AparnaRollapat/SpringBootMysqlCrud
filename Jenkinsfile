pipeline{
    agent any
    tools {
        maven "3.8.3"
    }
    stages{
        stage('Build'){
            steps{
                echo "Maven Versiyon"
                sh "mvn -version"
                echo "Maven Clean"
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