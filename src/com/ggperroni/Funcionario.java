package com.ggperroni;

public abstract class Funcionario {

    private final String nome;
    private final int cpf;
    private final double salario;

    public Funcionario(String nome, int cpf, double salario) {
        this.nome = nome;
        this.cpf = cpf;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public double getSalario() {
        return salario;
    }

    public abstract double getBonificacao();
}