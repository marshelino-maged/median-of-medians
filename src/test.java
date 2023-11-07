import org.junit.Test;
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
}
