import java.io.File;
import java.util.HashSet;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomGenerator {
    public static int[] generateInts(int n){
        HashSet<Integer> hash = HashSet.newHashSet(n);
        int[] arr = new int[n];
        int i=0;
        while(i<n){
            Integer num = ThreadLocalRandom.current().nextInt(-100000000, 100000000);
            if(!hash.contains(num)){
                hash.add(num);
                arr[i] = num;
                i++;
            }
        }
        return arr;
    }
}
