import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private static int SEQUENCIAL = 1;

    private int numero;
    private Banco banco;
    private boolean agenciaAtiva;
    private List<Conta> contas = new ArrayList<>();
	private int numeroNovaConta = 1;

    public Agencia(Banco banco) {
        this.numero = SEQUENCIAL;
        SEQUENCIAL++;
        this.banco = banco;
        this.agenciaAtiva = true;
        banco.addAgencia(this);
    }

    public int getNumero() {
        return numero;
    }

    public Banco getBanco() {
        return banco;
    }

    public boolean isAgenciaAtiva() {
        return agenciaAtiva;
    }

    public void addConta(Conta conta) {
        this.contas.add(conta);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public int getNumeroNovaConta() {
        int idNovaConta = numeroNovaConta;
        this.numeroNovaConta++;
        return idNovaConta;
    } 
}
