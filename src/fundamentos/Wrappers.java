package fundamentos;
public class Wrappers {
    public static void main(String[] args) {
        Byte b = 100;
        Short s = 1000;
        Integer i = Integer.parseInt("10000"); // iniciar convertendo uma String para o tipo int
        Long l = 100000L;

        System.out.println(b.byteValue()); // 100 --> mostrar o valor primitivo que está dentro da classe
        System.out.println(s.toString()); // 1000 --> transforma o valor em uma String
        System.out.println("Resultado da multiplicação: " + i * 2); // Resultado da multiplicação: 20000 --> iniciar convertendo uma String para o tipo int
        System.out.println("Resultado da divisão: " + l / 3); // Resultado da divisão: 33333

        Float f = 123.10F;
        System.out.println(f); // 123.1

        Double d = 1234.5678;
        System.out.println(d); // 1234.5678

        Boolean bo = Boolean.parseBoolean("true"); // converte uma string para um valor tipo booleano
        System.out.println(bo); // true
        System.out.println(bo.toString().toUpperCase()); // TRUE
        System.out.println(("" + bo).toUpperCase()); // TRUE --> outra forma de converte um valor para uma string

        Character c = '#';
        System.out.println(c + "..."); // #...

    }
}
