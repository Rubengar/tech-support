import java.util.ArrayList;
import java.util.Random;
/**
 * The responder class represents a response generator object.
 * It is used to generate an automatic response to an input string.
 * 
 * @author     Michael Kölling and David J. Barnes
 * @version    0.1 (2011.07.31)
 */
public class Responder
{
    private Random random;
    
    private ArrayList<String> respuestas;
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        respuestas = new ArrayList<>();
        respuestas.add("hola");
        respuestas.add("El problena es irreparable,por favor compre otro producto");
        respuestas.add("El problena que tiene se debe a una pieza en mal estado");
        respuestas.add("Ese problema no es cosa nuestra");
        respuestas.add("El problema es por una pieza muy importante ,sentimos decirle que el problema es irreparable");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse()
    {
        int aleatorio = random.nextInt(respuestas.size());
        return respuestas.get(aleatorio);
    }
}
