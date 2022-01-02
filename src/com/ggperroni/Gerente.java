package com.ggperroni;

public class Gerente extends Funcionario implements IAutenticavel {

    private int senha;

    @Override
    public void setSenha(int senha) {
        this.senha = senha;
    }

    public Gerente(String nome, int cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public boolean autenticar(int senha) {
        return this.senha == senha;
    }

    public double getBonificacao() {
        return super.getSalario() * 0.1;
    }
}