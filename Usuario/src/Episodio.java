public class Episodio {
    private String titulo;
    private int duracao;

    public Episodio (String titulo, int duracao) {
        this.titulo = titulo;
        this.duracao = duracao;
    }

    public void Informacoes () {
        System.out.println("Título: " + this.titulo);
        System.out.println("Duração: " + this.duracao + "minutos.");
        System.out.println();

    }

    public static void main(String[] args) {
        
        Episodio ep1  = new Episodio("ep1", 30);
        Episodio ep2  = new Episodio("ep2", 25);
        Episodio ep3  = new Episodio("ep3", 27);

        ep1.Informacoes();
        ep2.Informacoes();
        ep3.Informacoes();



    }
}


