package edu.vinicius.modulo.documentacao;

public class Documentacao {

    /*
     * Tags
     * representam dados relevantes referente a classes
     */

    // comentarios one line

    /*
     * comantario
     * multi
     * line
     */

    /**
     * Quando utilizamos barra + 2 estrelinha abrimos o bloco de documentação,
     * inclusive se ficar acimo de um metodo essa documentação será interpletada
     * como dele
     * 
     * @author Vinicius
     */
    public void testandoDocumentacao() {
        //
    }

    /*
     * javadoc é utilziado para gerar uma documentação visual por meio de linha de
     * comandos
     * 
     * E para utilizar precisa ser executado o comando abaixo via terminal
     * 
     * javadoc -encoding UTF-8 -docencoding ISO-8859-1 -d ../docs src/*.java
     */

}
