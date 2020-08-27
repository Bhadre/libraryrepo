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
                steps {
                    bat label: '', script: '''
                    mkdir pipelinetest'''
                    echo "New folder Created"
                }
            }
    }
}
