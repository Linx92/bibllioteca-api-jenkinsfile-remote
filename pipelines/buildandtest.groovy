def call( string projectName = 'defaultProject'){
    stage('Checkout App'){
        steps{
            script{
                checkout scm
            }
        }
    }

    stage('Restore Dependencies'){
        steps{
            script{
                bat 'dotnet restore'
            }
        }
    }

    stage('Build'){
        steps{
            script{
                bat 'dotnet build --configuration Release'
            }
        }
    }
}

return this