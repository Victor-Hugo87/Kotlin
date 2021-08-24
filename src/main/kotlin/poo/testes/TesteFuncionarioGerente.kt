package poo.testes

import poo.Gerente

fun main() {
    val maria = Gerente(nome = "Maria", cpf = "789789789-89", salario = 5000.0)
    ImprimeRelatorioFuncionario.imprime(maria)
}
