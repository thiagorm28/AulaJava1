package com.db1.AulaJava1.db1start;

import org.junit.Assert;
import org.junit.Test;
import org.omg.PortableInterceptor.INACTIVE;

public class ExercicioParametrosTeste {

    //Exercícios de Inteiro (Integer)

    //verificando ex01
    @Test
    public void deveRetornar5(){
        Application application = new Application();
        Integer expected = 5;
        Integer response = application.soma(2, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar8(){
        Application application = new Application();
        Integer expected = 8;
        Integer response = application.soma(5, 3);
        Assert.assertEquals(expected, response);
    }
    //verificando ex02
    @Test
    public void deveRetornar2(){
        Application application = new Application();
        Integer expected = 2;
        Integer response = application.subtracao(5, 3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar0(){
        Application application = new Application();
        Integer expected = 0;
        Integer response = application.subtracao(5, 5);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar4(){
        Application application = new Application();
        Integer expected = 4;
        Integer response = application.multiplicacao(2, 2);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar9(){
        Application application = new Application();
        Integer expected = 9;
        Integer response = application.multiplicacao(-3, -3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarnumeroquebrado(){
        Application application = new Application();
        Double expected = 2.5;
        Double response = application.divisao(5.0, 2.0);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar10(){
        Application application = new Application();
        Double expected = 10.0;
        Double response = application.divisao(20.0, 2.0);
        Assert.assertEquals(expected, response);
    }

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

    @Test
    public void deveRetornar3(){
        Application application = new Application();
        Integer expected = 3;
        Integer response = application.maior(1,3);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar1(){
        Application application = new Application();
        Integer expected = 1;
        Integer response = application.maior(-10,1);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar6(){
        Application application = new Application();
        Integer expected = 6;
        Integer response = application.imparesateele(11);
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornar7(){
        Application application = new Application();
        Integer expected = 7;
        Integer response = application.imparesateele(13);
        Assert.assertEquals(expected, response);
    }

    //Exercícios de Texto (String)

    @Test
    public void deveRetornarTTT(){
        Application application = new Application();
        String expected = "TTT";
        String response = application.maiusc("ttt");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarAAA(){
        Application application = new Application();
        String expected = "AAA";
        String response = application.maiusc("aaa");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornaraaa(){
        Application application = new Application();
        String expected = "aaa";
        String response = application.minusc("AAA");
        Assert.assertEquals(expected, response);
    }

    @Test
    public void deveRetornarbbb(){
        Application application = new Application();
        String expected = "bbb";
        String response = application.minusc("BBB");
        Assert.assertEquals(expected, response);
    }
}
