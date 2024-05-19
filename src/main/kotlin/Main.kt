import kotlin.math.pow

fun main(){
    sentence("Barnie bakes brown bagels and buns")

    sentence2("Barnie bakes brown bagels and buns")

    println(numbers(arrayOf(10, 20, 30, 40, 60, 50)))

    println( numbers(arrayOf(4, 7, 8, 2, 4)))

    volume(12.00)
    volume2(23.00)

//    isPalindrome("Madam")
//    isPalindrome("RaDAR")
//    isPalindrome("joy")

//    palindrome("Madam")

    checkPalindrome("kayak")
    checkPalindrome("sinapsis")

    checkPalindrome("Margaret")

    returnLength2("I love Kotlin")

    multiples(1..1000)

    finalPrice(400.20, 20.00)
}

//Write and invoke a function that given the string “Barnie bakes brown bagels
//and buns” prints out a list of all the other words and characters making up the
//string excluding all possible occurrences of the letter b.
//checkPalindrome
//METHOD 1
fun sentence(text:String){
    var x =text.lowercase().split('b')
    println(x)

}

//METHOD 2
fun sentence2(text:String){
    var y = text.lowercase()
    println(y.replace("b", " "))
}


//Write and invoke one function that takes in an array of integers and returns
//these 3 values: sum, count and average of all the elements.


data class Numbers(
    var sum: Int,
    var count: Int,
    var average: Double
)
fun numbers(x:Array<Int>): Numbers{
    var a = x.sum()
    var b = x.count()
    var c = x.average()

    var result = Numbers(a, b, c)
    println(result)
    return result
}
//
//
////The volume of a sphere is calculated using the formula below
//
//
////Write and invoke a function that is capable of accurately calculating the
////volume of any sphere given its radius. Use 3.14159 as π
//
fun volume(r:Double = 1.333){

    val pie = 3.14159
    val a = 4/3
    var y = a * pie * (r.pow(r))
    println(y)

}

fun volume2(r:Double = 1.333){

    val pie = 3.14159
    val a = 4.0/3
    var y = a * pie * r * r * r
    println(y)

}
//
////A palindrome is a string that reads the same forwards and backwards e.g
////madam, wow, kayak. Write and invoke a function:
////isPalindrome(word: String): Boolean
////that takes in a single word and returns true or false depending on whether the
////word is a palindrome.

//METHOD 1
//fun isPalindrome(word:String): Boolean {
//    var newWord = word.lowercase().reversed()
//   if (newWord == word.lowercase()) {
//        println("true")
//       return  true
//    } else {
//        println("false")
//       return false
//
//    }
//}


//fun palindrome(word:String): Boolean{
//    var name = word.reversed()
//    var result = word == name
//    println(result)
//    return result
//}

fun checkPalindrome(word: String): String{
    var arrChar = word.toCharArray()
    var leftPointer = 0
    var rightPointer = word.length-1

    while (leftPointer < rightPointer){
        var temp = arrChar[leftPointer]
        arrChar[leftPointer] = arrChar[rightPointer]
        arrChar[rightPointer] = temp
        leftPointer++
        rightPointer--
    }
    println(String(arrChar))
    return String(arrChar)


}

//fun returnLength(sentence: String): Int{
//    var newSent = sentence.trim().split(" ")
//    var lastWord = newSent.
//
//}

fun returnLength2(sentence: String): Int {
    var len = 0
    var idx = sentence.trim().lastIndex

    while (idx > 0) {
        if (sentence[idx] != ' ') {
            len++
        } else {
            break
        }
        idx--
    }

    println(len)
    return len


}



fun multiples(x: IntRange) {
    for (i in x) {
        if (i % 6 == 0 && i % 8 == 0) {
            println("Bingo")
        } else if (i % 6 == 0) {
            println(i)
        } else if (i % 8 == 0) {
            println(i)
        }
    }
}



fun finalPrice(purchaseAmnt: Double, perDis: Double){
    if (perDis < 0 || perDis > 100){
        println("Discount out of range")
    }
    else{
        var disc = purchaseAmnt * (perDis / 100)
        var newPrice = purchaseAmnt - disc
        println(newPrice)
    }
}


import java.awt.Label

fun main() {
//    sentence("Scarlet", 19)
//
//    var student = User("Ann", "Njoki", "annnjoki@gmail.com", "0893644", "fey2525")
//    println("email")
//    println(student.email)
//
//    var student2 = User1(45.78, 23, "Joyce", "Anitab lab")
//    println(student2.weight)
//    println("age")
//    println("Joyce")
//    println(student2.lab)

////
////
    val car = Car("Toyota", "Hillux", "KCD 334t", 0)
    val audi = Car("Audi", "A4", "KCA 234z", 0)

    car.start()
    audi.start()
    println(car.make)
    println(audi.make)

    println(audi.speed)
    audi.accelerate(56)
    println(audi.speed)
    audi.accelerate(34)
    println(audi.speed)

    audi.decelerate(30)
    println(audi.speed)

    audi.hoot()
    println("beep beep")

//    audi.stop()
//    println(audi.speed)
////
////    val yellowBulb = LightBulb()
////    val bluebulb = LightBulb()
////
////    val person = Human("John", 45, 56.90,)
////     person.eat(56)
////    println(person)
////
////
////    var person = Human
////
}

class   Car(var make:String, var model:String, var registration:String,var speed:Int) {
    fun start() {
        println("chogiogiogio, vroom")
    }

    fun accelerate(acceleration: Int) {
        speed += acceleration
    }

    fun decelerate(deceleration: Int) {
        speed -= deceleration
    }

    fun hoot() {
        println("beep beep")
    }
}

///    sentence("Scarlet", 19)
////
////    var student = User("Ann", "Njoki", "annnjoki@gmail.com", "0893644", "fey2525")
////    println("email")
////    println(student.email)
////
////    var student2 = User1(45.78, 23, "Joyce", "Anitab lab")
////    println(student2.weight)
////    println("age")
////    println("Joyce")
////    println(student2.lab)
//}
//////
//////
//////    val car = Car("Toyota", "Hillux", "KCD 334t", 0)
//////    val audi = Car("Audi", "A4", "KCA 234z", 0)
//////
//////    car.start()
//////    audi.start()
//////    println(car.make)
//////    println(audi.make)
//////
//////    println(audi.speed)
//////    audi.accelerate(56)
//////    println(audi.speed)
//////    audi.accelerate(34)
//////    println(audi.speed)
//////
//////    audi.decelerate(30)
//////    println(audi.speed)
//////
//////    audi.hoot()
//////    println("beep beep")
//////
//////    audi.stop()
//////    println(audi.speed)
//////
//////    val yellowBulb = LightBulb()
//////    val bluebulb = LightBulb()
//////
//////    val person = Human("John", 45, 56.90,)
//////     person.eat(56)
//////    println(person)
//////
//////
//////    var person = Human
//////
//////}
////
////class   Car(var make:String, var model:String, var registration:String,var speed:Int){
////    fun start(){
////        println("chogiogiogio, vroom")
////    }
////
////    fun accelerate(acceleration: Int){
////        speed+=acceleration
////    }
////    fun decelerate(deceleration: Int){
////        speed-=deceleration
////    }
////    fun hoot(){
////        println("beep beep")
////    }
////    fun stop(){
////        decelerate(speed)
////    }
////}
////
////
////class LightBulb(){
////    fun switchOn(){
////
////    }
////    fun switchOff(){
////
////    }
////}
////class Human(var name:String, var age:Int, var weight:Double){
////    fun eat(foodWeight:Int){
////        weight+=foodWeight
////        println("I am eating ${weight} kgs of food")
////
////        fun birthday(newAge:Int){
////            age+=newAge
////            println(age)
////
////        fun speak(speech:String){
////            println(speech)
////        }
////
////
////        }
////    }
data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){
    fun favFood(dish: String){
        println()

    }    }
////}
//
////fun sentence(name:String, age:Int): String{
////    var statement = "Hi my name is ${name} and I am ${age} years old"
////    println(statement)
////    return statement
////}
////
////data class User(var firstName: String, var lastName:String, var email:String, var phoneNumber:String, var password:String){
////
////}
////class User1(var weight:Double, var age:Int, var name:String, var lab:String)
////

//class Human(name:String, age:Int, weight:Double){
//
//    fun eat(foodWeight:Int){
//        var x = weight + foodWeight
//    }
//
//}






//    fun stop(){
//        decelerate(speed)
//    }
//}
//
//
//class LightBulb(){
//    fun switchOn(){
//
//    }
//    fun switchOff(){
//
//    }
//}
//class Human(var name:String, var age:Int, var weight:Double){
//    fun eat(foodWeight:Int){
//        weight+=foodWeight
//        println("I am eating ${weight} kgs of food")
//
//        fun birthday(newAge:Int){
//            age+=newAge
//            println(age)
//
//        fun speak(speech:String){
//            println(speech)
//        }
//
//
//        }
//    }
//data class User(var firstName:String, var lastName:String, var email:String, var phoneNumber:String, var password:String){
//    fun favFood(dish: String){
//        println()
//
//    }    }
////}

//fun sentence(name:String, age:Int): String{
//    var statement = "Hi my name is ${name} and I am ${age} years old"
//    println(statement)
//    return statement
//}
//
//data class User(var firstName: String, var lastName:String, var email:String, var phoneNumber:String, var password:String){
//
//}
//class User1(var weight:Double, var age:Int, var name:String, var lab:String)
//

//class Human(name:String, age:Int, weight:Double){
//
//    fun eat(foodWeight:Int){
//        var x = weight + foodWeight
//    }
//
//}



fun main(){
    var num = 9
    while (num>0){
        println(num)
        num--
    }
    do {
        println(num)
        num--
    }while (num>0)



    val people = arrayOf("Jack", "Jill", "James", "John")
    for (person in people){
        if (person =="James" ){
            continue
        }
        else{
            println(person)
        }

    }

    fun printSquares() {
        for (num in 1..100) {
            val square = num * num
            if (square < 1000)
                println(square)
        }
    }

    fun printSquares2() {
        for (num in 1..100) {
            val square = num * num
            if (square < 1000) {
                println(square)
            } else {
                break
            }
        }
    }
}

fun main() {
//    IMMUTABLE LIST
    var snacks = listOf("crisps", "cake", "donut", "popcorn", "pizza")
    println(snacks)
    println( snacks.sorted())
//OR
    snacks = snacks.sorted()
    println(snacks)

    //MUTABLE LISTS
    val friends = mutableListOf("Elijah", "Moses", "Daniel", "Susan", "Canary")
    friends.add("Laura")
    friends.add("Terry")
    println(friends)

//    remove method1
    friends.remove("Daniel")
    println(friends)
//    remove method2
    friends.removeAt(4)
    println(friends)
    println(friends[4])
//    Adding an array
    friends.addAll(listOf("peter", "james", "samson"))
    println(friends)
//    adding an array method 2
    friends.addAll(2, listOf("Ann", "Sarah", "Hannah"))

    val fuits = mutableListOf("apple", "banana", "orange", "watermelon")
    val fruits = mutableListOf("")
    val fruits2 = mutableListOf("")
    val vowels = listOf("a", "e", "i", "o", "u")




    createListFromString("Mombasa", "Kitale", "Moyale")
    createListFromString2("Kisumu", "Kajiado")

    oddIndices(listOf(1, 2, 3, 4, 5))

    println(oddIdxSum2(listOf(10, 70, 90, 80, 50, 40, 30)))

    val phone = Product("Samsung Galaxy", 0.15, 50000.0)
    val milk = Product("Tuzo", 0.5, 65.0)
    val bread = Product("Supaloaf", 0.4, 55.0)

    var myCart = listOf(phone,milk,bread)
    myCart = myCart.sortedBy { product -> product.name }
    println(myCart)

    var myCart2 = listOf(phone,milk,bread)
    myCart = myCart2.filter{ product -> product.price>60 }
    println(myCart2)

    var myCart3 = listOf(phone,milk,bread)
    myCart3 = myCart3.filterIndexed { index, product -> index % 2 == 0 }
    println(myCart3)



//
}

fun createListFromString(city1:String, city2:String, city3:String): List<String>{
    return listOf(city1, city2, city3)
}

fun  createListFromString2(vararg cities:String): MutableList<String>{
    val result  = mutableListOf<String>()
    cities.forEach { city-> result.add(city) }
    println(result)
    return result
}

//write a fxn that takes in a list containing 5 integers and returns the sum of the elements at odd indices

fun oddIndices(nums: List<Int>): Int{
    var sum = nums [1] + nums [3]
    println(sum)
    return sum
}

//fun oddIdxSum(nums: List<Int>): Int {
//    var sum = 0
//    for (number in nums) {
//        var idx = nums.indexOf(number)
//        if (idx % 2 != 0)
//            println(sum + number)
//
//    }
//
//
//
//}

fun oddIdxSum2(nums2: List<Int>): Int{
    var sum = 0
    nums2.forEachIndexed { index, item ->
        if (index % 2 != 0){
            sum += item
        }
    }
    return sum
}

//fun stringIndices(list:List<Int>): List<Int>{
//    var x = list.forEachIndexed{ index, ->  }
//}

// SORTING LISTS
data class Product(var name: String, var weight:Double, var price:Double){

}
//
//data class Checks(
//    var word: List<String>
//)


data class Checklist(
    val name: String,
    val price: Double,
    val quantity: Int,
    val category: String

)

fun hygiene(product: List<Checklist>): Map<String, Double>{
    val totals = mutableMapOf<String, Double>()

}


fun main() {


    var x: Int? = 5
    x = null
    println(x)

    var friends = arrayOf("Mary", "Beth", "Steve", "Diana")
    println(friends.contentToString())

    friends.sort()
    println(friends)

    friends.forEach { x ->
        println(x)
    }
    for (x in friends) {
        println(x)
    }


    friends = friends.plus("Emma")
    println(friends.contentToString())

    friends = friends.plus(arrayOf("Glory", "Kuria",))
    println(friends.contentToString())


    var nums = arrayOf(23, 14, 156, 78, 5, 35, 24, 768, 78)
    println(nums.sum())
    println(nums.count())
    println(nums.size)
    println(nums.sum() / nums.size)
    println(nums.sum().toDouble() / nums.size)
    println(nums.average())
    println(nums.minOrNull())
    println(nums.maxOrNull())
    nums.sort()
    println(nums.contentToString())
    nums.sortDescending()
    println(nums.contentToString())
    nums = nums.sortedArray()
    println(nums.contentToString())

    nums.forEach { y ->
        println(y)
    }
}


//
//fun main(){
//    printSquare (numbers =  arrayOf (23, 14, 156, 78, 5, 35, 24, 768, 78))
//}
//
//fun printSquare(numbers:Array<Int>): Array<Int>{
//    val squares = Array(numbers.size){0}
//
//
//
//}

fun main(){
    var emptyString = ""
    var blankString = " "
    println(emptyString.isEmpty())
    println(blankString.isEmpty())

    println(emptyString.isBlank())
    println(blankString.isBlank())

    var statement = "Good morning"
    println(statement[4])

    val town = " kitale "
    println(town)
    println(town.trimStart())
    println(town.trimEnd())
    println(town.trim())

    var statements = "the blue car overtook the black car"
    println(statements.endsWith("t"))

    var statementes = "the blue car overtook the black car"
    println(statementes.split("o"))
    var dateNow = "2024-02-28"
    println(dateNow.split("-"))




}
