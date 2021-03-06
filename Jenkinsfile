// make sure to setup global tool configuration for Maven with name 'M3' and Docker with name 'My Docker'
node {
    def mvnHome
    def dockerHome
    registry = "devtrixstudio/pool-dss-bo"
    registryCredential = 'trixdockerhubcreds'
    TARGET_VERSION=''

    stage('Preparation') { // for display purposes
        dockerHome = tool 'My Docker'
        withEnv(["DOCKER_HOME=dockerHome"]) {
            sh "docker version"
        }
        // Get some code from a GitHub repository
        git branch: 'sit',
            credentialsId: 'ssh-gitlab-aji',
            url: 'git@gitlab.com:infini88/pool/pool-bo.git'
        // Get the Maven tool.
        // ** NOTE: This 'M3' Maven tool must be configured
        // **       in the global configuration.
        mvnHome = tool 'M3'
    }
    stage('Build JAR') {
        // Run the maven build
        withEnv(["MVN_HOME=$mvnHome"]) {
            if (isUnix()) {
                sh '"$MVN_HOME/bin/mvn" -B -Dmaven.test.failure.ignore clean package'
            } else {
                bat(/"%MVN_HOME%\bin\mvn" -Dmaven.test.failure.ignore clean package/)
            }
        }
    }
//     stage('Results') {
//         junit '**/target/surefire-reports/TEST-*.xml'
//         archiveArtifacts 'target/*.jar'
//     }
    stage('Build Docker') {
        // Run the docker build
        TARGET_VERSION=sh (
            returnStdout: true,
            script: 'echo "$(ls -d target/*.jar)" | sed \'s/target\\/dss-bo-\\(.*\\).jar/\\1/\''
        ).trim()
        println TARGET_VERSION

        if ( !TARGET_VERSION.isEmpty() )
        {
            sh (
                script: '''#!/bin/bash
                JARS=$(ls -d "target/dss-bo"-*.jar)
                echo "done"
                echo $JARS
                if [ ${#JARS[@]} == 0 ];
                then
                  echo "No Jar file in "target" folder"
                  exit
                fi

                echo "Copying ${JARS[0]} to build folder"

                if [ ! -d "build" ]
                then
                  mkdir build
                fi
                cp "${JARS[0]}" build/dss-bo.jar
                '''.stripIndent()
            )

            script {
                dockerImage = docker.build registry +pool-dss-staging ":"+ TARGET_VERSION
            }
        }
        //sh returnStatus: true, script: 'bash docker-build-image.sh'
    }
    stage('Push Docker Image') {
        script {
            docker.withRegistry( '', registryCredential ) {
                dockerImage.push(TARGET_VERSION)
                dockerImage.push('latest')
            }
        }
    }
}

