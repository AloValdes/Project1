package com.example.proyecto1.clases.ui

//class Variables {

fun main (){
    // numeric variables
    val age:Int =20
    val long_number:Long = 98765433566778
    val temperature:Float =27.123f
    val weight:Double =60.4

    //string
    val gender: Char ='m'
    val name: String ="Alondra Valdés"

    //Boolean
    var isGreater:Boolean= false

    //Array
    val names= arrayOf("Alondra","Rubí","Valdés","Mora")

    println(age)
    println("Welcome $name,to your first kotlin project")
    println(add())
    println(product(10,92))
    printArray(names)

    println(names.joinToString())

    val numbers=arrayOf(1,2,3,4,5,6,7,8,9)
    isEven(numbers)

    println(getDay(4))

    val person = Person(name="Andrea",age=22)

    println(person.name)
    println(person.age)
    person.displayInformation()
}
fun add():Int{
    val x:Int =5
    val y:Int =10
    return x+y
}

fun product(x:Int, y:Int):Int {
    return x + y
}

fun printArray(names:Array<String>){
    for(name in names){
        print("hello $name")


    }
}
fun isEven(numbers:Array<Int>){
    for (number in numbers){
        if(number % 2==0){
            println("the number $number is Even")
        } else {
            println("the number $number is Old")
        }
    }
}

fun getDay(day:Int):String {
    var name=""

    when(day){
        1-> name="Monday"
        2-> name="Tuesday"
        3-> name="Wednesday"
        4-> name="Thursday"
        5-> name="Friday"
        6-> name="Saturday"
        7-> name="Sunday"
        else ->name ="Incorrect Value"
    }

    return name
}

class Person (val name: String, val age:Int){
    fun displayInformation(){
        println("Name: $name,Age : $age")
    }
}

//}