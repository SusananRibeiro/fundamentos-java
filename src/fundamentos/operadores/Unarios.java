package fundamentos.operadores;

public class Unarios {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;

        a++; // seria a = a + 1; --> incremento pós-fixada
        a--; // seria a = a - 1; --> decremento pós-fixada

        ++b; // seria b = b + 1; --> incremento pré-fixada
        --b; // seria b = b - 1; --> decremento pré-fixada

        System.out.println(a); // 1
        System.out.println(b); // 2
        System.out.println(++a == b--); // true --> dá verdadeiro por causa da precedência dos operadores
        System.out.println(a); // 2
        System.out.println(b); // 1

    }

}
