import java.util.*;
public class Secoundlarone {
    public static int sec(int arr[]){
        int sec =Integer.MIN_VALUE;
        int lar =Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>lar){
                sec=lar;
                lar=arr[i];
            }else if(arr[i] >sec && sec<lar){
                sec=arr[i];
            }
        }return sec;

    }    
    public static void main(String[] args) {
        int arr[] ={1,3,5,6,7,8};
        int jio=sec(arr);
        System.out.print(jio);
    }
}
