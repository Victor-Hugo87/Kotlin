package poo.testes

import poo.Gerente

fun main() {
    val maria = Gerente("Maria do Carmo", "1234567899", 5000.0, "senha123")

    ImprimeRelatorioFuncionario.imprime(maria)

    TesteAutenticacao().autenticacao(maria)
}
