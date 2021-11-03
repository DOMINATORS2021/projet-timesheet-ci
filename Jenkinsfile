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
    }
   
    post {
        always {
            cleanWs()
        }
    }
    stage("mail"){
    steps {
    
    emailext attachLog: true, body: 'This is the last log of the build.', subject: 'Last Pipeline Build Log ', to: 'mourad.jomaa1@esprit.tn'
    }
    }
}
