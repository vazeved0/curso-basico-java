package dispositivo.navegador;

public class Safari implements Navegador  {

	@Override
	public void exibirPagina() {
		System.out.println("Exibindo pagina navegador...");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Abrindo outra pagina naegador...");
		
	}

	@Override
	public void atualziarPagina() {
		System.out.println("Atualizando pagina Navegador...");
		
	}

	@Override
	public void pesquisar() {
		System.out.println("Pesquisando Navegador...");
		
	}

	@Override
	public void verificarConexao() {
		System.out.println("Verificando conexão internet...");
		
	}

	@Override
	public void zoom() {
		System.out.println("Zoom no navegador...");

}
	}
