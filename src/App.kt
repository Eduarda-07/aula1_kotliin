import java.time.LocalDate
import java.time.LocalTime
import java.time.Period

fun main() {
    println("Olá mundo!!")

    var nomeEscola = "senai"

    nomeEscola = "sesi"

    nomeEscola = "10"

    var idade = 19
    var email: String
    var preco: Double
    // double para números descimais
    preco = 11.0

    var peso: Int
    peso  = -12

    var aprovado = true
    var ligado: Boolean

    var dataNascimento = LocalDate.of(2007, 7,20)

    println(LocalTime.now())
    println(dataNascimento.dayOfWeek)

    var hoje = LocalDate.now()
    idade = Period.between( dataNascimento,hoje).days
    println(idade)

    var dataAbertura = LocalDate.of(2026, 6, 11)
    var dias = Period.between(hoje, dataAbertura).days
    println(dias)

    println("*********************************************************")


    var paciente1 = Paciente()
    paciente1.nome = "Eduarda de Jesus"
    paciente1.altura = 1.67
    paciente1.peso = 50
    paciente1.dataNascimneto = LocalDate.of(2007,7,20)
    paciente1.exibirDados()

    println("*********************************************************")

    var paciente2 = Paciente()
    paciente2.nome = "Ana Maria"
    paciente2.altura = 1.70
    paciente2.peso = 53
    paciente2.dataNascimneto = LocalDate.of(2003,8,14)
    paciente2.exibirDados()

    println("*********************************************************")
}