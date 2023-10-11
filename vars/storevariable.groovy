def call() {
  env.MYVAR = readFile file: 'vars/loops.groovy'
  echo "This is the value of ${MYVAR}" 
}
  
