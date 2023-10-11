def call() {
  echo "The current working directory is : "
  sh "echo $pwd"
  echo "github version : "
  sh "echo $github --version"
  echo "login details are :"
  sh "echo $github log"
}

  

