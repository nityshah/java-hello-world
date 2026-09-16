pipeline {
    agent {
        docker {
            image 'amazoncorretto:25'
        }
    }

    stages {

        stage('Environment') {
            steps {
                echo "Environment: DEV"
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
            echo "DEV build succeeded on branch: ${env.BRANCH_NAME}"
        }

        failure {
            echo "DEV build failed on branch: ${env.BRANCH_NAME}"
        }
    }
}
