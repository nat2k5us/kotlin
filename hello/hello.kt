fun main() {
    // 1 = variables
    // var data1 = "hello"
    // var data2 = "world"
    // val combined = data1 + data2    
    // println(combined)
    // data1 = data1 + data2
    // println(data1)


    // val int1 = 9
    // val int2 = 19
    // val result = int1 % int2
    // println(result)

    // 2 = Strings 
    // val kotlin = "KOTLIN"
    // println(kotlin.length)
    // println(kotlin.isEmpty())
    // println(kotlin.substring(3,5))
    // println("$kotlin substring " + kotlin.substring(3,5))

    // 3 = input and string 
    // print("enter your age:")
    // val age = Integer.valueOf(readLine())
    // if (age > 13 && age < 20)
    //     println("Teenager - growing up is not hard")
    // else if (age > 20 && age < 35 )
    //     println("Young adult - are the harmones kicking in?")
    // else if (age > 21 && age < 35)
    //     println("Have you gotta job yet? ")
    // else if (age > 35 && age < 55)
    //     println("responsibility - mid life crisis starts ")
    // else if (age > 50 )
    //     println("Do you have a retirement plan")

    // 4 - Collections
    // val cities = listOf<String>("San Diego", "Denver", "Austin")
    // println("Cities lived in " + cities)
 
    //default listOf is not muteable - change to mutable list to add
//     val cities = mutableListOf<String>("San Diego", "Denver", "Austin")
//     cities.add("dallas")
//     cities.add("las vegas")
//     println("Cities lived in " + cities)

//    // 5 - Loops
//     for (name in cities) {
//         print(name + ", " )
//     }

//     for (i in 1..3){
//         println (i)
//     }

    // 6 -  Functions
    // testFunction("John Doe")
    // println(testFunction("John Doe"))

    // 7 - Null Checking
    var b: String?  //  null allowed
    b = null // ok
    print(b)

}

fun  testFunction(name: String): String {
    //println( "hello " + name)
    return "Hello " + name
}

