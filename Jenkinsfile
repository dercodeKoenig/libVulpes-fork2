 pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './gradlew clean build deobf makeChangelog curseforge236541' 
                archiveArtifacts artifacts: '**output/*.jar', fingerprint: true 
            }
        }
    }
}
