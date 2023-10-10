def call(n) {
    if (n == 5) {
        script {
            sh """
                echo Hi Alice
            """
        }
    } else if (n < 5) {
        script {
            sh """
                echo Hello Alice
            """
        }
    } else {
        script {
            sh """
                echo Whats up Alice
            """
        }
    }
}
