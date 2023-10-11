echo "The current working directory is : "
sh "echo $pwd"
echo "list of files are : "
sh "echo $ls"
def content(m) {
  sh "the content of file {$m} are :"
  sh "echo $cat m" 
}
