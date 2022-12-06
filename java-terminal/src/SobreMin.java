import java.util.Locale;
import java.util.Scanner;

public class SobreMin {

    public static void main(String[] args) {
        // criando o objeto do tipo scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobreNome = scanner.next();

        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = scanner.nextDouble();

        // Apresentando os dados inseridos
        System.out.println("Meu nome é: " + nome + " " + sobreNome);
        System.out.println("Tenho: " + idade + " anos");
        System.out.println("Minha altura é: " + altura + "cm");
    }
}
