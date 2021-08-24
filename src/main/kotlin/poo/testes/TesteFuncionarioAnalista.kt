package poo.testes

import poo.Analista

fun main() {
    val joao = Analista(nome = "Joao", cpf = "123123123-12", salario = 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)}
