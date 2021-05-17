class Hippo: Animal() {

    override fun makeNoise() {
        hunger++
        println("The Hippo is making a noise. Hunger level: $hunger")
    }

    override fun eat() {
        hunger--
        println("The Hippo is eating. Hunger level: $hunger")
    }

}