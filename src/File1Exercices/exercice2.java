public static void main(){
    exercice2();
}

public static void exercice2 (){
    double[] valores = inputs();
    double a = valores[0];
    double b = valores[1];
    double c = valores[2];
    double descriminante, equacaopos, equacaoneg;
    descriminante = (b*b) - 4*a*c;
    if (descriminante >= 0){
        equacaopos = (-b + Math.sqrt(descriminante))/(2*a);
        equacaoneg = (-b - Math.sqrt(descriminante))/(2*a);
        System.out.printf("Os dois valores possíveis são %.2f e %.2f%n", equacaoneg, equacaopos);
    }
    else{
        System.out.println("As raizes são imaginarias");
    }
}

public static double[] inputs(){
    Scanner input = new Scanner(System.in);
    System.out.println("Insira valores para o a,b,c");
    double a = input.nextInt();
    double b = input.nextInt();
    double c = input.nextInt();
    input.close();
    return new double[]{a,b,c};
}
