import java.util.ArrayList;
import java.util.List;

public class Artista {
    private String nomeArtista;
    private String generoMusical;
    private List<Disco> discos;

    public String getNomeArtista() {
        return nomeArtista;
    }
    public String getGeneroMusical() {
        return generoMusical;
    }

    public List<Disco> getDiscos() {
        return discos;
    }
    
    public Artista(String nomeArtista, String generoMusical) {
        this.nomeArtista = nomeArtista;
        this.generoMusical = generoMusical;
        this.discos = new ArrayList<>();
    }

    public void adicionarDisco(Disco disco) {
        discos.add(disco);
    }

    public void removerDisco(int indice) {
        if(indice >= 0 && indice < discos.size()) {
            discos.remove(indice);
        }
    }

    public void editarDisco(int indice, Disco novoDisco) {
        if(indice >= 0 && indice < discos.size()) {
            discos.set(indice, novoDisco);
        }
    }

    @Override
    public String toString() {
        return "---------------------------------"
        + "\nNome: " + nomeArtista
        + "\nGênero musical: " + generoMusical;
    }
}
