package poo

class Pessoa {
    var nome: String = "Victor"
    var cpf: String = "123.123.123-12"
        private set

    fun pessoaInfo() = "$nome e $cpf"
}

fun main(){
    val victor = Pessoa()
    println(victor.pessoaInfo())
}