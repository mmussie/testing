pipeline {
  agent any 
  stages {
    stage("build") {
      steps {
        echo " building the applications .. "
      }
    }
    stage("test") {
      steps {
        echo " testing the application .. "
        echo " testing one more app .."
      }
    }
    stage("Integration") {
      steps {
        echo " Integration with 3rd party application .. "
      }
    }
    stage("Deployement") {
      steps {
        echo " installing the application ... "
      }
    }
  }
}
