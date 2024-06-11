import java.util.ArrayList;
import java.util.List;

public class Banco {
    private static Banco banco;
    private int numero;

    private String nome;
    private List<Agencia> agencias = new ArrayList<>();

    private Banco() {
        this.numero = 1;
        this.nome = "Banco 123";
    }
        
    public static Banco getInstance() {
        if (banco == null) {
            banco = new Banco();
        }
            
        return banco;
    }

    public int getNumero() {
        return numero;
    }

    public String getNome() {
        return nome;
    }

    public void addAgencia(Agencia agencia) {
        this.agencias.add(agencia);
    }

    public List<Agencia> getAgencias() {
        return agencias;
    }
}
