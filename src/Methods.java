import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

public class Methods{

    public static int sort_and_return(int[] arr){
        Arrays.sort(arr);
        int n = arr.length;
        return arr[(n-1)/2];
    }

    public static int random_selection(int[] arr){
        int i_median = (arr.length-1)/2;
        return random_sort_median(arr, 0, arr.length, i_median);
    }
    private static int random_sort_median(int[] arr, int start, int end, int i_median){
        printArr(arr);
        System.out.println(start + ", " + end + ", " + i_median);
        //random sort one element and return his index
        if(start==end){
            return arr[start];
        }
        int random_number_index = random_sort(arr,start,end);
        if(random_number_index == i_median){
            return arr[random_number_index];
        }

        else if(random_number_index<i_median){
            return random_sort_median(arr, random_number_index+1, end, i_median);
        }
        else{
            return random_sort_median(arr, start, random_number_index, i_median);
        }
    }

    private static void printArr(int[] arr){
        for (int j : arr) {
            System.out.print(j + " ");
        }
        System.out.println();
        return;
    }
    private static int random_sort(int[] arr, int start, int end){
        int random_number_index = ThreadLocalRandom.current().nextInt(start, end);
        int i = start;
        int j = end-1;

        while(i<j){
            boolean b1 = false;
            boolean b2 = false;
            if(arr[i]>arr[random_number_index]){
                b1 = true;
            }
            else{
                i++;
            }
            if(arr[j]<arr[random_number_index]){
                b2 = true;
            }
            else{
                j--;
            }
            if(b1 && b2){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

        }
        if((arr[i]<arr[random_number_index] && i>random_number_index) || (arr[i]>arr[random_number_index] && i<random_number_index)){
            int temp = arr[i];
            arr[i] = arr[random_number_index];
            arr[random_number_index] = temp;
            return i;
        }
        return random_number_index;
    }

    public static int median_of_medians(int[] arr){
        return arr[0];
    }


}
