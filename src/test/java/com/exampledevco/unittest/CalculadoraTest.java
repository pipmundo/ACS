package com.exampledevco.unittest;


import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(JUnit4.class)
public class CalculadoraTest {

    //@Spy
    Calculadora calculadora;

    @Before
    public void setUp(){
        calculadora= new Calculadora();
        calculadora= Mockito.spy(calculadora);
    }

    @Test
    public void cuandoIngresa5EntoncesRetornaV(){
       // Mockito.doReturn("V").when(calculadora.construirRomano(Mockito.anyInt()));
        Mockito.when(calculadora.construirRomano(Mockito.anyInt())).thenReturn("V");
        String respuesta=calculadora.calcular(5);
        assertThat(respuesta,equalTo("V"));
    }

    @Test
    public void cuandoIngresa1EntoncesRetornaI(){
        Calculadora calculadora= new Calculadora();
        String respuesta=calculadora.calcular(1);
        assertThat(respuesta,equalTo("I"));
    }
}
