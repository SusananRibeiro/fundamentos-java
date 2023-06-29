package fundamentos.operadores;

public class Atribuicao {

    public static void main(String[] args) {

        int a = 3;
        int b = a;
        int c = a + b;

        c += b; // OU "c = c + b;"
        c -= a; // OU "c = c - a;"
        c *= b; // OU "c = c * b;"
        c /= a; // OU "c = c / a;"
        System.out.println(c); // 6

        c %= 2; // OU "c = c % 2;" --> vai trazer um resultado informando se o número é par (0) ou impar (1),
        System.out.println(c); // 0 --> significa que o resultado é par, esse é o resultado da expressão "c %= 2;"

    }

}
