pipeline {
    agent any
    stages {
        stage ('Compile Stage') {
            steps {
                withMaven(maven : 'MAVEN_3.5.2') {
                    bat 'mvn clean compile'
                }
            }
        }

        stage ('Testing Stage') {
        steps {
             withMaven(maven : 'MAVEN_3.5.2') {
                 bat 'mvn test'
                 }
             }
        }

        stage ('Build Stage') {
        steps {
             withMaven(maven : 'MAVEN_3.5.2') {
                 bat 'mvn install'
                 }
             }

        }

        stage ('Deploy Stage') {
                steps {
                     nexusArtifactUploader artifacts: [[artifactId: 'JenkinsExample', classifier: '', file: 'target/JenkinsExample-1.0-SNAPSHOT.jar', type: 'jar']], credentialsId: '562775b2-0dd7-408a-a489-2be42c2f325b', groupId: 'com.example.jenkins', nexusUrl: 'localhost:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'JenkinsExample-local', version: '1.0-SNAPSHOT'
                     }
                }
    }
}
