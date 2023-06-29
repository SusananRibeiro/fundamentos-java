package fundamentos.operadores;

public class Relacionais {

    public static void main(String[] args) {

        int a = 97;
        int b = 'a'; // referenciar a tabela unicode, não fazer na prática

        System.out.println(b); // 97 --> é o valor na base unicode
        System.out.println('\u0061'); // a --> imprimir um valor da tabela unicode
        System.out.println(a == b); // true

        System.out.println(30 != 7); // true
        System.out.println(3 > 4); // false
        System.out.println(3 >= 3); // true
        System.out.println(3 < 7); // true
        System.out.println(30 <= 7); // false


        double nota = 7.3;
        boolean bomComportamento = true;
        boolean passouPorMedia = nota >= 7;
        boolean temDesconto = bomComportamento && passouPorMedia;

        System.out.println("Tem desconto? " + temDesconto); // true
    }

}
