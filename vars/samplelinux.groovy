def call() {
  echo "The current working directory is : "
  sh "echo $pwd"
  echo "current username : "
  sh "echo $whoami"
}
def content(m) {
  sh "the content of file {$m} are :"
  sh "echo $cat m" 
}
