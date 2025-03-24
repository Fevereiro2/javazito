

public static void exercice4 (){
    Scanner input = new Scanner (System.in);

    System.out.println("Digite as trÊs primieras letras da classe do produto");
    String classe = input.next().toLowerCase();

    double desconto ;

    if (classe.equals("veg")) {
        desconto = 0.15;

    }
    else if (classe.equals("lat") || classe.equals("cer") || classe.equals("agua"))
    {
        desconto = 0.10;
    }
    else {
        desconto = 0.01;
    }
    System.out.printf("O desconto para a classe %s é de  %.2f", classe, desconto );

    input.close();

}

public static void main (){
    exercice4();
}


