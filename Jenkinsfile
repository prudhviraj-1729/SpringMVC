pipeline {
  agent any
  tools {
        maven "M3"
    }
  stages {
    stage("build"){
        steps  {
          sh 'mvn clean package -DskipTests'
          echo "building the application"
        }
    }
    stage("test"){
        steps  {
          sh 'mvn clean package -DskipTests'
          echo "testing the application"
        }
    }
    stage("deploy"){
        steps  {
          sh 'mvn clean package -DskipTests'
          echo "deploying the application"
        }
    }
  }
}

  stages {
    stage("build"){
        steps  {
          sh 'mvn clean package -DskipTests'
          echo "building the application"
        }
    }
    stage("test"){
        steps  {
          sh 'mvn clean package -DskipTests'
          echo "testing the application"
        }
    }
    stage("deploy"){
        steps  {
          sh 'mvn clean package -DskipTests'
          echo "deploying the application"
        }
    }
  }
}
