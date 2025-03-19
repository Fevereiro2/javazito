import java.util.Scanner;

public static void main() {
    exercice1();
}
public static void exercice1() {
    int[] valores = inputs(); // Obter os valores do método inputs()
    int x = valores[0];
    int y = valores[1];
    int z = valores[2];
    if (x == y || y == z) {
        System.out.println("Os números não podem ser iguais, insira novamente os números.");
    } else {
        if (x < y && y < z) {
            System.out.println(x + " < " + y + " < " + z);
        } else if (y < x && x < z) {
            System.out.println(y + " < " + x + " < " + z);
        } else if (z < x && x < y) {
            System.out.println(z + " < " + x + " < " + y);
        } else if (x < z && z < y) {
            System.out.println(x + " < " + z + " < " + y);
        } else if (y < z && z < x) {
            System.out.println(y + " < " + z + " < " + x);
        } else if (z < y && y < x) {
            System.out.println(z + " < " + y + " < " + x);
        }
    }
}
public static int[] inputs() {
    Scanner input = new Scanner(System.in);
    System.out.println("Insira três números:");
    int x = input.nextInt();
    int y = input.nextInt();
    int z = input.nextInt();
    input.close();
    return new int[]{x, y, z}; // Retorna os valores em um array
}

