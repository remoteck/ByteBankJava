package com.ggperroni;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public boolean sacar(double valor) {
        return super.sacar(valor + 0.2);
    }
}
