package com.ggperroni;

public class Conta {
    double saldo;
    int agencia;
    int numero;
    Cliente titular;

    public void depositar(double valor) {
        System.out.println("Foi depositado R$" + valor + " na sua conta");
        this.saldo += valor;
    }

    public boolean sacar(double valor) {
        if(this.saldo < 0) {
            System.out.println("Saldo insuficiente!");
            return false;
        }
        this.saldo -= valor;
        return true;
    }

    public boolean transferir(double valor, Conta destino) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            destino.depositar(valor);
            return true;
        }
        return false;
    }
}