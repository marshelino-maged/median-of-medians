import org.junit.Test;

import java.sql.Time;
import java.util.Timer;

import static org.junit.Assert.assertEquals;


public class test {

    @Test
    public void t_5(){
        int[] arr = {2,1,0,5,9};

        int m1 = Methods.sort_and_return(arr);

        int m2 = Methods.random_selection(arr);

        int m3 = Methods.median_of_medians(arr);


        assertEquals(m1,m2);
        assertEquals(m1,m3);


    }

    @Test
    public void t_10(){
        int[] arr = {500,600,3535,200,10000,700,0,-800,800,900};

        int m1 = Methods.sort_and_return(arr);

        int m2 = Methods.random_selection(arr);

        int m3 = Methods.median_of_medians(arr);


        assertEquals(m1,m2);
        assertEquals(m1,m3);


    }

    @Test
    public void t_20(){
        int[] arr = {5,6,3,2,1,7,0,-8,8,9,17,15,11,25,33,16,44,100,95,70};

        int m1 = Methods.sort_and_return(arr);

        int m2 = Methods.random_selection(arr);

        int m3 = Methods.median_of_medians(arr);

        assertEquals(m1,m2);
        assertEquals(m1,m3);

    }

    @Test
    public void t_500000(){
        long t1 = 0;
        long t2 = 0;
        long t3 = 0;
        for(int i=0; i<10; i++){
            int[] arr = RandomGenerator.generateInts(500000);
            long before = System.currentTimeMillis();
            int m1 = Methods.sort_and_return(arr);
            long after = System.currentTimeMillis();

            t1 += (after-before);

            before = System.currentTimeMillis();
            int m2 = Methods.random_selection(arr);
            after = System.currentTimeMillis();
            t2 += (after-before);

            before = System.currentTimeMillis();
            int m3 = Methods.median_of_medians(arr);
            after = System.currentTimeMillis();
            t3 += (after-before);

            assertEquals(m1,m2);
            assertEquals(m1,m3);
        }



        System.out.println("Naive time: "+ t1/10 );
        System.out.println("random select sort time: " + t2/10);
        System.out.println("median of medians time: " + t3/10);

    }

    @Test
    public void t_50000000(){
        long t1 = 0;
        long t2 = 0;
        long t3 = 0;
        for(int i=0; i<2; i++){
            int[] arr = RandomGenerator.generateInts(50000000);
            long before = System.currentTimeMillis();
            int m1 = Methods.sort_and_return(arr);
            long after = System.currentTimeMillis();

            t1 += (after-before);

            before = System.currentTimeMillis();
            int m2 = Methods.random_selection(arr);
            after = System.currentTimeMillis();
            t2 += (after-before);

            before = System.currentTimeMillis();
            int m3 = Methods.median_of_medians(arr);
            after = System.currentTimeMillis();
            t3 += (after-before);

            assertEquals(m1,m2);
            assertEquals(m1,m3);
        }



        System.out.println("Naive time: "+ t1/2);
        System.out.println("random select sort time: " + t2/2);
        System.out.println("median of medians time: " + t3/2);

    }

    @Test
    public void t_10000(){
        long t1 = 0;
        long t2 = 0;
        long t3 = 0;
        for(int i=0; i<10; i++){
            int[] arr = RandomGenerator.generateInts(10000);
            long before = System.currentTimeMillis();
            int m1 = Methods.sort_and_return(arr);
            long after = System.currentTimeMillis();

            t1 += (after-before);

            before = System.currentTimeMillis();
            int m2 = Methods.random_selection(arr);
            after = System.currentTimeMillis();
            t2 += (after-before);

            before = System.currentTimeMillis();
            int m3 = Methods.median_of_medians(arr);
            after = System.currentTimeMillis();
            t3 += (after-before);

            assertEquals(m1,m2);
            assertEquals(m1,m3);
        }



        System.out.println("Naive time: "+ t1/10 );
        System.out.println("random select sort time: " + t2/10);
        System.out.println("median of medians time: " + t3/10);

    }

    @Test
    public void t_100000(){
        long t1 = 0;
        long t2 = 0;
        long t3 = 0;
        for(int i=0; i<10; i++){
            int[] arr = RandomGenerator.generateInts(100000);
            long before = System.currentTimeMillis();
            int m1 = Methods.sort_and_return(arr);
            long after = System.currentTimeMillis();

            t1 += (after-before);

            before = System.currentTimeMillis();
            int m2 = Methods.random_selection(arr);
            after = System.currentTimeMillis();
            t2 += (after-before);

            before = System.currentTimeMillis();
            int m3 = Methods.median_of_medians(arr);
            after = System.currentTimeMillis();
            t3 += (after-before);

            assertEquals(m1,m2);
            assertEquals(m1,m3);
        }



        System.out.println("Naive time: "+ t1/10 );
        System.out.println("random select sort time: " + t2/10);
        System.out.println("median of medians time: " + t3/10);

    }

    @Test
    public void t_1000000(){
        long t1 = 0;
        long t2 = 0;
        long t3 = 0;
        for(int i=0; i<10; i++){
            int[] arr = RandomGenerator.generateInts(1000000);
            long before = System.currentTimeMillis();
            int m1 = Methods.sort_and_return(arr);
            long after = System.currentTimeMillis();

            t1 += (after-before);

            before = System.currentTimeMillis();
            int m2 = Methods.random_selection(arr);
            after = System.currentTimeMillis();
            t2 += (after-before);

            before = System.currentTimeMillis();
            int m3 = Methods.median_of_medians(arr);
            after = System.currentTimeMillis();
            t3 += (after-before);

            assertEquals(m1,m2);
            assertEquals(m1,m3);
        }



        System.out.println("Naive time: "+ t1/10 );
        System.out.println("random select sort time: " + t2/10);
        System.out.println("median of medians time: " + t3/10);

    }

    @Test
    public void t_5000000(){
        long t1 = 0;
        long t2 = 0;
        long t3 = 0;
        for(int i=0; i<10; i++){
            int[] arr = RandomGenerator.generateInts(5000000);
            long before = System.currentTimeMillis();
            int m1 = Methods.sort_and_return(arr);
            long after = System.currentTimeMillis();

            t1 += (after-before);

            before = System.currentTimeMillis();
            int m2 = Methods.random_selection(arr);
            after = System.currentTimeMillis();
            t2 += (after-before);

            before = System.currentTimeMillis();
            int m3 = Methods.median_of_medians(arr);
            after = System.currentTimeMillis();
            t3 += (after-before);

            assertEquals(m1,m2);
            assertEquals(m1,m3);
        }



        System.out.println("Naive time: "+ t1/10 );
        System.out.println("random select sort time: " + t2/10);
        System.out.println("median of medians time: " + t3/10);

    }


    @Test
    public void t_10000000(){
        long t1 = 0;
        long t2 = 0;
        long t3 = 0;
        for(int i=0; i<10; i++){
            int[] arr = RandomGenerator.generateInts(10000000);
            long before = System.currentTimeMillis();
            int m1 = Methods.sort_and_return(arr);
            long after = System.currentTimeMillis();

            t1 += (after-before);

            before = System.currentTimeMillis();
            int m2 = Methods.random_selection(arr);
            after = System.currentTimeMillis();
            t2 += (after-before);

            before = System.currentTimeMillis();
            int m3 = Methods.median_of_medians(arr);
            after = System.currentTimeMillis();
            t3 += (after-before);

            assertEquals(m1,m2);
            assertEquals(m1,m3);
        }



        System.out.println("Naive time: "+ t1/10 );
        System.out.println("random select sort time: " + t2/10);
        System.out.println("median of medians time: " + t3/10);

    }
}
