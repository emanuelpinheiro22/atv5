package Questao_04;
import java.util.Scanner;

public class Questao_04 {
    public static void main(String[] args) throws ProporcoesInvalidasException {
        Scanner scan = new Scanner(System.in);
        Triangulo t1 = new Triangulo(4.0, 5.0, 6.0);

        t1.setA(10.0);
 
        System.out.print("\nInsire o valor do lado 1: ");
        Double n1 = scan.nextDouble();
        System.out.print("\nInsire o valor do lado 2: ");
        Double n2 = scan.nextDouble();
        System.out.print("\nInsire o valor do lado 3: ");
        Double n3 = scan.nextDouble();
        System.out.println("");

        Triangulo t2 = new Triangulo(n1, n2, n3);

        scan.close();
    }
}
