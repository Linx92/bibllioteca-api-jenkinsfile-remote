def call( Map config = [:] ) {
   def solutionFile = config.solution?:'.'
   def configuration = config.configuration?:'Release'

    bat """
        @echo off
        dotnet build --configuration ${configuration} ${solutionFile}
    """
}