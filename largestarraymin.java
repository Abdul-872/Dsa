import java.util.*;
public class largestarraymin {
    public static int lar(int arr[]){
        int min = Integer.MIN_VALUE; 
        for(int i=0;i<arr.length;i++){
            if(arr[i]>min){
                min = arr[i];
            }
        }return min;

    }
    public static void main(String[] args) {
        int arr[] = {1,0,2,3,5,6};
        int jio = lar(arr);
        System.out.print(jio);
    }
    
}
