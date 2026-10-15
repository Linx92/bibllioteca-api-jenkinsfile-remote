def call( Map config = [:] ) {
   def solutionFile = config.solution?:'.'
   def configuration = config.configuration?:'Release'

    bat """
        @echo off
        dotnet test --configuration ${configuration} ${solutionFile}
    """
}