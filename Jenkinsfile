pipeline {
    agent any
    stages {
        stage('Build') {
            steps {                   
                //bat label: '', script: "mvn -f JAVA/my-app/pom.xml clean package"
                sh "mvn -f my-app/pom.xml clean"                                                                  
            }
        }
        stage('SonarQube analysis') {
            steps {
                /*withSonarQubeEnv(installationName: 'SonarQube', credentialsId: 'SonarQubeToken') {
                    sh "mvn clean package sonar:sonar"
                }*/
            }
        }       
        stage('Deploy_Nexus') {
            steps {
                 //bat label: '', script: "mvn -f JAVA/my-app/pom.xml clean deploy" 
            }
        }
    }
}