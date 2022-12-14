abstract class Pet1(var name: String)
class Cat1(name: String) : Pet(name)
class Dog2(name: String) : Pet(name)
class Fish1(name: String) : Pet(name)

class Contest1<T: Pet>() {
    var scores: MutableMap<T, Int> = mutableMapOf()
    fun addScore(t: T, score: Int = 0) {
        if (score >= 0) scores.put(t, score)
    }
    fun getWinners(): Set<T> {
        val highScore = scores.values.maxByOrNull { it }
        val winners = scores.filter { it.value == highScore }.keys
        winners.forEach{ println("Winner: ${it.name}")}
        return winners
    }
}
//411