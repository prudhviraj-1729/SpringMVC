pipeline {
    agent any
    tools {
        maven "Maven"
    }
    stages {
        stage("build") {
            steps {
                echo "building the application"
                bat "mvn clean package -DskipTests"
            }
        }
        stage("test") {
            steps {
                echo "testing the application"
                bat "mvn clean package -DskipTests"
            }
        }
        stage("deploy") {
            steps {
                echo "deploying the application"
                bat "mvn clean package -DskipTests"
            }
        }
    }
}
