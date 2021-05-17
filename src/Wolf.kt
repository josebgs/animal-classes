class Wolf: Animal() {
    override fun makeNoise() {
        hunger++
        println("The Wolf is howling: Hunger level: $hunger")
    }

    override fun eat() {
        hunger--
        println("The Wolf is eating. Hunger level: $hunger")
    }
}