import java.util.*;

public class OrderAgnosticBinary_search {
     public static int Agnostic_binary_search(int arr[] , int find) {
        boolean isAsc;
        if(arr[0]<=arr[arr.length-1])
        isAsc = true;
        else isAsc = false;
        int mid ,start = 0, end = arr.length-1;
        while(start <= end)
        {   
            mid = (start + end )/2;
            if(arr[mid] == find){
                return mid;
            }
            else if(isAsc)
            {
               if(find > arr[mid]){
                    start = mid +1;
                }
                else 
                    end = mid -1; 
            }
            else{
                if(find > arr[mid]){
                    end =mid -1;
                }
                else 
                    start=mid+1; 
            }
        }
        return -1;}
        public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        System.out.print("Enetr the Search element ");
        int find = in.nextInt();
        int result = Agnostic_binary_search(arr,find);
        if(result!=-1)
        System.out.println("Found at position "+ (++result));
        else
        System.out.println("Not Found");
    }
}
