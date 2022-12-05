package edu.vinicius.modulo.escopo;

public class Escopo {
    /*
     * Escopo pode ser entendido como o ambiente onde uma variável pode ser
     * acessada. o escopo de variáveis vai de acordo o bloco onde ela foi declarada.
     * 
     * A variavel é criada no primeiro acesso á ela, se tornando inacessivel apos o
     * interpretador sair do bloco de execução ao qual a variavel pertence, portanto
     * uma variavel declarada dentro de um metodo pertence apenas aquele metodo e
     * não existe fora dele.
     *
     * Normalmente em uma classe declaramos as variaveis no corpo principal para que
     * sejam acessiveis por todos os metodos.
     * 
     * Exemplo
     */

    public double CalculoDividaExponencial(double valor) {
        double valorParcela = valor;
        double valorMontante = 0.0; // Inicializa a variavel acumuladora com 0;

        for (int x = 1; x <= 5; x++) {
            // escopo do for, todas as variaveis x e valorCalculado so existe nesse bloco
            double valorCalculado = valorParcela * x;
            valorMontante = valorMontante + valorCalculado;
        }

        // vai retornar o valor da variavel global
        return valorMontante;
    }

    public static void main(String[] args) {
        // criou um objeto do tipo escopo chamado divida
        Escopo divida = new Escopo();
        // imprimiou o retorno do metodo calculoDivida.
        System.out.println(divida.CalculoDividaExponencial(100.00));

    }

}
