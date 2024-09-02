package com.example.proyecto1.clases
//class variables{

fun main(){
//variables numéricas
    val age:Int = 20
    val long_number:Long = 98765432198765
    val temperature:Float = 27.123f
    val weight:Double = 60.4

//variables tipo String
    val gender:Char = 'M'
    val name:String = "Ricardo Reyes"

//variables tipo Boolean
    val isGreater:Boolean = false

//variables tipo Array
    val names = ArrayOf("Erik", "Silvia", "Hector", "Gabriela")


    println(age)
    println(long)
    println(temperature)
    println(weight)
    println(gender)
    println(name)
    println(isGreater)
    println(names)

    println(add())
    println(product(x:9, y:92))
    printArray(names)



    println(names.joinToStrinh())
    val numbers = ArrayOf(1,2,3,4,5,6,7,8,9)
    isEven(numbers)
    println(getDay( day:4))

    val person = Person(name:"Andrea, age:22)
    println(person.name)
    println(person.age)
    person.displayInformation()


    val numbers = ArrayOf(1,2,3,4,5,6,7,8,9)
    fun isEvent(numbers:Array<Int>){
        for (number in numbers){
            if (number % 2== 0){
                println("The number $number is Even)
            } or else{
                println("The number $number is Odd"}
        }
    }

}
fun getDay(day:Int): String {
    var names = ""
    when (day){
        1 -> name = "Monday"
        2 -> name = "Tuesday"
        3 -> name = "Wednesday"
        4 -> name = "Thursday"
        5 -> name = "Friday"
        6 -> name = "Saturday"
        7 -> name = "Sunday"
        else -> name = "Incorrect Value"
    }
    return name
}

fun add():Int{
    val x:Int = 5
    val y:Int = 10

    return (x + y)
}

fun product(x:Int, y:Int):Int{
    return x+ y
}

fun printAArray(){
    for(name in name){
        print("Hello $name")
    }
    class Person (val name: String, val age: Int){
        fun displayInformation(){
            println
        }
    }
}
//}
