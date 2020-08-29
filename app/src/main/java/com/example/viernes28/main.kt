package com.example.viernes28


fun main() {

    // EJERCICIO 1

      val num = 10
      var palabra = "algo"
      val char = '1'
      val decimal = 10f

     println("$num $palabra $char $decimal")

    var num1 = 10
    val num2 = 33
    val num3 = 66

    var resultado = num1 + num2 + num3
    println("El resultado es: $resultado" )

    num1 = 55
    resultado = num1 + num2 + num3
    println("El resultado es: $resultado" )
    println("El resultado es: ${num1 + num2 + num3}" )

    val promedio = (num1+num2+num3)/3
    println("El promedio es: $promedio" )

    // EJERCICIO 2

    //println(imprimirNombreCompleto("Fernanda", "Arenas", 27))

}
// Funcion ejercicio 2
//printAll("Hola" , "cristian")

//imprimirAllWithPrefix("hello" , "hallo", "salu")
//funciones de extension
val nombre = "carlos"
val nombre2= "antonio"
"algo".imprime()
nombre2.imprime()
fun imprimirNombreCompleto(nombre: String, apellido: String, edad: Int):String {
return "Mi nombre es: $nombre $apellido y tengo $edad anios"
}

fun printMessage(message: String) {
    println(message)
}

fun printMessageWithPrefix(name: String, prefix: String="Estudiante :"){

}
fun sun(x: Int, y: Int): Int {
    return x+y
}

fun multiplicacion(num: Int, num2: Int): Int{
    return num * num2
}
//funcion que recibe multiples parametros
fun printAll(vararg message:String) {
    for (m in message) println(m)
}
fun imprimirVariasparatros(varag message: String ) {
    for(elemnto in message) println(elemnto)
}
fun imprimirAllWithPrefix(varag message: String, prefix: String ) {
    for(elemento in message) println(prefix + elemento)
}


fun String.imprime() {
    println(this)
}

fun String.despedida() {
    println("chao")
}