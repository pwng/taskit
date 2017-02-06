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
        sh "${mvnHome}/bin/mvn test"
        sh "${mvnHome}/bin/mvn surefire-report:report-only"
        sh "${mvnHome}/bin/mvn site -DgenerateReports=false"

        publishHTML([
            allowMissing: false,
            alwaysLinkToLastBuild: false,
            keepAll: false,
            reportDir: '**/target/site',
            reportFiles: 'surefire-report.html',
            reportName: 'Test Report'])
	}
	stage('Deploy') {
	    echo "Deploy"
	} 
}
