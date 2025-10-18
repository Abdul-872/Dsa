import java.util.*;
public class RemoveDuplicateji {
    public static int[] jio(int arr[]){
        int temp[]=new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i] !=arr[i+1]){
                temp[j]=arr[i];
                j++;
            }
        }

        temp[j]=arr[arr.length-1];
        j++;

        int result[]=new int[j];
        for(int k=0;k<j;k++){
            result[k]=temp[k];
        }return result;


    }
    public static void main(String[] args) {
        int arr[] ={1,1,2,3,3};
        int ji[]=jio(arr);
        for (int x : ji) {
            System.out.print(x + " ");
        }
    }
}
