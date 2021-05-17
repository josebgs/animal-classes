fun main(){
        val hippo = Hippo()
        val wolf = Wolf()

        hippo.food = "grass"
        hippo.habitat = "a swamp"
        hippo.image = "large"

        wolf.food = "three little piggies"
        wolf.habitat = "the forest"
        wolf.image = "scary"

        wolf.roam()
        wolf.sleep()
        wolf.makeNoise()
        wolf.eat()
        wolf.summary()

        hippo.roam()
        hippo.sleep()
        hippo.makeNoise()
        hippo.eat()
        hippo.summary()

    }