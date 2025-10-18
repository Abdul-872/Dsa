import java.util.*;
public class largestphase1 {
    
    public static int largenew(int arr[]){
            Arrays.sort(arr);
            return arr[arr.length-1];
        
    }
    public static void main(String[] args) {
        int arr[] ={1,3,7,0,5};
        int jio = largenew(arr);
        System.out.print(jio);
    }
}
