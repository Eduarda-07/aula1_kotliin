import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {
    var nome: String = ""
    var dataNascimneto: LocalDate? = null
    var peso: Int = 0
    var altura: Double = 0.0

   private  fun calcularImc(): Double{
        return peso/altura.pow(2)
    }

    fun exibirDados(){
        println("---------------------------------------")
        println("RESULTADOS")
        println("---------------------------------------")
        println("NOME: $nome")
        println("IDADE: ${calcularIdade()}")
        println("PESO: $peso")
        println("ALTURA: $altura")
        println("IMC: ${calcularImc()}")
        println("Classificação: ${classificarImc()}")
        println("---------------------------------------")
    }

    private fun classificarImc(): String{

        val imc = calcularImc()
        val classificacao: String

        if(imc < 18.5){
            classificacao = "Abaixo do peso"
        }else if(imc >= 18.5 &&  imc < 25.0){
            classificacao = "Peso normal"
        }else{
            classificacao = "Acima do peso"
        }
        return classificacao
    }

    fun calcularIdade():Int{
        var hoje = LocalDate.now()
        var idade= Period.between(dataNascimneto,hoje).years
        return idade
    }

}