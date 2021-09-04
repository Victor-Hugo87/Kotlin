package poo

class Cliente(
    nome: String,
    cpf: String,
    val clienteTipo: ClienteTipo,
    val senha: String
):
    Pessoa(nome,cpf), Login {
    override fun login(senha: String) {
        println(login())
    }

    override fun login(): Boolean = "123456" == senha

    override fun toString(): String= """
    Nome: $nome
    Cpf: $cpf
    Tipo: $clienteTipo
    """.trimIndent()



}