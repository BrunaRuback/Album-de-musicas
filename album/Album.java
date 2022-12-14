package album;

import java.util.ArrayList;

import musica.Musica;

public class Album {

    private String titulo;
    private String artista;
    private int qtdMusicas;
    private ArrayList<Musica> musicas;

    public Album(String artista, int qtdMusicas, String titulo) {
        this.artista = artista;
        this.musicas = new ArrayList<>();
        this.qtdMusicas = qtdMusicas;
        this.titulo = titulo;
    }

    public Musica buscarMusica(String nome){
        for (Musica musica : this.musicas) {
            if (nome.equals(musica.getNome())) {
                return musica;
            }
        }
        return null;
    }

    public void addMusica(String nome, String artista, int duracao){
        if(musicaExiste(nome)) return;

        Musica musica = new Musica(nome, artista, duracao);
        musicas.add(musica);
    }

    public void removeMusica(String nome){
        Musica musicaEscolhida= buscarMusica(nome);
        if (musicaEscolhida == null) return;

        musicas.remove(musicaEscolhida);
    }

    public boolean musicaExiste(String nome) {
        for (Musica musica : this.musicas) {
            if (nome.equals(musica.getNome())) {
                return true;
            }
        }
        return false;
    }

    public String nomeMusica(int posicao) {
        for (Musica musica : this.musicas) {
            if (musicas.indexOf(musica) == posicao) {
                return musica.getNome();
            }
        }
        return "Musica nao esta no album";
    }

    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Quantidade de musicas: " + qtdMusicas);
        for (Musica musica : musicas) {
            System.out.println("Nome: " + musica.getNome());
            System.out.println("Artista: " + musica.getArtista());
            System.out.println("Duracao: " + musica.getDuracao());
        }
    }

    public void alterarPosicao(String nomeMusica, int novaPosicao) {
        int posicaoAtual = this.musicas.indexOf(nomeMusica);
        
        Musica musica = buscarMusica(nomeMusica);

        if (musica == null) return;
        if (novaPosicao == posicaoAtual) return;

        Musica outraMusica = this.musicas.get(novaPosicao);

        this.musicas.set(novaPosicao, musica);
        this.musicas.set(posicaoAtual, outraMusica);
    }

}
