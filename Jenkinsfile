pipeline{
    agent{
        docker:"openjdk:11"
        label: "master"
    }   
    stages{
        stage('Build'){
            steps{
                echo "WebHook Otomatik Pipeline...."
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
