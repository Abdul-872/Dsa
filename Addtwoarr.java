import java.util.*;
public class Addtwoarr {
    public static int[] mer(int arr1[],int arr2[]){
        int len=arr1.length;
        int temp[]=new int[len];
        for(int i=0;i<len;i++){
            temp[i]=arr1[i] + arr2[i];
        }return temp;


    }
    public static void main(String[] args) {
        int arr1[]={1,2,3,4,5};
        int arr2[]={6,2,3,4,6};
        int me[]=mer(arr1,arr2);
        for(int m:me){
            System.out.print(m);
        }
        
    }
    
}
