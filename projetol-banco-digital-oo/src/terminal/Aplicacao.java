package terminal;
import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Aplicacao {

	public static void main(String[] args) {
		Cliente vinicius = new Cliente();
		Cliente azevedo = new Cliente();
		
		// Criando Clientes
		vinicius.setNome("Vinicius");
		azevedo.setNome("Azevedo");
		
		// Criando Contas
		Conta cc = new ContaCorrente(vinicius,500);
		Conta cp = new ContaPoupanca(azevedo);

		// movimentando 
		cc.depositar(100);
		cc.transferir(600, cp);
		
		
		// Impimindo 
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}
