import java.util.Random;

public class Lobos extends Ciudadanos implements Batalla,CicloVital{
    private int vida;
    private String vulnerable;
    private static int totalLobos;
    private static int ultimoLobo;
    private static Random aleatorio;

    public Lobos(String nombre, int poblacion, int vida, String vulnerable) {
        super(nombre, poblacion);
        this.vida = vida;
        this.vulnerable = vulnerable;
    }
}
