fun main() {
var person=Human("melvin",26,58)
    person.eat(2)
    println(person.weight)
    person.speak("my name is Melvine")
    person.birthday(1)
    println(person.age)

    var name=Information("Darlene","Nyanchoka","nyanchokdarlen@gmail.com",790878989,"lindsay")
     println(name.email)
    println(name.lastName)
}
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        weight+=foodWeight
        println("I am eating $foodWeight kgs of food")
    }
    fun speak(speech:String){
        println(speech)

    }
fun birthday(incremation:Int){
    age += incremation
}

}
data class Information(var firstName:String,var lastName:String,var email:String,var phoneNumber:Int,var password:String )
