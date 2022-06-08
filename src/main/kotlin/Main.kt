fun main() {
    val likes = 5231
    val firstVariantPeople = "человеку"
    val secondVariantPeople = "людям"
    val man = if (likes.toString().endsWith("1")) firstVariantPeople else secondVariantPeople
    println("Понравилось $likes $man")
}