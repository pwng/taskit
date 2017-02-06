node {
    stage('Checkout') {
       echo "Checking out"
       git 'https://github.com/pwng/taskit.git'
    }
    stage('Build') { 
       echo "Build1"
       def mvnHome = tool 'M3'
       sh "${mvnHome}/bin/mvn -B verify -Dmaven.test.skip=true"
    }
	stage('Test') {
	    echo "Test"
	    step([$class: 'JUnitResultArchiver', testResults: '**/target/TEST-*.xml'])
	}
	stage('Deploy') {
	    echo "Deploy"
	} 
}
