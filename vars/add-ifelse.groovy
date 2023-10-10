def call() {
    if ("hi") {
        script {
            sh """
                echo Hi Alice
            """
        }
    } else if ("hello") {
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
