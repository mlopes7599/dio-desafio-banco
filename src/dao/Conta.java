package dao;

public abstract class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 777;
    private static int SEQUENCIAL = 1;
    private static String TITULAR_PADRAO = "Matheus Lopes";

    protected int agencia;
    protected int numeroConta;
    protected String titular;
    protected double saldo;

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        //Toda vez que instânciar uma conta, ele gera uma conta de forma sequencial
        this.numeroConta = SEQUENCIAL++;
        this.titular = TITULAR_PADRAO;
    }

    public int getAgencia() {return agencia;}

    public int getNumeroConta() {return numeroConta;}

    public String getTitular() {return titular;}

    public double getSaldo() {return saldo;}

    @Override
    public void sacar(double valor) {saldo -= valor;}

    @Override
    public void depositar(double valor) {saldo += valor;}

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    protected void imprimirInformacoes() {
        System.out.println(String.format("Titular: %s", this.titular));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Conta: %d", this.numeroConta));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }
}
