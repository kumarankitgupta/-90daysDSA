import java.util.*;
public class LinearSearchIn2d {
     static boolean search(int arr[][]){
        System.out.println("Enter the Search value");
        Scanner in = new Scanner(System.in);
        int find = in.nextInt();
        for(int i=0 ; i<arr.length ; i++){
            for(int j=0; j<arr[i].length;j++){
                if(arr[i][j]==find)
                {
                    return true;
                }
            }
        }
         
        return false;

     }


    public static void main(String[] args) {
        int[][] arr ={
            {1,2,3},
            {4,5,6,7},
            {8,9,10,11}
        };
        System.out.println(Arrays.deepToString(arr));
        boolean result = search(arr);
        if(result)
        System.out.println("Found");
        else
        System.out.println("Not Found");
    

    }
}












































