def call( Map config = [:] ) {
   def solutionFile = config.solution?:'.'

    bat """
        @echo off
        dotnet restore ${solutionFile}
    """
}