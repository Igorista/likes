fun main(args: Array<String>) {
    println("Статистика лайков:")
    val likes: Int = 1121
    val man: String = "человеку"
    val men: String = "людям"
    val result: String
    if (likes % 10 == 1 && likes % 100 != 11) {
        result = man}
        else if (likes % 100 == 1 && likes % 100 == 11) {
            result = man
    }
        else if (likes % 1000 == 1 && likes % 1000 == 111) {
            result = man
        }
    else {
        result = men
    }
println("Ваша запись понравилась $likes $result")

}