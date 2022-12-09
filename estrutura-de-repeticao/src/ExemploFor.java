public class ExemploFor {

    public static void main(String[] args) {

        String alunos[] = { "VINICIUS", "MARCOS", "JOÃO", "TEREZA" };

        for (int aluno = 0; aluno < alunos.length; aluno++) {

            System.out.println("Nome Aluno: " + alunos[aluno]);
        }

        // Utilizando o foreach para aparesentar os alunos
        for (String aluno : alunos) {
            System.out.println("Nome Aluno2: " + aluno);

        }

    }
}
