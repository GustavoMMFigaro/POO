import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<Artista> artistas = new ArrayList<>();
        int escolha;
        do {
            System.out.println("-----------------------------------" );
            System.out.println("0 - fechar programa \n1 - Adicionar artista \n2 - Adicionar disco \n3 - Editar disco \n4 - Editar artista \n5 - Excluir disco \n6 - Excluir artista: ");
            escolha = sc.nextInt();
            switch (escolha) {
            case 0:
                System.out.println("Fechando o programa...");
                break;

            case 1:
                System.out.println("Digite o nome do artista: ");
                String nome = sc.next();
                System.out.println("Digite o gênero musical: ");
                String generoMusical = sc.next();
                Artista artista = new Artista(nome, generoMusical);
                artistas.add(artista);
                System.out.println(artista);
                break;

            case 2:
            System.out.println("Digite o índice do artista para adicionar um disco: ");
            int artistaIndexAdicionarDisco = sc.nextInt();
            sc.nextLine();
        
            if (artistaIndexAdicionarDisco >= 0 && artistaIndexAdicionarDisco < artistas.size()) {
                Artista artistaAdicionarDisco = artistas.get(artistaIndexAdicionarDisco);
        
                System.out.println("Digite o título do disco: ");
                String tituloDisco = sc.nextLine();
                System.out.println("Digite o ano de lançamento do disco: ");
                int anoLancamentoDisco = sc.nextInt();
                sc.nextLine();
        
                System.out.println("Informe as faixas do disco:");
                List<Faixa> faixas = new ArrayList<>();
                String addMoreFaixas = "s";
                
                while (addMoreFaixas.equalsIgnoreCase("s")) {
                    System.out.println("Digite o nome da faixa: ");
                    String nomeFaixa = sc.nextLine();
                    faixas.add(new Faixa(nomeFaixa));
                    
                    System.out.println("Deseja adicionar mais faixas? (s/n)");
                    addMoreFaixas = sc.nextLine();
                }
        
                Disco novoDisco = new Disco(tituloDisco, anoLancamentoDisco);
                artistaAdicionarDisco.adicionarDisco(novoDisco);
                System.out.println("Disco adicionado com sucesso!");
            } else {
                System.out.println("Índice de artista inválido.");
            }
            break;

            case 3:
                System.out.println("Digite o índice do artista para editar: ");
                int artistaIndexEditar = sc.nextInt();
                sc.nextLine();

                if (artistaIndexEditar >= 0 && artistaIndexEditar < artistas.size()) {
                    Artista artistaEditar = artistas.get(artistaIndexEditar);

                    System.out.println("Escolha o índice do disco para editar: ");
                    int discoIndexEditar = sc.nextInt();
                    sc.nextLine();

                    if (discoIndexEditar >= 0 && discoIndexEditar < artistaEditar.getDiscos().size()) {
                        Disco discoEditar = artistaEditar.getDiscos().get(discoIndexEditar);
            
                        System.out.println("Digite o novo título do disco: ");
                        String novoTitulo = sc.next();
                        System.out.println("Digite o novo ano de lançamento do disco: ");
                        int novoAno = sc.nextInt();
            
                        discoEditar.setTitulo(novoTitulo); 
                        discoEditar.setAnoLancamento(novoAno);  
                    
                        System.out.println("Disco atualizado com sucesso!");
                        System.out.println("Novo título: " + novoTitulo);
                        System.out.println("Novo ano de lançamento: " + novoAno);

                    } else {
                        System.out.println("Índice de disco inválido.");
                    }    
                } else {
                    System.out.println("Índice de artista inválido.");
                }
                break;

            case 4:
                System.out.println("Digite o índice do artista para editar: ");
                int indiceEditar = sc.nextInt();
                if (indiceEditar >= 0 && indiceEditar < artistas.size()) {
                    Artista artistaEditar = artistas.get(indiceEditar);
                    System.out.println("Digite o novo nome do artista: ");
                    String novoNome = sc.next();
                    System.out.println("Digite o novo gênero musical: ");
                    String novoGenero = sc.next();
                    artistaEditar = new Artista(novoNome, novoGenero);
                    artistas.set(indiceEditar, artistaEditar);
                    System.out.println("Artista editado com sucesso: \n" + artistaEditar);
                } else {
                    System.out.println("Índice inválido.");
                }
                break;

            case 5:
                System.out.println("Digite o índice do artista: ");
                int artistaIndexExcluirDisco = sc.nextInt();
                if (artistaIndexExcluirDisco >= 0 && artistaIndexExcluirDisco < artistas.size()) {
                    Artista artistaExcluirDisco = artistas.get(artistaIndexExcluirDisco);

                    System.out.println("Escolha o índice do disco para excluir: ");
                    int discoIndexExcluir = sc.nextInt();
                    sc.nextLine();
                    
                    if (discoIndexExcluir >= 0 && discoIndexExcluir < artistaExcluirDisco.getDiscos().size()) {
                        artistaExcluirDisco.removerDisco(discoIndexExcluir);
                        System.out.println("Disco excluído com sucesso.");
                    } else {
                        System.out.println("Índice de disco inválido.");
                    }
                } else {
                System.out.println("Índice de artista inválido.");
                }
                break;

            case 6:
                System.out.println("Digite o índice do artista para excluir: ");
                int indexExcluir = sc.nextInt();
                 if (indexExcluir >= 0 && indexExcluir < artistas.size()) {
                    artistas.remove(indexExcluir);
                    System.out.println("Artista excluído com sucesso.");
                } else {
                    System.out.println("Índice inválido.");
                }
                break;
            }
        } while (escolha != 0); 
    }
}
