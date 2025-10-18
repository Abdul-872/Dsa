import java.util.Arrays;

public class dublicate {
    public static int[] jio(int arr[]){
        int len=arr.length;
        int result[]=new int[len];
        int j=0;
        // Arrays.sort(arr);
        for(int i=1;i<len;i++){
            if(arr[i] == arr[i-1]){
                result[j++]=arr[i];
            }
        }
        int temp[]=new int[j];
        for(int k=0;k<j;k++){
            temp[k]=result[k];
        }return temp;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,2,4,5,6};
        int ji[]=jio(arr);
        // System.out.println(ji);
        for(int x:ji){
            System.out.print(x);
        }

    }
}
