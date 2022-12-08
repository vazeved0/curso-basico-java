public class CondicaoTernaria {

    /*
     * CONDIÇÃO TERNARIA
     * É uma forma abreviada de fluco de dado que quando utilziada atribui
     * determinado valor a uma variavel
     * Exemplo:
     */

    public static void main(String[] args) {
        int nota = 7;

        /**
         * Criamos uma variavel do tipo String que testa se a nota é maior ou igual a 7
         * e se for atribui condições "Aprovado SENÂO testa é maior igual a 5 e menor
         * que 7? se verdadeiro atribui Recuperação se falso atribui reprovado"
         */
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);
    }
}
