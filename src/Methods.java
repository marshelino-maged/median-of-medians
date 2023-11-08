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

        if(start==end){
            return arr[start];
        }
        int random_number= ThreadLocalRandom.current().nextInt(start, end);
        int random_number_index = random_sort(arr,start,end, random_number);
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
    private static int random_sort(int[] arr, int start, int end, int x){
        int i = start;
        int j = end-1;

        while(i<j){
            boolean b1 = false;
            boolean b2 = false;
            if(arr[i]>arr[x]){
                b1 = true;
            }
            else{
                i++;
            }
            if(arr[j]<arr[x]){
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
        if((arr[i]<arr[x] && i>x) || (arr[i]>arr[x] && i<x)){
            int temp = arr[i];
            arr[i] = arr[x];
            arr[x] = temp;
            return i;
        }
        return x;
    }

    public static int median_of_medians(int[] arr){
        int median = (arr.length-1)/2;
        return select(arr, 0, arr.length-1, median+1);

    }
    private static int select(int[] A, int p, int r, int i){
        while(((r - p + 1) % 5) != 0){
            for(int j=p+1; j<=r; j++){
                if(A[p] > A[j]){
                    int temp = A[p];
                    A[p] = A[j];
                    A[j] = temp;
                }
            }
            if(i==1){
                return A[p];
            }
            else{
                p = p + 1;
                i = i - 1;
            }
        }

        int g = (r-p+1)/5;

        for(int j=p; j<=(p+g-1); j++){
            for(int k=0; k<4; k++){
                for(int l=0; l<4; l++){
                    if(A[j+(l*g)]>A[j+((l+1)*g)]){
                        int temp = A[j+(l*g)];
                        A[j+(l*g)] = A[j+((l+1)*g)];
                        A[j+((l+1)*g)] = temp;
                    }
                }
            }
        }

        int x = select(A, p+(2*g), p+(3*g)-1 , (int) Math.ceil(g/2.0));
        for(int ii=(p+(2*g)); ii<=(p+(3*g)-1); ii++){
            if(A[ii]==x){
                x = ii;
                break;
            }
        }
        int q = random_sort(A, p, r+1, x);

        int k = q - p + 1;
        if(k==i){
            return A[q];
        }
        else if(i<k){
            return select(A,p,q-1,i);
        }
        else{
            return select(A, q+1, r, i-k);
        }
    }


}
