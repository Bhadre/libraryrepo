def call() {
    pipeline {
        agent any
        stages {
            stage('Find Current Directory Stage') {
                steps {
                    bat label: '', script: '''C:
                    cd C:\\Users\\bnarayanansr\\Desktop'''
                    echo "Current Directory is Desktop"
                }
            }
            stage('List Directory Stage') {
                steps {
                    bat label: '', script: '''
                    cd C:\\Users\\bnarayanansr\\Desktop
                    mkdir "pipelinetest"
                    echo "New Folder Created"
                    '''
                }
            }
        }
    }
}
