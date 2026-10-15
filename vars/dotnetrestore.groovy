def call( Map config = [:] ) {
   def solutionFile = configu.solution?:'.'

    bat """
        @echo off
        dotnet restore ${solutionFile}
    """
}