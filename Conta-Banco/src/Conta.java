/**
 * Classe criada para simular uma conta bancaria atravez do terminal/Console
 * 
 * @author Vinicius Azevedo
 */
public class Conta {

    /**
     * O idConta doi criado para ser um contador que não se repete e sera
     * incrementado sempre que uma conta for instanciada
     */
    private static int idConta;
    private int numeroConta;
    private String titular;
    private double saldo;

    /**
     * O contrutor Conta incrementa + 1 no id conta e atribui esse id para as contas
     * novas conforme eles são criadas
     */
    Conta() {
        idConta += 1;
        numeroConta = idConta;
    }

    public void setTitular(String nome) {
        this.titular = nome;

    }

    public String getTitular() {
        return this.titular;
    }

    /**
     * Metodo criado para depositar valor na conta, esse metodo espera receber um
     * valor do tipo double e retorna um boolean apos a operação
     */
    public boolean depositar(double valor) {
        this.saldo = valor;
        return true;
    }

    /** Metodo para retornar o valor de saldo na conta */
    public double getSaldo() {
        return saldo;
    }

    /** Metodo para retornar o numero da conta do cliente */
    public int getNumeroConta() {
        return this.numeroConta;
    }

}
