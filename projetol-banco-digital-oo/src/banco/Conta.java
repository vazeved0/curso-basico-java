package banco;


public abstract class Conta extends Banco  {
	
	private static final int AGENCIA_PADRAO = 110;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	/** Limite expecial utilziado pela classe ContaCorrente */
	protected double especial;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}
	public void sacar(double valor) {
		
		if (verificaSaldo(valor)) {
			saldo -= valor;
		 }else {
			 System.out.println("SAQUE NÃO REALIZADA, SALDO INSUFICIENTE!");
		 }
		
	}


	public void depositar(double valor) {
			saldo += valor;
	}


	public void transferir(double valor, Conta contaDestino) {
		if (verificaSaldo(valor)) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		}else {
			System.out.println("TRASFERENCIA NÃO REALIZADA, SALDO INSUFICIENTE!");
		}
	}
	
	/** Metodo criado para verificar se existe saldo para movimentação.*/
	protected boolean verificaSaldo(double valor) {
		if ((valor) <= saldo+especial) 
			return true;
		else
			return false;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}


	public abstract void imprimirExtrato();
}
