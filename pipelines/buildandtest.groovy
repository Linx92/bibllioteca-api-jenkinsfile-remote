def call(String projectName = 'defaultProject') {
    stage('Checkout App') {
        checkout scm
    }

    stage('Restore Dependencies') {
        bat 'dotnet restore'
    }

    stage('Build') {
        bat 'dotnet build --configuration Release'
    }

    stage('Test') {
        bat 'dotnet test --configuration Release'
    }

    stage('Publish') {
        bat 'dotnet publish --configuration Release --output publish'
    }
}

return this