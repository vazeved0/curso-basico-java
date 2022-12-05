package edu.vinicius.modulo.operadores;

import javax.swing.event.SwingPropertyChangeSupport;

public class Operadores {

    public static void main(String[] args) {

        // Operador de atribuição é rempresentado por "=" que é utilziado para
        // atribuir determonado valor em uma varizavel

        // Operadores aritimetico são utilziados para fazer operações matematicas
        // EX: (+) para adição, (-) subtrair, (*) para multiplicar, e (/) para dividir
        // O operador de acição (+) quando utilziado em variaveis do tipo texto faz a
        // junção das palavras.
        // Ex:
        String nomeCompleto = "Vinicius " + "Azevedo";

        System.out.println(nomeCompleto);

        String concatenacao;

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        /*
         * Operadores Unários são operadores utilizados com outros operadores
         * aritimeticos. eles realizam alguns trabalhos basicos como incrementar,
         * decrimentar, inverter valores e boleanos. EX:(+),(-)
         */
        int numero = 5;
        // au utilziar o operador unario negativo nos negativamos uma variavel do tipo
        // inteiro ao imprimir
        System.out.println(-numero);

        // Aqrui de fato estamos atribuindo o numero negativado na variavel
        numero = -numero;
        System.out.println(numero);

        // aqui estamos transformando um numero negativo em positivo
        numero = numero * -1;
        System.out.println(numero);

        // Incrementando mais dois com o operador de adição
        numero = numero + 2;
        System.out.println(numero);

        // Incrementando mais um com o operador Unario ++
        numero = numero++;
        System.out.println(numero);

        // A decrementação utiliza-se as mesmas regras da incrementação mais como o
        // operdor (--)
        numero = numero--;
        System.out.println(numero);

        // Existe ainda o operador (!) que é utilizado para negação em java Ex:
        boolean imprimimir = false;

        System.out.println(!imprimimir);

        // Para atribuir a negação podemos fazer assim
        imprimimir = !imprimimir;

        System.out.println(imprimimir);

        /*
         * Operador ternario é uma forma resumida para definir uma condição ternaria
         * como se fosse if else mais tudo em uma linha só
         * Por exemplo: vamos utilizar uma estrutura IF/ELSE para depois mostrar como
         * ficaria em ternario
         * 
         * String resultado = "";
         * int a = 0;
         * int b = 1;
         * 
         * 
         * if (a != b)
         * resultado = "Verdadeiro";
         * else
         * resultado = "Falso";
         * 
         * System.out.println(resultado); *
         */
        int a = 0;
        int b = 1;

        // utilizandoi o ternario ficaria assim:
        String resultado = a != b ? "Verdadeiro" : "Falso";

        System.out.println(resultado);

        /*
         * OPERADORES RELACIONAIS, avaliam a relação entre duas variaveis ou expressões.
         * Neste caso, mais precisamente, definem se o operando á esquerda é igual,
         * diferente, menor,menor igual, mior, maior igual ao da direita
         * (==)igual,(!=)diferente,(>)maior,(>=)maior igual,(<)menor,(<=)menor igual
         * Exemplo:
         */
        int numero1 = 0;
        int numero2 = 1;

        boolean resposta = numero1 == numero2;

        System.out.println(numero1 + " é igual " + numero2 + " ? " + resposta);

        resposta = numero1 != numero2;

        System.out.println(numero1 + " é diferente " + numero2 + " ? " + resposta);

        resposta = numero1 > numero2;

        System.out.println(numero1 + " é maior " + numero2 + " ? " + resposta);

        // operdadores relacionais são utilizados para fluxo em nossos codigos tambem:
        if (numero1 < numero2) {
            System.out.println("A nossa condição é verdadeira!");
        }

        /*
         * OPERADORES LOGICOS, representam o recurso que nos permite criar expressões
         * lógicas maiores a partir da junção de duas ou mais expressões (&&) operdaor
         * logico E,
         * (||) Operdar lógico OU
         * Exemplo
         */

        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && condicao2) {
            System.out.println("As duas condições so iguais");
        } else {
            System.out.println("As condições são diferentes");
        }

        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeira");
        } else {
            System.out.println("Nenhuma das condições é verdadeira");
        }

    }
}
