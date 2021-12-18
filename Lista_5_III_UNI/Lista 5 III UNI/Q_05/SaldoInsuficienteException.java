package Questao_05;

public class SaldoInsuficienteException extends Exception{
    public SaldoInsuficienteException(){

    }

    public SaldoInsuficienteException(String mensagem){
        super(mensagem);
    }
}
