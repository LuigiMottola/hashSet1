import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Generator generator1 = new Generator();

        //creating the hashset
        Set<Integer> intHashSet = generator1.hashSetGenerator();

        //reading the hash set with a for loop
        for (Integer i : intHashSet) {
            System.out.println(i);
        }

        //printing the length of the hash set
        System.out.println("HashSet length: " + intHashSet.size());
    }
}
