pipeline {
    agent {
        docker {
            image 'amazoncorretto:25'
            // amazoncorretto is Amazon's free, production-ready
            // OpenJDK distribution — reliable choice for Java 25
        }
    }

    stages {
        stage('Verify Java Version') {
            steps {
                sh 'java -version'
                // This will confirm Java 25 is being used
            }
        }

        stage('Compile') {
            steps {
                sh 'javac src/HelloWorld.java -d out/'
                // -d out/ puts compiled .class files in out/ folder
            }
        }

        stage('Run') {
            steps {
                sh 'java -cp out HelloWorld'
                // -cp out sets classpath to out/ folder
                // Output: Hello, World!
            }
        }
    }

    post {
        success {
            echo "✅ Build succeeded on branch: ${env.BRANCH_NAME}"
        }
        failure {
            echo "❌ Build failed on branch: ${env.BRANCH_NAME}"
        }
    }
}
