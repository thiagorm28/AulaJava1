package com.db1.AulaJava1.db1start;

public class Application {
    //Exercícios de Inteiro (Integer)

    //1 - Método que some dois números
    public Integer soma(Integer num1, Integer num2) {
        return num1 + num2;
    }

    //2 - Método que subtraia dois números
    public Integer subtracao(Integer num1, Integer num2) {
        return num1 - num2;
    }

    //3 - Método que multiplique dois números
    public Integer multiplicacao(Integer num1, Integer num2) {
        return num1 * num2;
    }

    //4 - Método que divida dois números
    public Double divisao(Double num1, Double num2) {
        return num1 / num2;
    }

    //5 - Método que diga se o número é par
    public String par(Integer num1) {
        if (num1 % 2 == 0) {
            return "É par";
        }
        return "Não é par";
    }

    //6 - Método que receba dois números e diga qual é o maior
    public Integer maior(Integer num1, Integer num2) {
        if (num1 > num2) {
            return num1;
        }
        return num2;
    }

    //7 - Método que a partir de um valor inicial, mostre a quantidade de n ímpares até ele.
    public Integer imparesateele(Integer valorfinal) {
        Integer quantidade = 0;
        for (int cont = 0; cont <= valorfinal; cont++) {
            if (cont % 2 == 1) {
                quantidade++;
            }
        }
        return quantidade;
    }

    //Exercícios de Texto (String)

    //1 - Método que receba um texto e devolva ele em LETRAS MAIUSCULAS

    public String maiusc(String frase){
        return frase.toUpperCase();
    }

    //2 - Método que receba um texto e devolva ele em LETRAS MINUSCULAS

    public String minusc(String frase){
        return frase.toLowerCase();
    }
}