def call() {
  echo "The current working directory is : "
  sh "echo $pwd"
def search(l) {
  echo "search results for {$l} are :
  sh "echo $find l"
}
  
}
def content(m) {
  sh "the content of file {$m} are :"
  sh "echo $cat m" 
}
