package fundamentos;
public class TipoString {
    public static void main(String[] args) {
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";
        System.out.println(s.concat("!!!")); // Boa tarde!!!
        System.out.println(s + "!!!"); // Boa tarde!!! --> faz uma concatenação igual o ".concat()"
        System.out.println(s.startsWith("Boa")); // true --> retorna um valor booleano
        System.out.println(s.startsWith("boa")); // false
        System.out.println(s.toLowerCase().startsWith("boa")); // true --> primeiro transformou tudo em letra minúscula, depois fez a comparação
        System.out.println(s.endsWith("tarde")); // true --> retorna um valor booleano
        System.out.println(s.toUpperCase().endsWith("TARDE")); // true
        System.out.println(s.length()); // 9 --> retorna uma valor inteiro
        System.out.println(s.equals("boa tarde")); // false --> retorna um valor booleano
        System.out.println(s.equalsIgnoreCase("boa tarde")); // true --> retorna um valor booleano

        var nome = "Susana";
        var sobrenome = "Ribeiro";
        var idade = 37;
        var salario = 2500.50;

        System.out.println("Nome: " + nome + " Sobrenome: " + sobrenome + " Idade: " + idade + " Salário:: " + salario); // Nome: Susana Sobrenome: Ribeiro Idade: 37 Salário:: 2500.5
        // outra forma de fazer a concatenação de cima
        System.out.printf("Nome: %s %s\n", nome, sobrenome); // Nome: Susana Ribeiro

        System.out.printf("A senhora %s %s tem %d anos e ganha R$ %f.\n", nome, sobrenome, idade, salario); // A senhora Susana Ribeiro tem 37 anos e ganha R$ 2500,500000.
        System.out.printf("A senhora %s %s tem %d anos e ganha R$ %.2f.\n", nome, sobrenome, idade, salario); // A senhora Susana Ribeiro tem 37 anos e ganha R$ 2500,50.

        String frase = String.format("A senhora %s %s tem %d anos e ganha R$ %.2f.", nome, sobrenome, idade, salario);
        System.out.println(frase); // A senhora Susana Ribeiro tem 37 anos e ganha R$ 2500,50.

        System.out.println("Frase qualquer".contains("qual")); // true --> retorna um valor booleano
        System.out.println("Frase qualquer".indexOf("qual")); // 6 --> a parti do 6 começa a palavra "qual", retorna um valor inteiro
        System.out.println("Frase qualquer".substring(6)); // qualquer
        System.out.println("Frase qualquer".substring(6, 8)); // qu --> o índice 8 não entra no resultado final
    }
}

