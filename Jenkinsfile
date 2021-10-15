pipeline {
    agent any
    tools {
        // Jenkins -> Configuration name
        jdk 'jdk'
        maven '3.8.3'
    }
    stages {
        stage("build project") {
            steps {
               // git 'https://github.com/denizturkmen/SpringBootMysqlCrud.git'
                sh 'java -version'
                echo 'building project...'
                sh "mvn compile"
                sh "mvn package"
                //sh "mvn test"
                sh "mvn clean install"
            }
        }
    }
}
    post{
        always {
            cleanWs()
        }
    }
}
