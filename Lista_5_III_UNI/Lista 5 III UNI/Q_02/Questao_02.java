package Questao_02;
import java.util.ArrayList;
import java.util.Scanner;

public class Questao_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();

        for(int i = 0; i < 10; i++){
            System.out.print("Insira a idade " + (i+1) + ": ");
            num.add(scan.nextInt());
        }
        System.out.print("Insira um número: ");
        try {
            int r = scan.nextInt();
            System.out.println(num.get(r-1) + " anos será retirado da posição " + r);
            num.remove((r-1));
            System.out.println();
            System.out.println("Retirada concluída!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Posição Inválida");
        }
        
        scan.close();
    }
}
