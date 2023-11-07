import org.junit.Test;

import java.sql.Time;
import java.util.Timer;

import static org.junit.Assert.assertEquals;


public class test {

    @Test
    public void t_5(){
        int[] arr = {2,1,0,-8,9};
        int m1 = Methods.sort_and_return(arr);
        int m2 = Methods.random_selection(arr);
//        int m3 = Methods.median_of_medians(arr);
        assertEquals(m1,m2);

    }

    @Test
    public void t_10(){
        int[] arr = {5,6,3,2,1,7,0,-8,8,9};
        int m1 = Methods.sort_and_return(arr);
        int m2 = Methods.random_selection(arr);
//        int m3 = Methods.median_of_medians(arr);
        assertEquals(m1,m2);

    }

    @Test
    public void t_20(){
        int[] arr = {5,6,3,2,1,7,0,-8,8,9,17,15,11,25,33,16,44,100,95,70};
        int m1 = Methods.sort_and_return(arr);
        int m2 = Methods.random_selection(arr);
//        int m3 = Methods.median_of_medians(arr);
        assertEquals(m1,m2);

    }

    @Test
    public void t_100(){
        int[] arr = RandomGenerator.generateInts(100);
        int m1 = Methods.sort_and_return(arr);
        int m2 = Methods.random_selection(arr);
//        int m3 = Methods.median_of_medians(arr);
        assertEquals(m1,m2);

    }

    @Test
    public void t_1000(){
        int[] arr = RandomGenerator.generateInts(1000);
        int m1 = Methods.sort_and_return(arr);
        int m2 = Methods.random_selection(arr);
//        int m3 = Methods.median_of_medians(arr);
        assertEquals(m1,m2);

    }

    @Test
    public void t_10000(){
        int[] arr = RandomGenerator.generateInts(10000);
        int m1 = Methods.sort_and_return(arr);
        int m2 = Methods.random_selection(arr);
//        int m3 = Methods.median_of_medians(arr);
        assertEquals(m1,m2);

    }

    @Test
    public void t_100000(){
        int[] arr = RandomGenerator.generateInts(100000);
        int m1 = Methods.sort_and_return(arr);
        int m2 = Methods.random_selection(arr);
//        int m3 = Methods.median_of_medians(arr);
        assertEquals(m1,m2);

    }

    @Test
    public void t_1000000(){
        int[] arr = RandomGenerator.generateInts(1000000);

        long before = System.currentTimeMillis();
        int m1 = Methods.sort_and_return(arr);
        long after = System.currentTimeMillis();

        long t1 = after-before;

        before = System.currentTimeMillis();
        int m2 = Methods.random_selection(arr);
        after = System.currentTimeMillis();
        long t2 = after-before;

//        int m3 = Methods.median_of_medians(arr);
        assertEquals(m1,m2);


        System.out.println("sort all time: "+ t1 );
        System.out.println("random select sort time: " + t2);

    }
}
