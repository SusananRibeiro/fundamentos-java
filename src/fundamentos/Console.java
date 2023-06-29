package fundamentos;
import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        System.out.print("Bom");
        System.out.print(" dia!\n\n"); // imprime na mesma linha
        System.out.println("Bom"); // imprime na mesma linha e cria uma próxima linha
        System.out.println("dia!");

        System.out.printf("Megasena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6); // Megasena: 1 2 3 4 5 6 --> print formatado
        System.out.printf("Salário: %.1f%n", 1234.5678); // Salário: 1234,6 (segue a regra do arredonda)
        System.out.printf("Nome: %s%n", "João"); // Nome: João

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite seu nome: "); // só "print" faz digita do lado da mensagem.
        String nome = entrada.nextLine(); // armazenar o que foi digitado pelo usuário

        System.out.print("Digite seu sobrenome: ");
        String sobrenome = entrada.nextLine(); // armazenar o que foi digitado pelo usuário

        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt(); // armazenar o que foi digitado pelo usuário

        System.out.println("\nNome = " + nome + " " + sobrenome + " sua idade é " + idade + " anos."); // Nome = Susana Ribeiro sua idade é 37 anos.

        System.out.printf("%s %s tem %d anos.%n", nome, sobrenome, idade); // Susana Ribeiro tem 37 anos.

        entrada.close(); // tem que encerrar o scanner
    }
}
