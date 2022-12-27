package dispositivo.iphone;

import dispositivo.ipod.Ipod;
import dispositivo.navegador.Navegador;
import dispositivo.telefone.Telefone;

public class Iphone implements Ipod, Navegador,Telefone  {
	
	public Iphone(){
		System.out.println("Iphone Ligado");
	}

	@Override
	public void ligarContato() {
		System.out.println("Ligando Para Contato...");
		
	}

	@Override
	public void atenderChamada() {
		System.out.println("Chamada Atendida");
		
	}

	@Override
	public void correioVoz() {
		System.out.println("Ver correio voz...");
		
	}

	@Override
	public void ligacaoEspera() {
		System.out.println("Ligação colocada em espera...");
		
	}

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

	@Override
	public void tocar() {
		System.out.println("Reproduzindo musica...");
		
	}

	@Override
	public void pausar() {
		System.out.println("Pausando Musica...");
		
	}

	@Override
	public void selecionar() {
		System.out.println("Selecioanndo midia...");
		
	}

	@Override
	public void repetir() {
		System.out.println("Repetir midia...");
		
	}

	@Override
	public void passar() {
		System.out.println("Proxima midia...");
		
	}

	@Override
	public void voltar() {
		System.out.println("Midia anterior...");
		
	}

	@Override
	public void volumeMais() {
		System.out.println("Aumentar volume...");
		
	}

	@Override
	public void volumeMenos() {
		System.out.println("Diminuir volume...");
		
	}

	@Override
	public void mutar() {
		System.out.println("Silenciar midia...");
		
	}
	
	

}
