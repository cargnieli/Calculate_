public class Calculate {

    public static void main(String[] args) {

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("menos")) {
            minus(x,y);

        } else if (args [0].equals("multiplicar")) {
            multiplicar(x,y);

        } else if (args[0].equals("dividir")) {
            dividir(x,y);

        } else {
            System.out.println("Nenhuma informacao definida...");
        }

    }

    static void sum(int x, int y) {
        System.out.println(x+y);
    }

    static void minus(int x, int y) {
        System.out.println(x-y);
    }
    static void multiplicar(int x, int y) {
        System.out.println(x*y);
    }
    static void dividir(int x, int y) {
        System.out.println(x/y);
    }
}
