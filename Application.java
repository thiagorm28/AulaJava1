package com.db1.AulaJava1.db1start;

import org.omg.PortableInterceptor.INACTIVE;

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
        if(valorfinal % 2 == 0){
            return valorfinal/2;
        }
        return (valorfinal + 1) / 2;
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

    //3 - Método que receba DB1START e retorne a quantidade de letras que existe nesta palavra

    public Integer quantidadeletras(String texto){
        Integer quant = 0;
        for(int cont = 0; cont < texto.length(); cont++) {
            if(Character.isLetter(texto.charAt(cont))){
                quant++;
            }
        }
        return quant;
    }

    //4 - Método que receba DB1START (tendo um espaço no inicio e no fim da palavra) e retorne a quantidade de letras que existe

    public Integer quantidadeletrassemespaco(String texto){
        Integer quant = 0;
        for(int cont = 0; cont < texto.length(); cont++) {
            if(Character.isLetter(texto.charAt(cont))){
                quant++;
            }
        }
        return quant;
    }

    //5 - Método que retorne o item 4 com a mesma quantidade de letras do item 3.

    public String item4igualitem3(String texto){
        return texto.trim();
    }

    //6 - Método que receba o seu nome completo e exiba somente as 4 primeiras letras do seu nome

    public String nomecompleto4letras(String nome){
        String resul = "";
        for(int cont = 0; cont < 4; cont++){
            resul += nome.charAt(cont);
        }
        return resul;
    }

    //7 - Método que receba o seu nome completo e exiba a partir da terceira letra do seu nome

    public String nomecompleto4letrasprafrente(String nome){
        String resul = "";
        for(int cont = 3; cont < nome.length(); cont++){
            resul += nome.charAt(cont);
        }
        return resul;
    }

    //8 - Método que receba o seu nome completo e exiba somente as 4 ultimas letras do seu nome

    public String nome4ultimasletras(String nome){
        String resul = "";
        for(int cont = nome.length()-4; cont < nome.length(); cont++){
            resul += nome.charAt(cont);
        }
        return resul;
    }

    //9 - Método que receba o seu nome completo e substitua o seu primeiro nome por ALUNO/ALUNA

    public String substitueporaluno(String nome){
        Integer lugarprimeiroespaco = 0;
        String resul = "ALUNO";
        for(Integer cont = 0; cont < nome.length(); cont++){
            if(nome.charAt(cont) == ' '){
                lugarprimeiroespaco = cont;
                cont = nome.length();
            }
        }
        for(int cont = lugarprimeiroespaco; cont < nome.length(); cont++){
            resul += nome.charAt(cont);
        }
        return resul;
    }

    //10 - Método que receba o seguinte texto "banana, maçã, melancia" e exiba o texto separadamente.

    public String[] separafrutas(String frutas) {
        String[] vetorfrutas;
        vetorfrutas = frutas.split(", ");
        return vetorfrutas;
    }

    //11 - Método que receba um texto e exiba quantas vogais tem no texto

    public Integer quantvogais(String texto){
        Integer quant = 0;
        texto = texto.toLowerCase();
        for(int cont = 0; cont < texto.length(); cont++){
            if(texto.charAt(cont) == 'a' || texto.charAt(cont) == 'e' || texto.charAt(cont) == 'i' || texto.charAt(cont) == 'o' || texto.charAt(cont) == 'u'){
                quant++;
            }
        }
        return quant;
    }

    //12 - Método que receba um texto e devolva ele invertido

    public String textoinvertido(String texto){
        String resul = "";
        for(int cont = texto.length()-1; cont >=0; cont--){
            resul += texto.charAt(cont);
        }
        return resul;
    }

    //Exercícios de Matemática (Double)

    //1 - Método que exiba qual é o menor valor entre dois doubles

    public Double menorentre2(Double num1, Double num2){
        if(num1 < num2){
            return num1;
        }
        return num2;
    }

    //2 - Método que exiba qual é o menor valor entre três doubles

    public Double menorentre3(Double num1, Double num2, Double num3){
        return menorentre2(num3, menorentre2(num1, num2));
    }

    //3 - Método que exiba a média de três números

    public Double media3num(Double num1, Double num2, Double num3){
        return (num1 + num2 + num3)/3;
    }

    //4 - Método que calcule a área de um triangulo

    public Double areatriangulo(Double base, Double altura){
        return base*altura/2;
    }
}