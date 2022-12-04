package edu.vinicius.modulo.variaveis;

public class TiposVariaveis {

    // Java é fortimente tipado, ou seja precisamos declarar o tipo de dado que esta
    // previsto receber.

    /*
     * Variaveis primitivas
     * Tipos Inteiros: byte,short,int,long
     * Tipo flacionado: float,double teambem temos
     * variavies primitivas do tipo bollean para verdadeiro ou falso
     * char para atribuir caracter.
     * 
     * O que é variaveis:
     * São espaço de memorias reservadas no sistema para guardar informação.
     */

    public static void main(String[] args) {
        // double é fracionado por ponto ao invez de virgula.
        double salarioMinimo = 4000.00;

        // sempre que utilizamos o float devemos finalziar o dado com F para que
        // fincione corretamente
        float salarioMinimo2 = 4000.00F;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        // Casting é utilziado para mudar o tipo de variavel em tempo de execução
        short numeroCurto2 = (short) numeroNormal;

        /*
         * VARIAVEIS CONSTRANTES
         * São identificadas com a palavra FINAL antes de seu tipo, variaveis
         * constrantes não podem mudar seu valor e é recomendado que seja escriata em
         * maiuscola
         */final double VALORPI = 3.14;

        // STRING é utilziada para armazenar textos
        String nome = "Vinicius";

        // Boolean é utilziado para retornar verdadeiro ou falso
        boolean ligado = true;

        // Char é utilzaido para caracter
        char sexo = 'M';

    }

}
