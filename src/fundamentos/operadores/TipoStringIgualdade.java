package fundamentos.operadores;
import java.util.Scanner;
public class TipoStringIgualdade {
    public static void main(String[] args) {
        System.out.println("2" == "2"); // true

        String s1 = new String("2"); // não se declara string assim
        System.out.println("2" == s1); // false

        System.out.println("2".equals(s1)); // true

        Scanner entrada = new Scanner(System.in);
        System.out.print("Digite: "); // Digitado 2
        String s2 = entrada.next();
        System.out.println("2" == s2.trim()); // false
        System.out.println("2".equals(s2.trim())); // true --> mesmo dando espaços em branco

        entrada.close();

    }
}
