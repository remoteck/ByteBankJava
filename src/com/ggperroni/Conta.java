package com.ggperroni;

public class Conta {
    private double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int totalContas;

    public Conta(int agencia, int numero) {
        if(agencia < 0) {
            System.out.println("Agencia inexistente!");
        } else
            this.agencia = agencia;

        if(numero < 0) {
            System.out.println("Número precisa ser maior que zero!");
        } else
            this.numero = numero;
        totalContas++;
    }

    public static int getTotalContas(){
        return totalContas;
    }

    public int getAgencia() {
        return this.agencia;
    }

    public int getNumero() {
        return this.numero;
    }

    public Cliente getCliente() {
        return this.titular;
    }

    public void setCliente(Cliente titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

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