package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {
	
	public static void main(String[] args) {
		System.out.println("Prcesso seletivo");
		
		String [] candidatos = {"Vinicius","Azevedo","Paulo","Antonio","Marcio"};
		for (String candidato:candidatos) {
			entrandoEmContato(candidato);
		}
		
		
		/* 
		imprimirSelecionados();
		selecaoCandidatos();
		analisarCandidato(1900.0);
		analisarCandidato(2200.0);
		analisarCandidato(2000.0);*/
	}
	
	static double salarioBase = 2000.00;
	
	
static void analisarCandidato(double salarioPretendido) {
		
		
		if (salarioBase>salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if (salarioBase==salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
	

	
	static void selecaoCandidatos() {
		String[] candidatos = {"Vinicius","Azevedo","Paulo","Antonio","Marcio","Maria","Marcia","José","Filipe","Guilherme"};
		
		int candidatosSelecionados = 0;
		int candidatosAtual=0;
		
		while (candidatosSelecionados<5 && candidatosAtual < candidatos.length){
			String candidato = candidatos[candidatosAtual];
			double salarioPretendido = valorPretendido();
			
			System.out.println("O candidato "+ candidato+" solicitou um salario no valor de "+ salarioPretendido);
			
			if(salarioBase >= salarioPretendido) {
				System.out.println("O candidato "+candidato+" foi selecionado para a vaga");
				candidatosSelecionados++;
			}
			candidatosAtual++;
		}
	}
	
	static void imprimirSelecionados() {
		String [] candidatos = {"Vinicius","Azevedo","Paulo","Antonio","Marcio"};
		
		System.out.println("Imprimindo a lista de candidatos informando o indice  do elemento");
		
		for(int indice = 0; indice<candidatos.length;indice++) {
			System.out.println("O candidato de n°  "+(indice+1)+" é o "+ candidatos[indice]);
		}
		
		System.out.println("Imprimindo a lista de forma abreveada for each");
		
		for (String candidato:candidatos) {
			System.out.println("O candidato selecionado foi " + candidato);
		}
	}
	
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuaTentando = true;
		boolean atendeu = false;
		
		do {
			
			atendeu=atender();
			continuaTentando = !atendeu;
			if(continuaTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuaTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato+ " NA "+ tentativasRealizadas+ " ° TENTATIVA" );
		
		else
			System.out.println("NÃO CONSEGUIMOS CONTAO COM "+candidato+" NUEMRO MAXIMO DE TENTATIVAS " +tentativasRealizadas);
	}
	
	
	//Metodo auxiliar gerar valor aleatorio
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800,2200);
	}
	
	//Metodo auxiliar simular atendimento de ligação
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}
	

}
