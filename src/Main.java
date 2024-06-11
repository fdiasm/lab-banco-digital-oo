public class Main {
    public static void main(String[] args) throws Exception {
        Cliente cliente1 = new Cliente("Fernando");

        Banco banco = Banco.getInstance();

        Agencia agencia = new Agencia(banco);

        Conta cc = new ContaCorrente(agencia, cliente1);
        Conta poupanca = new ContaPoupanca(agencia, cliente1);

        cc.depositar(200);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
