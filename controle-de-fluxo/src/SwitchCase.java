public class SwitchCase {

    /*
     * SWITCH CASE
     * É uma estrutura que compara o valor de cada caso com o da variavel
     * sequencial, e quando encontra o valor correspondente, executa o codigo
     * associado.
     * 
     * BREAK é utilziado para indicar a finalização de um
     * bloco então ao se deparar com esse comando o sistema encerra a
     * execução da estrutura do case.
     * 
     * DEFAULT é utilziado no fim dos case é seu bloco é acionando quando nenhum dos
     * teste corresponde ao valor da variavel atribuida no switch.
     * 
     * Exemplo:
     * Vamos imaginar que precisamos imprimir uma tamanhos e a tomada de decisão
     * sera de acordo com a letra armazenada na variavel tamnho, conforme tabela
     * abaixo
     * 
     * P = PEQUENO
     * M = MEDIO
     * G = GRANDE
     * 
     * Oberve como ficaria no codigo abaixo e existe outro exemplo que voce pode
     * conferir na Classe PlanoOperadora.java
     */

    public static void main(String[] args) {

        String tamanho = "G";

        switch (tamanho) {
            case "P": {
                System.out.println("PEQUENO");
                break;
            }
            case "M": {
                System.out.println("MEDIO");
                break;
            }
            case "G": {
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("Tamanho não encontrado");

        }
    }

}
