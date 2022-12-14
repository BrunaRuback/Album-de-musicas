package album;

import java.util.ArrayList;

public class Album {

    private String titulo;
    private String artista;
    private int qtdMusicas;
    private ArrayList<String> musicas;

    public Album(String artista, int qtdMusicas, String titulo, ArrayList musicas) {
        this.artista = artista;
        this.musicas = musicas;
        this.qtdMusicas = qtdMusicas;
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getQtdMusicas() {
        return qtdMusicas;
    }

    public void setQtdMusicas(int qtdMusicas) {
        this.qtdMusicas = qtdMusicas;
    }

    public ArrayList<String> getMusicas() {
        return musicas;
    }

    public void setMusicas(ArrayList<String> musicas) {
        this.musicas = musicas;
    }

    public boolean musicaExiste(String nome) {
        for (String musica : this.musicas) {
            if (nome.equals(musica)) {
                return true;
            }
        }
        return false;
    }

    public String nomeMusica(int posicao) {
        for (String musica : this.musicas) {
            if (musicas.indexOf(musica) == posicao) {
                return musica;
            }
        }
        return "Musica nao esta no album";
    }

    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Quantidade de musicas: " + qtdMusicas);
        for (String musica : musicas) {
            System.out.println("Nome da musica: " + musica);
        }
    }

    public void alterarPosicao(String musica, int novaPosicao) {
        int posicaoAtual = this.musicas.indexOf(musica);

        if (novaPosicao == posicaoAtual) {
            return;
        }

        String outraMusica = this.musicas.get(novaPosicao);

        this.musicas.set(novaPosicao, musica);
        this.musicas.set(posicaoAtual, outraMusica);
    }

}
