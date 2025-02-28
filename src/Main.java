import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        Scanner read = new Scanner(System.in); // bibioteca para pedir dados a utilizadores
        int x,y, z; //declarar variaveis

        //Usar uma library grafica
        z = Integer.parseInt(JOptionPane.showInputDialog(null,"Introduza o valor que deseja"));
        JOptionPane.showMessageDialog(null,z);


        System.out.println("Insira dois numeros"); //dar print
        x = read.nextInt(); //armazenar
        y = read.nextInt(); //armazenar
        if (x > y) //caso de decisão
            System.out.println(x + " é maior que " + y); //dar print
        else //se não
            System.out.println(x + " é igual ou menor que " + y); //dar print

        System.out.printf("%d x %d = %d\n", x, y, y); //exemplo do printf


        /*
        x = read.nexdouble(); //armazenar double
        x = read.nextInt(); //armazenar inteiro
        x = read.nextLine(); //armazenar string
        x = read.nextInt().charAt(0); //armazenar char
    */
    }

}