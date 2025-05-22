public class Vampiros extends Ciudadanos implements Batalla{
    private String vulnerable;
    private static int totalVampiros;
    private static int ultimoVampiro;

    public Vampiros(String nombre, int poblacion, String vulnerable) {
        super(nombre, poblacion);
        this.vulnerable = vulnerable;
    }
}
