import java.util.*;
class ArrayPosNeg{
    public static void main(String[] args){
        int arr[]={1,2,3,4,5,-1,2,-5,-7};
        int n=arr.length;
        int pos=0;
        int neg=0;
        for(int i=0;i<n;i++){
            if(arr[i]<0)   neg++;
            else    pos++;
        }
        System.out.println("Positive : "+pos);
        System.out.println("Negetive : "+neg);
    }
}