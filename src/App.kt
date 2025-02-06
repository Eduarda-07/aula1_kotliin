import br.senai.sp.jandira.imc.model.Consulta
import br.senai.sp.jandira.imc.model.Medico
import br.senai.sp.jandira.imc.model.Paciente
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

    //Criar objeto médico

    var medico1 = Medico()

    medico1.nome = "Paula Oliveira"
    medico1.crm = "333333-09"
    medico1.especialidades.add("Clínico geral")
    medico1.especialidades.add("Cardiologista")
    medico1.especialidades.add("Dermatologista")
    medico1.exibirFichaDoMedico()

    //Criar consulta
    var consulta1 = Consulta()
    consulta1.marcarConsulta(
        900.0,
        medico1,
        paciente1,
        LocalDate.of(2025,2,23),
        LocalTime.of(10,30))
    consulta1.mostrarDadosConsulta()




    //Criar lista de frutas
//    var frutas = ArrayList<String>()
//    frutas.add("Banana")
//    frutas.add("Melancia")
//    frutas.add("Uva")
//    frutas.add("Maçã")
//
//    println(frutas.count())
//    println(frutas.size)
//    println(frutas[2])
//    frutas[1] = "Melão"
//    println(frutas[1])
//    println(frutas[1])
//
//    var contador = 1
//    while (contador <= 10){
//        println("$contador - SENAI")
//        contador+=2
//    }
//
//    // voltas seria o contador
//    // step - para pular a contagem, ex: 0,3,6,9...
//    for(voltas in 1..100 step 3){
//        println("$voltas - SESI")
//    }
//
//    var i = 0
//
//    while (i< frutas.count()){
//        println("$i - ${frutas[i]}")
//        i++
//
//    }
//
//    for(fruta in frutas){
//        println(fruta)
//    }

}