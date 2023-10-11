def call() {
  echo "The current working directory is : "
  sh "echo $pwd"
  
}
def content(m) {
  sh "the content of file {$m} are :"
  sh "echo $cat m" 
}
