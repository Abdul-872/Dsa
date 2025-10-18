import java.util.*;
public class maxminji {
    public static int[] jio(int arr[]){
        int larger =Integer.MIN_VALUE;
    int smaller = Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]>larger){
            larger=arr[i];
        }
        if(arr[i]<smaller){
            smaller=arr[i];
        }
    }return new int[]{smaller,larger};
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,5,6,8};
        int ji[]=jio(arr);
        for(int x:ji){
            System.out.println(x);
        }
    }    
}
