import java.util.HashSet;
import java.util.List;

public class Generator {
    public HashSet hashSetGenerator(){
        HashSet<Integer> intCollection = new HashSet<Integer>(List.of(5, 8, 15, 24, 40));
        return intCollection;
    }
}
