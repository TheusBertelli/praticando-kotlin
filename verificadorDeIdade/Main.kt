// função if em uma única linha
fun classificarIdade(idade:Int): String = if(idade > 18) "maior de idade" else "menor de idade"

fun main() {

// variavel para teste
val minhaIdade = 19

// chamando a função e guardando o resultado
var classificacao = classificarIdade(minhaIdade)

// imprimindo o resultado
println("Com $minhaIdade anos você é $classificacao")

}
