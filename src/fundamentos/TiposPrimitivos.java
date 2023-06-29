package fundamentos;
public class TiposPrimitivos {
    public static void main(String[] args) {
        // Informações do funcionário

        // Tipos numéricos inteiros
        byte anosDeEmpresa = 23;
        short numerosDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_234_845_223L; // tem que colocar a letra "L(pode ser em minúsculo ou maiúsculo)", se não vai dar erro

        // Tipos numéricos reais(ponto flutuante)
        float salario = 11_445.44F; // tem que colocar a letra "F(pode ser em minúsculo ou maiúsculo)", se não vai dar erro
        double vandasAcumuladas = 2_991_797_103.01;

        // Tipo booleano
        boolean estaDeFerias = false;

        // Tipo caractere
        char status = 'A';

        // Usando todas as variaveis
        System.out.println(anosDeEmpresa * 365); // Dias de Empresa
        System.out.println(numerosDeVoos / 2); // Número de viagens
        System.out.println(pontosAcumulados / vandasAcumuladas); // pontos por real
        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Ferias? " + estaDeFerias);
        System.out.println("Status: " + status);

    }
}
