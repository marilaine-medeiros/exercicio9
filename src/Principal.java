import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        //para ler os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // estrutura para determinar a pessoa mais nova
        String nomeMaisNovo = "";
        int idadeMaisNova = Integer.MAX_VALUE; // Variável que representa o maior valor possível que um inteiro (int)

        for (int i = 1; i <= 10; i++) {
            System.out.println("Digite o nome da pessoa " + i + ": ");
            String nome = scanner.nextLine();

            System.out.println("Digite a idade da pessoa " + i + ": ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            if (idade < idadeMaisNova) {
                idadeMaisNova = idade;
                nomeMaisNovo = nome;
            }
        }
        System.out.println("A pessoa mais nova é: " +nomeMaisNovo);
        scanner.close();

    }
}
