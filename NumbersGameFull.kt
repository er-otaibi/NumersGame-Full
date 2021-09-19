import kotlin.random.Random

fun numbersgamefull(){


    val numGame = Random.nextInt(11)
    var count = 1
    while( count <= 3) {
        try {
            print("Guess a number between 0 and 10:  ")
            var num = readLine()!!
            when (num) {
                "quit" -> break
                else -> {
                    if (num.toInt() in 0..10) {
                        count++
                        if (num.toInt() == numGame) {
                            println("You Got it!")
                        } else {
                            println("Wrong guess. Try again..")
                        }
                    } else {
                        println("number must be between 0 and 10")
                        continue
                    }
                }
            }
        } catch (e: Exception) {

            println("please enter numbers only.")

            continue
        }
    }
    println("Game Over")

}