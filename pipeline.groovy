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
                echo 'build stage'
            }
        }
        stage('Deploy') { 
            steps {
                echo 'deploy stage'
            }
        }
    }
}