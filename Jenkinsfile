node {
    stage('Checkout') {
       echo "Checking out"
       git url: 'https://github.com/pwng/taskit.git'
    }	
    stage('Build') { 
       echo "Build1"
       mvn package
    }
	stage('Test') {
	    echo "Test"
	}
	stage('Deploy') {
	    echo "Deploy"
	} 
}
