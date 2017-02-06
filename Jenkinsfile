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
	    def mvnHome = tool 'M3'
	    #!/bin/sh
        sh "${mvnHome}/bin/mvn test"

	    step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml'])
	}
	stage('Deploy') {
	    echo "Deploy"
	}

	post {
            always {
                junit '**/target/surefire-reports/TEST-*.xml'
            }
        }
}
