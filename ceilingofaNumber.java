import java.util.Scanner;

public class ceilingofaNumber {
    public static int ceil(int a[],int target) {
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
        return start;
        
    }
    public static void main(String[] args) {
        int arr[] = {14,16,17,18};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the target element");
        int target = in.nextInt();
        int index = ceil(arr,target);
        if(index<arr.length)
        System.out.println(arr[index]);
        else{
            System.out.println("elememt not exist0");
        }

    }
}
