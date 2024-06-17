import dao.Conta;
import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Main {
    public static void main(String[] args) {

        Conta cc = new ContaCorrente();
        Conta poupanca = new ContaPoupanca();
        poupanca.depositar(100);
        poupanca.transferir(50, cc);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}