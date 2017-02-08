node {
    stage('Checkout') {
       echo "Checking out"
       git 'https://github.com/pwng/taskit.git'
    }
    stage('Build') { 
       echo "Build1"
       def mvnHome = tool 'M3'

       try{
            sh "${mvnHome}/bin/mvn -B verify checkstyle:checkstyle"
       }catch(err){
            if (currentBuild.result == 'UNSTABLE')
                currentBuild.result = 'FAILURE'
            throw err
       }finally {
            step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml', healthScaleFactor: 1.0])
            junit '**/target/surefire-reports/TEST-*.xml'
       }
    }
	stage('Code Static Check') {
	    echo "Code Static Check"
        step([$class: 'hudson.plugins.checkstyle.CheckStylePublisher', pattern: '**/target/checkstyle-result.xml'])
        step([$class: 'FindBugsPublisher', pattern: '**/findbugsXml.xml'])
	}
	stage('Deploy') {
	    echo "Deploy"
	}
}
