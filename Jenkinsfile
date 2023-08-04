 pipeline {

        agent any

        parameters {
            choice(name: 'VERSION', choices: ['1.1.0','1.2.0','1.3.0'], description: '')
            booleanParam(name: 'executeTests',defaultValue: true, description: '')

            }

        stages {

            stage("build") {


                steps {
                    script {
                        def gitStatus = sh(script:'git status', returnStdout:true).trim()

                        def CODE_CHANGES = (gitStatus != "nothing to commit, working tree clean")


                        if (BRANCH_NAME == 'master' && CODE_CHANGES) {

                            echo "Master branch is updated"
                        } else {

                            echo "Master branch is not updated"
                        }
                    }
            echo "building the application..."
                }


            }


        stage("test") {
                when {
                    expression {
                        params.executeTests
            }
            }

            steps {

                echo "Build to Test the application"

            }
        }

        stage("deploy") {

            steps {

                echo "Build to Deploy the application"
                echo "Deploying the version ${params.VERSION}"
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