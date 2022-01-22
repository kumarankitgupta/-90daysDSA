import java.util.*;
public class FloorofaNumber {
    public static int floor(int a[],int target) {
        int start=0,end=a.length-1;
        while(start<=end){
            int mid = ( start + end )/2;
            if(target  == a[mid])
            {
                return mid; //target found 
            }
            else if(target < a[mid])
            {
                end = end-1;
            }
            else{
                start =mid +1;
            }
        }
        return end;
        
    }
    public static void main(String[] args) {
        int arr[] = {14,16,17,18};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = in.nextInt();
        int index = floor(arr,target);
        if(index>=0)
        System.out.println(arr[index]);
        else{
            System.out.println("elememt not exist0");
        }

    }
}
