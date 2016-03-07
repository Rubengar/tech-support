import java.util.ArrayList;
import java.util.Random;
import java.util.HashMap;
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
    
    private HashMap<String,String> respuestasFijas;
    
    /**
     * Construct a Responder - nothing to do
     */
    public Responder()
    {
        random = new Random();
        respuestas = new ArrayList<>();
        respuestasFijas = new HashMap<>();;
        respuestasFijas.put("hola","Hola,cual es el problema que tiene?");
        respuestasFijas.put("pieza","El problena que tiene se debe a una pieza en mal estado");
        respuestasFijas.put("pantalla","El problema esta en los drivers de la pantalla");
        respuestasFijas.put("adaptador","Ese problema esta en el adaptador de la corriente");
        
        respuestas.add("Hola,cual es el problema que tiene?");
        respuestas.add("El problena es irreparable,por favor compre otro producto");
        respuestas.add("El problena que tiene se debe a una pieza en mal estado");
        respuestas.add("Ese problema no es cosa nuestra");
        respuestas.add("Ese problema esta en el adaptador de la corriente");
        respuestas.add("El problema esta en los drivers de la pantalla");
        respuestas.add("El problema es por una pieza muy importante ,sentimos decirle que el problema es irreparable");
    }

    /**
     * Generate a response.
     * @return   A string that should be displayed as the response
     */
    public String generateResponse(String input)
    {
        String respuesta = input;
        if (respuestasFijas.containsKey(respuesta.toLowerCase().trim()))
        {
            return respuestasFijas.get(respuesta);
        }else
        {
            int aleatorio = random.nextInt(respuestas.size());
            return respuestas.get(aleatorio);
        }
        
    }
}
