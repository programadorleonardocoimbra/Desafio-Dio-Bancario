public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(1500);

        Conta poupanca = new ContaPoupanca();
        cc.transferir(500, poupanca);
        poupanca.depositar(500);
        cc.imprimirExtrato();
        poupanca.imprimirExtrato();



    }
}
