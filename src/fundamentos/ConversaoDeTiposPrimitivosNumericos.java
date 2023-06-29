package fundamentos;
public class ConversaoDeTiposPrimitivosNumericos {
    public static void main(String[] args) {

        double a = 1; // implícita, 1 é valor inteiro(menor) convertido para double que é com ponto flutuante(maior)
        System.out.println(a);

        float b = (float) 1.23456; // cast é fazer de forma explícita a conversão
        float b2 = 1.0F; // pode converte colocando um "F" no final, mas abaixo tem outra forma chamada "cast"
        System.out.println(b + " ou " + b2); // 1.23456

        int c = 129;
        byte d = (byte) c; // 129 não cabe em byte
        System.out.println(d); // -127 --> 128 não cabe em byte, então ele pega o próximo valor da sequência que é o -128

        double e = 1;
        int f = (int) e; // explícita(CAST) --> double é maior que int
        System.out.println(f);
    }
}
