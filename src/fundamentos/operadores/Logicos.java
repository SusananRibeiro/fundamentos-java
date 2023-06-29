package fundamentos.operadores;

public class Logicos {
    public static void main(String[] args) {

        boolean condicao1 = true;
        boolean condicao2 = 3 > 7; // false

        System.out.println(condicao1 && condicao2); // false --> AND
        System.out.println(condicao1 || condicao2); // true --> OR
        System.out.println(condicao1 ^ condicao2); // true --> XOR
        System.out.println(!condicao1); // false --> NOT
        System.out.println(!condicao2); // true --> NOT

        System.out.println(condicao1 && !condicao2); // true --> AND e NOT
        System.out.println(!!condicao1); // true --> Duplo NOT (Negação)


        // Tabela verdade E (AND)
        System.out.println("\nTabela Verdade E (AND)");
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        //System.out.println(false && true); // false --> Está dando um Dead Code, significa que o código não tem como dar true
        //System.out.println(false && false); // false --> Está dando um Dead Code, significa que o código não tem como dar true

        // Tabela verdade OU (OR)
        System.out.println("\nTabela Verdade OU (OR)");
        //System.out.println(true || true); // true --> Está dando um Dead Code, significa que o código não tem como dar false
        //System.out.println(true || false); // true --> Está dando um Dead Code, significa que o código não tem como dar false
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // Tabela verdade OU Exclusivo (XOR)
        System.out.println("\nTabela Verdade OU Exclusivo (XOR)");
        System.out.println(true ^ true); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(false ^ false); // false

        // Tabela verdade NÃO (NOT)
        System.out.println("\nTabela Verdade NAO (NOT)");
        System.out.println(!true); // false
        System.out.println(!false); // true

    }
}
