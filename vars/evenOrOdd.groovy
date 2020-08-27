def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            bat label: '', script: '''C:
            cd /
            dir'''
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Odd Stage') {
          steps {
            bat label: '', script: '''C:
            cd /'''
            echo "You are in root directory"
          }
        }
      }
    }
  }
}
