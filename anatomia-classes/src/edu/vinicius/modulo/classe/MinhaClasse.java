package edu.vinicius.modulo.classe;

public class MinhaClasse {

    /*
     * Uma classe é definida por atributos e metódos os atributos são variaveis de
     * diferentes tipos e valores, os metodos correspondem a funções ou sub-rotinas
     * dentro de nossas classes
     */

    public static void main(String[] args) {

        String primeiroNome = "Vinicius";
        String segundoNome = "Azevedo";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);

    }

}
