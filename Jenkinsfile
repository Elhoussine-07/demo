pipeline {
    agent any

    tools {
        jdk 'jdk21'
        maven 'maven3'
    }

    triggers {
        githubPush()
    }

    stages {
        stage('Build & Tests') {
            steps {
                sh 'mvn -B clean verify'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Analyse SonarQube') {
    steps {
        withSonarQubeEnv('sonar') {
            sh 'mvn -B org.sonarsource.scanner.maven:sonar-maven-plugin:sonar -Dsonar.projectKey=demo'
        }
    }
}

        stage('Quality Gate') {
            steps {
                timeout(time: 5, unit: 'MINUTES') {
                    waitForQualityGate abortPipeline: true
                }
            }
        }
    }
}
