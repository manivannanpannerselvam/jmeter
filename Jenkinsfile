CODE_CHANGES = getGitChanges()
    pipeline {

        agent any

        stages {

            stage("build") {
                when {
                    expression {
                        BRANCH_NAME == 'master' && CODE_CHANGES == true
                }
            }
                steps {

                    echo "building the application..."
                }
            }
            stage("test") {

                steps {

                    echo "Build to Test the application"

                }
            }

            stage("deploy") {

                steps {

                    echo "Build to Deploy the application"
                }
            }
        }
            post {
                always {

                    echo "Always pass"
                }
                failure {
                    echo "Always fail"
                }
            }
}