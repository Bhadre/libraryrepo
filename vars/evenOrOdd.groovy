def call(int buildNumber) {
  if (buildNumber % 2 == 0) {
    pipeline {
      agent any
      stages {
        stage('Even Stage') {
          steps {
            bat label: '', script: '''
            cd C:\\Users\\bnarayanansr\\Desktop\\pipelinetest
            echo "The build number is even" >> BuildResult.txt
            '''
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
            echo "The build number is odd"
          }
        }
      }
    }
  }
}
