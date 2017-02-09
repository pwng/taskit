node {
    def mvnHome = tool 'M3'
    def workspace = pwd()

    stage('Checkout') {
       echo "Checking out"
       git 'https://github.com/pwng/taskit.git'
    }
    stage('Build') {
       echo "Build"

       sh "${mvnHome}/bin/mvn clean install -DskipTests"
    }
    stage('UnitTest'){
        echo "UnitTest"

        try{
            sh "${mvnHome}/bin/mvn test"
        }catch(err){
            if (currentBuild.result == 'UNSTABLE')
                currentBuild.result = 'FAILURE'
            throw err
        }finally {
            step([$class: 'JUnitResultArchiver', testResults: '**/target/surefire-reports/TEST-*.xml', healthScaleFactor: 1.0])
            junit allowEmptyResults: true, testResults: '**/target/surefire-reports/TEST-*.xml'
        }
    }
	stage('Code Static Check') {
	    echo "Code Static Check"

        sh "${mvnHome}/bin/mvn compile checkstyle:checkstyle findbugs:findbugs"

        step([$class: 'hudson.plugins.checkstyle.CheckStylePublisher', pattern: '**/target/checkstyle-result.xml'])
        step([$class: 'FindBugsPublisher', pattern: '**/target/findbugsXml.xml'])
	}
	stage('Deploy') {
	    echo "Deploy"

	    sh "cp ${workspace}/target/taskit-0.0.1-SNAPSHOT.war /var/lib/tomcat/webapps/ -p"
	}
}
