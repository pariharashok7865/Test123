@Library('gitchange-lib') _

pipeline {
    agent any
    stages {
        stage('Build') {
            steps {                   
                //bat label: '', script: "mvn -f JAVA/my-app/pom.xml clean package"
                //sh "mvn -f my-app/pom.xml clean package"
                script {
                    if(gitchangecheck.gitChange('my-app'))
                    {
                         echo "Building...."   
                    }
                    
                }                                                                               
            }
        }
        stage('SonarQube analysis') {
            steps {
                /*withSonarQubeEnv(installationName: 'SonarQube', credentialsId: 'SonarQubeToken') {
                    sh "mvn -f my-app/pom.xml clean package sonar:sonar"
                }*/
                echo "scan"
            }
        }       
        stage('Deploy_Nexus') {
            steps {
                 //bat label: '', script: "mvn -f JAVA/my-app/pom.xml clean deploy" 
                 echo "deploy"
            }
        }
    }
}