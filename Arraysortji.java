import java.util.*;
public class Arraysortji {
    public static boolean jio(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                // System.out.print("Array is sorted");
                return false;
            }
        }return true;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        boolean ji=jio(arr);
        System.out.print(ji);
    }
}
