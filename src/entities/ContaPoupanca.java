package entities;

import dao.Conta;

public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        System.out.println("====== EXTRATO CONTA POUPANÇA ======");
        super.imprimirInformacoes();
    }
}
