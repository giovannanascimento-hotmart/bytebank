package br.com.alura.bytebank.teste

import br.com.alura.bytebank.modelo.Cliente
import br.com.alura.bytebank.modelo.Conta
import br.com.alura.bytebank.modelo.ContaCorrente
import br.com.alura.bytebank.modelo.ContaPoupanca
import testaContasDiferentes

fun testaObjects(){
    val alex = Cliente (
        nome = "Alex",
        cpf = "",
        senha = 1,
    )
    val contaPoupanca = ContaPoupanca(titular = alex, numero = 1000)
    val contaCorrente = ContaCorrente(titular = alex, numero = 1001)

    testaContasDiferentes()

    println("Total de contas: ${Conta.total}")
}