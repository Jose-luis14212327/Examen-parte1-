println("Examen scala")
println("Jose Luis Flores Reyes")


//Ejercicio 1

def EsPar (num: Int): Boolean= {
if (num%2==0){
return true }
return false
}
val input = readInt //Agregando el numero
println(EsPar(input))

//Ejercicio 2

def HayPares(list:List[Int]): Boolean = {
   for (i <- list)
       if(i%2 == 0) return true
   return false
}
if(HayPares(List(3,7,5,11,7))) println("Par Existe") else println("Par no existe")


//Ejercicio 3

def Lucky7(list:List[Int]): Int = {
   var plus = 0
   for (p <- list){
       if(p == 7) plus += 14
       else plus += p
   }
   return plus
}
println("Resultado = " + Lucky7(List(12, 9, 8, 14,7 )))

//Ejercicio 4

def Equal(list:List[Int]): Boolean = {
   var p = 0
   var s = list.sum
   for (e <- list){
       p += e
       s -= e
       if(p == s)
           return true
           
   }
    return false
}
if(Equal(List(7,3,4))) println("true") else println("false")

//Ejercicio 5

val palabra1 = "reconocer"
val palabra2 = "Roma"

if(palabra1 == palabra1.reverse) print("Es palíndroma") else print("No es palíndroma")
