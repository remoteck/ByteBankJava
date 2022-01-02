package com.ggperroni;

public class SistemaInterno {

    public void autenticar(IAutenticavel senha) {
        int senha1 = 2222;
        boolean autenticou = senha.autenticar(senha1);
        if(autenticou) {
            System.out.println("Autorizado!");
        } else {
            System.out.println("Não Autorizado!");
        }
    }

}
