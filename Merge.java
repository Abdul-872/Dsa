import java.util.*;
public class Merge {
    public static int[] sio(int arr1[], int arr2[]){
        int len1 =arr1.length;
        int len2 =arr2.length;
        int temp[]=new int [len1 + len2];
        for(int i=0;i<len1;i++){
            temp[i]=arr1[i];
        }
        for(int i=0;i<len2;i++){
            temp[len1+ i ]=arr2[i];
        }
        return temp;
        

    }
    public static void main(String[] args) {
        int arr1[]={1,2,3};
        int arr2[]={4,5,6};
        int jio[]=sio(arr1,arr2);
        // System.out.print();
        for(int x:jio){
            System.out.print(x);
        }
    }
    
}
