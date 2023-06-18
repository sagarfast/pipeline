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
                sh 'maven clean package'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'deploy update stage'
            }
        }
    }
}