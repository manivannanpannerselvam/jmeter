 pipeline {

        agent any

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