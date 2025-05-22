import java.util.Random;

public class Humanos extends Ciudadanos implements Batalla,CicloVital{
    private int vida;
    private String vulnerable;
    private static int totalHumanos;
    private static int ultimoHumano;
    private static Random Aleatorio;

    public Humanos(String nombre, int poblacion, int vida, String vulnerable) {
        super(nombre, poblacion);
        this.vida = vida;
        this.vulnerable = vulnerable;
    }
}
