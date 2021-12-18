package Questao_01;
import java.util.Scanner;

public class Questao_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int num;

        System.out.print("Insira um nome: ");
        nome = scan.nextLine();
        System.out.print("Insira um número: ");
        try {
            num = scan.nextInt();
            System.out.println(" Posição da letra " + num + " é: " + nome.charAt(num));    
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("A Posição que foi inserida está Inválida");
        }
        
        scan.close();
    }
}
