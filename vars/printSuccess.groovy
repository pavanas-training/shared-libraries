def call()
{
     sh 'echo Success';
     def packageJSON = readJSON file: 'package.json'
     def packageJSONVersion = packageJSON.version
     echo "${packageJSONVersion}"
}
