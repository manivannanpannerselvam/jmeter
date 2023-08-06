def buildApp() {
    echo "Building the Applications ...."
}

def testApp() {
    echo "Testing the applications..."
}

def deployApp() {
     echo "Build to Deploy the application"
        echo "Deploying the version ${params.VERSION}"
}
return this 