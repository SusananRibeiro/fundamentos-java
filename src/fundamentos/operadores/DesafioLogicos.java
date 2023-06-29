package fundamentos.operadores;

public class DesafioLogicos {

    public static void main(String[] args) {
        // Trabalho na terça (V ou F)
        // Trabalho na quinta (V ou F)

        boolean trabalhoTerca = false;
        boolean trabalhoQuinta = true;

        boolean comprouTv50 = trabalhoTerca && trabalhoQuinta;
        boolean comprouTv32 = trabalhoTerca ^ trabalhoQuinta;
        boolean comprouSorvete = trabalhoTerca || trabalhoQuinta;
        boolean maisSaudavel = !comprouSorvete; // Operador Unário


        System.out.println("Comprou TV50 \"? " + comprouTv50); //
        System.out.println("Comprou TV52 \"? " + comprouTv32); //
        System.out.println("Comprou Sorvete \"? " + comprouSorvete); //
        System.out.println("Mais saudavel \"? " + maisSaudavel); //
    }

}
