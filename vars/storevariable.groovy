def call() {
  env.MYVAR = readFile file: '/var/lib/jenkins/workspace/loops.groovy'
  echo "This is the value of ${MYVAR}" 
}
  
