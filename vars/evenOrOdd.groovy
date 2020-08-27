def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('List Directory Stage') {
          steps {
            bat label: '', script: '''C:
            cd /
            dir'''
            echo "Here are the directories in C Drive"
          }
        }
      }
    }
  } else {
    pipeline {
      agent any
      stages {
        stage('Find Current Directory Stage') {
          steps {
            bat label: '', script: '''C:
            cd /'''
            echo "Current Directory is root C:\"
          }
        }
      }
    }
  }
}
