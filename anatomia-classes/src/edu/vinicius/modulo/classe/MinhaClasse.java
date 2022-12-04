package edu.vinicius.modulo.classe;

public class MinhaClasse {

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
