def call(Map config = [:]) {

    sh "echo Hello ${config.name}. Today is ${config.dayOfWeek}."

}

def call(place) {

    sh "echo from ${place}"
}
