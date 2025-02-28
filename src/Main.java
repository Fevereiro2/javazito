import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in); // bibioteca para pedir dados a utilizadores
        int x,y; //declarar variaveis
        System.out.println("Insira dois numeros"); //dar print
        x = read.nextInt(); //armazenar
        y = read.nextInt(); //armazenar
        if (x > y) //caso de decisão
            System.out.println(x + " é maior que " + y); //dar print
        else //se não
            System.out.println(x + " é igual ou menor que " + y); //dar print

        System.out.printf("%d x %d = %d\n", x, y, y); //exemplo do printf
    }
}