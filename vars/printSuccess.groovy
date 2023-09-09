def call()
{
     def packageJSON = readJSON file: 'package.json'
     def packageJSONVersion = packageJSON.version
     return packageJSONVersion
}
