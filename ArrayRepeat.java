import java.util.*;
class ArrayRepeat{
    public static void main(String[] args){
        int arr[]={1,2,3,4,6,1,3,5,6};
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==arr[i+1])    System.out.println(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
    }
}