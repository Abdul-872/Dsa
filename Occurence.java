import java.util.*;
public class Occurence {
    public static int jio(int arr[],int target){
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                count++;
            }
        } return count;
    }
    public static void main(String[] args) {
        int arr[]={2,3,2,3,4,2};
        int target =2;
        int ko=jio(arr,target);
        System.out.print(ko);
    }
}
