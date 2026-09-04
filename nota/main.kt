fun main(){
    val nota = 75
    
    val conceito = when (nota){
        in 70..79 -> "Nota boa"
        in 80..89 -> "Nota muito boa"
        in 90..100 -> "Gabaritou"
        else -> "reprovado"
        }
        println("sua nota é $nota que é equivalenta á $conceito")
}
 
