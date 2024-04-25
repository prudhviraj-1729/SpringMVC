pipeline {
  agent any
  stages {
    stage("build"){
        steps  {
          echo "building the application"
          sh "mvn clean package -DskipTests"
        }
    }
    stage("test"){
        steps  {
          echo "testing the application"
          sh "mvn clean package -DskipTests"
        }
    }
    stage("deploy"){
        steps  {
          echo "deploying the application"
          sh "mvn clean package -DskipTests"
        }
    }
  }
}
