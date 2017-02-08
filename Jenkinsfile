node {
    stage('Checkout') {
       echo "Checking out"
       git 'https://github.com/pwng/taskit.git'
    }
    stage('Build') { 
       echo "Build1"
       def mvnHome = tool 'M3'
       sh "${mvnHome}/bin/mvn -B verify -Dmaven.test.failure.ignore=true"

       step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
       junit '**/target/surefire-reports/TEST-*.xml'
    }
	stage('Test') {
	    echo "Test"

	}
	stage('Deploy') {
	    echo "Deploy"
	}
}
