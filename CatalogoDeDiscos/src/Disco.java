import java.util.ArrayList;
import java.util.List;

public class Disco {
    private String titulo;
    private int anoLancamento;
    private List<Faixa> faixas;

    public String getTitulo() {
        return titulo;
    }
    public int getAnoLancamento() {
        return anoLancamento;
    }
    
    public List<Faixa> getFaixas() {
        return faixas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }
    
    public Disco(String titulo, int anoLancamento) {
        this.titulo = titulo;
        this.anoLancamento = anoLancamento;
        this.faixas = new ArrayList<>();
    }

    public Disco() {
        this.faixas = new ArrayList<>();
    }

    public void adicionarFaixa(Faixa faixa) {
        faixas.add(faixa);
    }
    
    @Override
    public String toString() {
        return "---------------------------------"
        + "\nTítulo: " + titulo
        + "\nAno de lançamento: " + anoLancamento
        + "\nFaixas: " + faixas;
    }
}
