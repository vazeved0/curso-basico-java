package banco;

public class ContaCorrente extends Conta {
	

	/** Para intanciar uma conta corrente espera passar os parametro de cliente e limite  especial presente na classe Conta .*/
	public ContaCorrente(Cliente cliente, double limite) {
		super(cliente);
		super.especial = limite;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
		System.out.println(String.format("Limite expecial: %.2f", this.especial));
		System.out.println(String.format("Expecial + Saldo: %.2f", (this.especial+super.saldo)));
	}
	
}
