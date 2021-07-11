fun main() {
    val likes = 6670
    val likedFirst = "Человеку"
    val likedSecond = "Людям"

    val result = if(likes % 10 == 1) ("$likes $likedFirst") else ("$likes $likedSecond")
        println("Понравилось $result")
}