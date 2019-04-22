#!/usr/bin/env groovy

pipeline {
    agent any

    tools {
        maven 'maven'
        jdk 'jdk1.8'
    }

    stages {
        stage('Build') {
            steps {
                sh "printenv"
                sh "mvn clean test package spring-boot:repackage"

                jacoco(
                        execPattern: 'target/**/*.exec',
                        classPattern: 'target/classes',
                        sourcePattern: 'src/main/java',
                        exclusionPattern: 'src/test*',
                        buildOverBuild: true,
                        changeBuildStatus: true,
                        maximumLineCoverage: '61'
                )
            }
        }

        stage("deploy to test"){
            when {
                branch 'master'
            }
            steps{
                echo "deploy to test"
            }
        }

        stage("deploy to prod"){
            when {
                branch 'release'
            }
            steps{
                echo "deploy to prod"
            }
        }


    }
    post {
        always{
//            junit 'target/surefire-reports/**/*.xml'
            junit(testResults: '**/target/surefire-reports/**/*.xml')


        }

    }
}
