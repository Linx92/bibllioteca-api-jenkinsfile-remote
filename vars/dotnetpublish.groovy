def call( Map config = [:] ) {
   def solutionFile = config.solution?:'.'
   def configuration = config.configuration?:'Release'
   def outputDir = config.outputDir?:'publish'

    bat """
        @echo off
        dotnet publish --configuration ${configuration} --output ${outputDir} ${solutionFile}
    """
}