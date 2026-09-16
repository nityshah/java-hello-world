pipeline {
    agent {
        docker {
            image 'amazoncorretto:25'
        }
    }

    stages {

        stage('Environment') {
            steps {
                echo "Environment: STAGING"
                echo "Branch: ${env.BRANCH_NAME}"
            }
        }

        stage('Verify Java Version') {
            steps {
                sh 'java -version'
            }
        }

        stage('Compile') {
            steps {
                sh 'mkdir -p out'
                sh 'javac src/HelloWorld.java -d out/'
            }
        }

        stage('Run') {
            steps {
                sh 'java -cp out HelloWorld'
            }
        }

    }

    post {
        success {
            echo "STAGING build succeeded on branch: ${env.BRANCH_NAME}"
        }

        failure {
            echo "STAGING build failed on branch: ${env.BRANCH_NAME}"
        }
    }
}
