package com.db1.db1start;

import java.util.Scanner;

public class Atp {
    public static void main(String[] args) {
        //Exercício de Inteiro (Integer)
        //1 - some dois números
        System.out.println("Somando dois numeros");
        Integer numInt1, numInt2, soma;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        numInt1 = scan.nextInt();
        System.out.println("Insira o segundo numero: ");
        numInt2 = scan.nextInt();
        soma = numInt1 + numInt2;
        System.out.println("A soma e igual a " + soma);
        //2 - subtraia dois números
        System.out.println("Subtraindo os 2 numeros");
        Integer resul;
        resul = numInt1 - numInt2;
        System.out.println("A subtracao dos dois numeros e igual a " + resul);
        //Exercícios de Texto (String)
        //1 - Crie uma variável que recebe um texto com letras minusculas e imprima com LETRAS MAIUSCULAS
        System.out.println("Transformando todas as letras de uma string para maiusculas ");
        String text;
        text = scan.next();
        text = text.toUpperCase();
        System.out.println(text);
        //2 - Crie uma variável que receba um texto e devolva ele em LETRAS MINUSCULAS
        System.out.println("Transformando todas as letras de uma string para minusculas");
        text = scan.next();
        text = text.toLowerCase();
        System.out.println(text);
        //Exercício de Matematica (Double)
        //1 - Crie duas variáveis double, defina um valor para cada, e exiba qual é o menor valor entre dois
        System.out.println("Descobrindo o menor valor entre 2 variaveis");
        Double numDouble1, numDouble2;
        System.out.println("Insira um numero quebrado: ");
        numDouble1 = scan.nextDouble();
        System.out.println("Insira outro numero quebrado: ");
        numDouble2 = scan.nextDouble();
        if (numDouble1 > numDouble2) {
            System.out.println(numDouble2 + " e o menor que " + numDouble1);
        } else {
            System.out.println(numDouble1 + " e o menor que " + numDouble2);
        }
        //2 - Crie três variáveis double, defina um valor para cada,  e exiba qual é o menor valor entre os três
        System.out.println("Descobrindo o menor valor entre 3 variaveis");
        System.out.println("Insira outro numero quebrado: ");
        Double numDouble3 = scan.nextDouble();
        if (numDouble1 < numDouble2 && numDouble1 < numDouble3) {
            System.out.println(numDouble1 + " e o menor numero entre " + numDouble2 + " e " + numDouble3);
        }
        if (numDouble2 < numDouble1 && numDouble2 < numDouble3) {
            System.out.println(numDouble2 + " e o menor numero entre " + numDouble1 + " e " + numDouble3);
        }
        if (numDouble3 < numDouble1 && numDouble3 < numDouble2) {
            System.out.println(numDouble3 + " e o menor numero entre " + numDouble1 + " e " + numDouble2);
        }
    }
}
