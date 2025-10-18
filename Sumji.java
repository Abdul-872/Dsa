import java.util.*;
public class Sumji {
    public static int summ(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }return sum;
    }
    public static void main(String[] args) {
        int arr[]={13,3,5,6,7,9};
        int jio=summ(arr);
        System.out.print(jio);
    }
    
}
