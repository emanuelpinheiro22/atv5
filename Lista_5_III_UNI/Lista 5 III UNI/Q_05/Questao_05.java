package Q_05;

public class Q_05 {
    public static void main(String[] args) throws SaldoInsuficienteException {
        ContaCorrente c1 = new ContaCorrente();
        c1.criarConta();

        for(int i = 0; i < 10; i++){
            c1.sacar();
        }
    }
}
