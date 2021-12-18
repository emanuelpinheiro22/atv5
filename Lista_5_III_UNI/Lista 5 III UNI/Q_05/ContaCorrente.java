package Questao_05;

import java.util.Scanner;

public class ContaCorrente {
    Scanner scan = new Scanner(System.in);
    private int conta;
    private Double saldo;
    private Double valor;

    public int getConta() {
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public Double getSaldo() {
        return saldo;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getValor() {
        return valor;
    }
    public void setValor(Double valor) {
        this.valor = valor;
    }
    public void sacar() throws SaldoInsuficienteException{
        try {
            System.out.println("Insire o valor para saque: ");
            this.setValor(scan.nextDouble());
            if (this.valor <= getSaldo()) {
                this.saldo = getSaldo() - this.valor;
                System.out.println("Saldo atual: " + this.getSaldo() + "\n");
            }else{
                throw new SaldoInsuficienteException("Não é possível sacar, saldo menor que o valor solicitado para o saque.");
            }
        } catch (Exception e) {
            System.out.println("Não é possível sacar, saldo menor que o valor solicitado para saque.");
        }
    }

    public void criarConta(){
        System.out.println("Insire o número da conta: ");
        this.setConta(scan.nextInt());
        System.out.println("Insire o saldo inicial da conta: ");
        this.setSaldo(scan.nextDouble());
        System.out.println("\nConta criada com sucesso!\n");
    }
}
