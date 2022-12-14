import java.util.ArrayList;
import java.util.Scanner;

import album.Album;
import musica.Musica;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Titulo do album: ");
        String titulo = sc.nextLine();

        System.out.println("Artista: ");
        String artista = sc.nextLine();

        System.out.println("Quantidade de musicas: ");
        int qtdMusicas = sc.nextInt();

        sc.nextLine();
        String musica;
        ArrayList<Musica> musicas = new ArrayList<>();
        for (int i = 0; i < qtdMusicas; i++) {
            System.out.println("Musica #: " + i);
            String nome = sc.nextLine();
        }

        Album album = new Album(artista, qtdMusicas, titulo, musicas);

        while (true) {
            System.out.println("O que deseja fazer?");
            System.out.println("1- Checar se uma musica esta no album");
            System.out.println("2- Verificar o nome de uma musica");
            System.out.println("3- Imprimir dados do album");
            System.out.println("4- Alterar a posicao de uma musica");
            System.out.println("0- Sair do programa");
            int escolha = sc.nextInt();
            sc.nextLine();

            switch (escolha) {
                case 1:
                    System.out.println("Nome da musica que deseja verificar: ");
                    String nome = sc.nextLine();

                    boolean existe = album.musicaExiste(nome);
                    System.out.println(existe);
                    break;
                case 2:
                    System.out.println("Posicao da musica que deseja verificar: ");
                    int posicao = sc.nextInt();

                    System.out.println(album.nomeMusica(posicao));
                    break;
                case 3:
                    album.imprimir();
                    break;
                case 4:
                    System.out.println("Musica que deseja alterar: ");
                    String nomeMusica = sc.nextLine();

                    System.out.println("Nova posicao da musica: ");
                    int novaPosicao = sc.nextInt();

                    album.alterarPosicao(nomeMusica, novaPosicao);
                    break;
                default:
                    return;
            }

        }

    }

}