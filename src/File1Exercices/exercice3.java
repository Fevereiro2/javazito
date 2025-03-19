public static void  exercice3 () {
    double nota = inputs();
    String aprovado = nota >= 10 ? "Parabens" : "Marque novo exame" ;
    System.out.println(aprovado);
}
public void main() {
    exercice3();
}
public static double inputs(){
    Scanner input = new Scanner(System.in);
    System.out.println("Insira o valor da nota do aluno");
    double nota = input.nextInt();
    input.close();
    return nota;
}