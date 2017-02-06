node {
    stage('Checkout') {
       echo "Checking out"
       git 'https://github.com/pwng/taskit.git'
    }
    stage('Build') { 
       echo "Build1"
       def mvnHome = tool 'M3'
       sh "${mvnHome}/bin/mvn -B verify"
    }
	stage('Test') {
	    echo "Test"
	}
	stage('Deploy') {
	    echo "Deploy"
	} 
}
