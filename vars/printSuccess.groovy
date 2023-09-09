def call()
{
     def packageJSON = readJSON file: 'package.json'
     def packageJSONVersion = packageJSON.version
     echo "VERSION: ${packageJSONVersion}"
     return ${packageJSONVersion}

}
