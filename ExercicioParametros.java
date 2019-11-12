package com.db1.AulaJava1.db1start;

import java.util.Scanner;

public class ExercicioParametros {
    public static Integer soma(Integer num1, Integer num2){
        Integer resultado;
        resultado = num1 + num2;
        return resultado;
    }

    public static Integer subtracao(Integer num1, Integer num2){
        Integer resultado;
        resultado = num1 - num2;
        return resultado;
    }

    public static String maiusc(String texto){
        return texto.toUpperCase();
    }

    public static String minusc(String texto){
        return texto.toLowerCase();
    }

    public static Double menorentre2(Double num1, Double num2){
        if (num1 > num2) {
            return num2;
        }
        else {
            return num1;
        }
    }

    public static Double menorentre3(Double num1, Double num2, Double num3) {
        if (num1 < num2 && num1 < num3) {
            return num1;
        }
        if (num2 < num1 && num2 < num3) {
            return num2;
        }
        else{
            return num3;
        }
    }


    public static void main(String[] args) {
        //Exercício de Inteiro (Integer)
        //1 - some dois números
        System.out.println("Somando dois numeros");
        Integer numInt1, numInt2, resul;
        String frase;
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        numInt1 = scan.nextInt();
        System.out.println("Insira o segundo numero: ");
        numInt2 = scan.nextInt();
        resul = soma(numInt1, numInt2);
        System.out.println("A soma e igual a " + resul);
        //2 - subtraia dois números
        System.out.println("Subtraindo os 2 numeros");
        resul = subtracao(numInt1, numInt2);
        System.out.println("A subtracao dos dois numeros e igual a " + resul);
        //Exercícios de Texto (String)
        //1 - Crie uma variável que recebe um texto com letras minusculas e imprima com LETRAS MAIUSCULAS
        System.out.println("Transformando todas as letras de uma string para maiusculas ");
        String text;
        text = scan.next();
        frase = maiusc(text);
        System.out.println(frase);
        //2 - Crie uma variável que receba um texto e devolva ele em LETRAS MINUSCULAS
        System.out.println("Transformando todas as letras de uma string para minusculas");
        text = scan.next();
        frase = minusc(text);
        System.out.println(frase);
        //Exercício de Matematica (Double)
        //1 - Crie duas variáveis double, defina um valor para cada, e exiba qual é o menor valor entre dois
        System.out.println("Descobrindo o menor valor entre 2 variaveis");
        Double numDouble1, numDouble2;
        System.out.println("Insira um numero quebrado: ");
        numDouble1 = scan.nextDouble();
        System.out.println("Insira outro numero quebrado: ");
        numDouble2 = scan.nextDouble();
        System.out.println(menorentre2(numDouble1, numDouble2) + " e o menor numero");
        //2 - Crie três variáveis double, defina um valor para cada,  e exiba qual é o menor valor entre os três
        System.out.println("Descobrindo o menor valor entre 3 variaveis");
        System.out.println("Insira outro numero quebrado: ");
        Double numDouble3 = scan.nextDouble();
        System.out.println(menorentre3(numDouble1, numDouble2, numDouble3) + " e o menor numero entre os 3");
    }
}

