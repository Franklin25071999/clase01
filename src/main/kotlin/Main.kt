fun main(){
    val dayOfBirth : Int = 2
    val monthOfBirth : Int = 1
    println("My birthday is: $dayOfBirth/$monthOfBirth")
    println("My birthday is: " + dayOfBirth + "/" + monthOfBirth)
    var name : String = "Daniel"
    var lastName : String = "Soto"
    println("My name is: ${name.uppercase()} $lastName")
    println("My name is: " + name + " " + lastName)
    name = "Pedro"
    println("My name is $name $lastName")
}