public abstract class Conta implements IConta {
    protected Agencia agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Agencia agencia, Cliente cliente) {
        this.agencia = agencia;
        this.numero = agencia.getNumeroNovaConta();
        this.cliente = cliente;
        this.saldo = 0.0d;
        agencia.addConta(this);
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

    public Agencia getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia.getNumero()));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
