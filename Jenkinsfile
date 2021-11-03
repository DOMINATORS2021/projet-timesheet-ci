pipeline {

    agent any


    stages {

        stage("Build") {
            steps {
                bat "mvn -version"
                bat "mvn clean package -DskipTests"
                // sh "mvn clean package -DskipTests" pour une machine linux
            }
        }
        /* stage("Tests") {
           steps {
                bat "mvn -version"
                bat "mvn test"
            }
        }*/
        stage("Sonar") {
            steps {
                bat "mvn sonar:sonar"
            }
        }
        
        stage("DEPLOY") {
            steps {
                bat "mvn deploy -DskipTests"
            }
        } 
        
        stage("Email Notification"){
            steps {
              mail bcc: '', body: 'Jenkins email alert', cc: '', from: '', replyTo: '', subject: 'Jenkins Job', to: 'mouradjomaa9@gmail.com'
              }
        }
    }
    post {
        always {
            cleanWs()
                  }
    }

    
}
