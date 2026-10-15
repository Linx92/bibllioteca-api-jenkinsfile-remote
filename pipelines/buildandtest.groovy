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
}

return this