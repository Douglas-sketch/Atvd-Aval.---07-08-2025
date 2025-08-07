public class Main {
    static class Video {
        String titulo;
        int visualizacoes;

        Video(String titulo, int visualizacoes) {
            this.titulo = titulo;
            this.visualizacoes = visualizacoes;
        }
    }

    public static void main(String[] args) {
        Video[] videos = new Video[5];
        videos[0] = new Video("Java Básico", 500000);
        videos[1] = new Video("Como programar em Java", 1500000);
        videos[2] = new Video("Tutorial de Spring Boot", 2000000);
        videos[3] = new Video("Estruturas de Dados", 800000);
        videos[4] = new Video("Entrevista com Devs", 1200000);

        int somaVisualizacoes = 0;

        System.out.println("Vídeos com mais de 1 milhão de visualizações:");
        for (int i = 0; i < videos.length; i++) {
            somaVisualizacoes += videos[i].visualizacoes;

            if (videos[i].visualizacoes > 1000000) {
                System.out.println("- " + videos[i].titulo + " (" + videos[i].visualizacoes + " views)");
            }
        }

        double media = (double) somaVisualizacoes / videos.length;
        System.out.println("\nMédia de visualizações: " + media);
    }
}


// https://www.onlinegdb.com/#tab-stdin
