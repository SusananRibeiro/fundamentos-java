package fundamentos;
public class NotacaoPonto {
    public static void main(String[] args) {
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!!");

        System.out.println(s);

        String x = "Leo".toUpperCase();
        System.out.println(x);
        System.out.println("Leo".toUpperCase());

        String y = "Bom dia X".replace("X","Su");
        System.out.println(y);
        String a = "Bom dia X"
                .replace("X","Su")
                .toUpperCase()
                .concat("!!!");
        System.out.println(a);

        // Os tipos primitivos não tem operador "."
    }
}

