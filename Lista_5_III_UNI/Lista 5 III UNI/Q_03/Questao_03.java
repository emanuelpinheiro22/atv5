package Questao_03;
import java.io.;
import java.util.Scanner;

public class Q_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira o local do arquivo a ser criado: ");
        File arquivo = new File(scan.nextLine());
        try {
            arquivo.createNewFile();
        } catch (IOException e) {
            System.out.println("Caminho Inválido");
        }
        scan.close();
    }
}
