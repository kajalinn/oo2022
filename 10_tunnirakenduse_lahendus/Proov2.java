import java.security.Key;
import java.util.*;
public class Proov2{
    public static void main(String[] args) {
        Map<Integer, String> valvajad = new HashMap<>();
        valvajad.put(1, "Juku");
        valvajad.put(2, "Kati");
        valvajad.put(3, "Mati");
        System.out.println(valvajad);
        Map<String, Integer> opilased = new HashMap<>();
        opilased.put("Nikita", 5);
        opilased.put("Dmitri", 4);
        opilased.put("German", 2);
        opilased.put("Andres", 5);
        for ( String key : opilased.keySet() ) {
            System.out.println( key );
        }
    }
}