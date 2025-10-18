import java.util.*;
public class Removezero {
    public static int[] jio(int nums[]){
        int left=0;
        for(int right=0;right<nums.length;right++){
            if(nums[right] != 0){
                int temp=nums[right];
                nums[right]=nums[left];
                nums[left]=temp;
                left++;
            }
        }return nums;
    }
    public static void main(String[] args) {
        int nums[]={14,0,6,7,0,5,3,2};
        int ji[]=jio(nums);
        for(int x:ji){
            System.out.print(x);
        }
    }
}
