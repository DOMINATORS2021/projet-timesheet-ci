pipeline {

    agent any


    stages {

        stage("Build") {
            steps {
                bat "mvn -version"
                bat "mvn clean package"
                // sh "mvn clean package -DskipTests" pour une machine linux
            }
        }
        stage("Tests") {
            steps {
                bat "mvn -version"
                bat "mvn test"
            }
        }
        stage("Sonar") {
            steps {
                bat "mvn sonar:sonar"
            }
        }
        
        stage("DEPLOY") {
            steps {
                bat "mvn deploy"
            }
        }
    }
   
    post {
        always {
            cleanWs()
        }
    }
    
}
