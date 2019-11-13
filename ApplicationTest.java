package com.db1.AulaJava1.db1start;

import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

public class ExercicioParametrosTeste {

    //Exercícios de Inteiro (Integer)

    //verificando ex01
    @Test
    public void deveSomar17(){
        Application application = new Application();
        Integer expected = 17;
        Integer response = application.soma(14, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSomar8(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.soma(5, 3);
        Assert.assertEquals(expected, response);
    }
    //verificando ex02
    @Test
    public void deveSubtrair0(){
        Application application = new Application();
        Integer expected = 0;
        Integer response = application.subtracao(5,5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveSubtrair1(){
        Application application = new Application();
        Integer expected = 1;
        Integer response = application.subtracao(5, 4);
        Assert.assertEquals(expected, response);
    }

    //verificando ex03
    @Test
    public void deveMultiplicar8(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.multiplicacao(2, 4);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMultiplicar3(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.multiplicacao(-3, -1);
        Assert.assertEquals(expected, response);
    }

    //verificando ex04
    @Test
    public void deveDividir35(){
        Application application = new Application();
        Double expected = 3.5;
        Double response = application.divisao(7.0, 2.0);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveDividir100(){
        Application application = new Application();
        Double expected = 100.0;
        Double response = application.divisao(200.0, 2.0);
        Assert.assertEquals(expected, response);
    }

    //verificando ex05
    @Test
    public void deveRetornarepar(){
        Application application = new Application();
        String expected = "É par";
        String response = application.par(2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarnaoepar(){
        Application application = new Application();
        String expected = "Não é par";
        String response = application.par(3);
        Assert.assertEquals(expected, response);
    }

    //verificando ex06
    @Test
    public void deveMaior9(){
        Application application = new Application();
        Integer expected = 9;
        Integer response = application.maior(9,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMaior10(){
        Application application = new Application();
        Integer expected = 10;
        Integer response = application.maior(-10,10);
        Assert.assertEquals(expected, response);
    }

    //verificando ex07
    @Test
    public void deveTotaldeimpares6(){
        Application application = new Application();
        Integer expected = 6;
        Integer response = application.imparesateele(12);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveTotaldeimpares7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.imparesateele(13);
        Assert.assertEquals(expected, response);
    }

    //Exercícios de Texto (String)

    //verificando ex01

    @Test
    public void deveMaiuscTTT(){
        Application application = new Application();
        String expected = "TTT";
        String response = application.maiusc("ttt");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMaiuscAAA(){
        Application application = new Application();
        String expected = "AAA";
        String response = application.maiusc("aaa");
        Assert.assertEquals(expected, response);
    }

    //verificando ex02

    @Test
    public void deveMinuscaaa(){
        Application application = new Application();
        String expected = "aaa";
        String response = application.minusc("AAA");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveMinuscbbb(){
        Application application = new Application();
        String expected = "bbb";
        String response = application.minusc("BBB");
        Assert.assertEquals(expected, response);
    }

    //verificando ex03

    @Test
    public void deveQuantidadecaracteres7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.quantidadeletras("DB1START");
        Assert.assertEquals(expected, response);
    }

    //verificando ex04

    @Test
    public void deveQuantidadecaracteresoito(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.quantidadeletras(" DB1START ");
        Assert.assertEquals(expected, response);
    }

   //verificando ex05

   @Test
   public void retornDB1START(){
       Application application = new Application();
       String expected = "DB1START";
       String response = application.item4igualitem3(" DB1START ");
       Assert.assertEquals(expected, response);
   }

    //verificando ex06

    @Test
    public void deveRetornarThia(){
        Application application = new Application();
        String expected = "Thia";
        String response = application.nomecompleto4letras("Thiago Rodrigues Moraes");
        Assert.assertEquals(expected, response);
    }

    //verificando ex07

    @Test
    public void deveRetornargoRodriguesMoraes(){
        Application application = new Application();
        String expected = "ago Rodrigues Moraes";
        String response = application.nomecompleto4letrasprafrente("Thiago Rodrigues Moraes");
        Assert.assertEquals(expected, response);
    }

    //verificando ex08

    @Test
    public void retorn4ultimasletrasraes(){
        Application application = new Application();
        String expected = "raes";
        String response = application.nome4ultimasletras("Thiago Rodrigues Moraes");
        Assert.assertEquals(expected, response);
    }

    //verificando ex09

    @Test
    public void retornaAlunocomsobrenome(){
        Application application = new Application();
        String expected = "ALUNO Rodrigues Moraes";
        String response = application.substitueporaluno("Thiago Rodrigues Moraes");
        Assert.assertEquals(expected, response);
    }

    //verificando ex10

    @Test
    public void retornafrutasseparadas(){
        Application application = new Application();
        String[] expected = {"Banana", "maçã", "melancia"};
        String[] response = application.separafrutas("Banana, maçã, melancia");
        Assert.assertEquals(expected, response);
    }

    //verificando ex11

    @Test
    public void retornaquantdevogais(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.quantvogais("Thiago");
        Assert.assertEquals(expected, response);
    }

    //verificando ex12

    @Test
    public void retornatextoinvertido(){
        Application application = new Application();
        String expected = "ogaihT";
        String response = application.textoinvertido("Thiago");
        Assert.assertEquals(expected, response);
    }

    //Exercícios de Matemática (Double)

    //verificando ex01

    @Test
    public void retornmenor1(){
        Application application = new Application();
        Double expected = 1.0;
        Double response = application.menorentre2(1.0, 6.5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void retornmenormenos4(){
        Application application = new Application();
        Double expected = -4.0;
        Double response = application.menorentre2(-4.0, 1.7);
        Assert.assertEquals(expected, response);
    }

    //verificando ex02

    @Test
    public void retornmenorentre3menos4(){
        Application application = new Application();
        Double expected = -4.0;
        Double response = application.menorentre3(-4.0, 1.45, -2.36);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void retornmenorentre36(){
        Application application = new Application();
        Double expected = 6.0;
        Double response = application.menorentre3(6.0, 24.47, 120.56);
        Assert.assertEquals(expected, response);
    }

    //verificando ex03

    @Test
    public void retornamedia4(){
        Application application = new Application();
        Double expected = 4.5;
        Double response = application.media3num(4.5, 2.5, 6.5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void retornamedia10(){
        Application application = new Application();
        Double expected = 10.833333333333334;
        Double response = application.media3num(10.5, 11.5, 10.5);
        Assert.assertEquals(expected, response);
    }

    //verificando ex04

    @Test
    public void retornaareatriangulo5(){
        Application application = new Application();
        Double expected = 5.76;
        Double response = application.areatriangulo(4.5, 2.56);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void retornaareatriangulo17(){
        Application application = new Application();
        Double expected = 17.2002;
        Double response = application.areatriangulo(7.89, 4.36);
        Assert.assertEquals(expected, response);
    }
}
