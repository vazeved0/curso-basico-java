public class Excecoes {

    /*
     * EXCEÇÕES
     * Diferentes erros podem acontecer ao executar um código java, como por exemplo
     * entrada de dados indevidas entre outros. Quando o corre o erro, o Java
     * normalmente para e gera uma mensagem do erro. Quando isso ocorre usamos o
     * termo tecnico: "Java lançara uma exceção (Jogara um erro)".
     * 
     * O que é um ERRO EM JAVA?
     * Pademos dizer que UM ERRO é algo irreparável, a aplicação vai travar ou sera
     * encerrada dastricamente.
     * 
     * Já exceções é um fluxo inesperado da nossa
     * aplicação,
     * como por exemplo: querer dividir um valor por zero , querer abrir um arrquivo
     * que não existe, abrir uma conexão ode banco com usuario e senha inválido
     * etc... Esses cénarios nnão são erros mais sim FLUXOS NAO PREVISTOS PELA
     * APLICAÇÃO
     * 
     * 
     * Principais Exceções JAVA
     * - java.lang.NullPointerException: Variavel Nula
     * - java.lang.ArithmeticException: Tentar dividir por 0
     * - java.sql.SQLEcception: Erro relacional a interação com o BD
     * - java.io.FileNotFoundException: tentar ler ou escrever arquivos não existe
     * 
     * TRATAMENDO DE EXCEÇÔES:
     * - TRY: permite que definir um bloco de código para ser testado quando a erro
     * enquanto esta sendo executado
     * - CATCH: permite definir um bloco de código a ser executado, caso ocorro um
     * erro no bloco TRY
     * - FINALLY: permite definir um bloco de codigo a ser executado e é opcional
     * 
     * exemplo tratamento de exceções em codigo
     * 
     * try{
     * // bloco de codigo conforme esperado
     * }
     * catch(Exception e){// precisamos saber qual exceção
     * //bloco de codigo captura as exceções que podem acontecer
     * // em case de um fluxo não previsto
     * }
     * 
     * 
     * 
     * veja exceções na pratica observabdo a classe SobreMin.java
     * 
     * 
     * 
     */

}
