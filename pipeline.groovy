pipeline {
    agent any 
    stages {
        stage('pull') { 
            steps {
                git branch: 'main', url: 'https://github.com/sagarfast/student-ui.git'
            }
        }
        stage('build') { 
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'deploy update stage'
            }
        }
    }
}