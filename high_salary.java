import java.util.*;
public class high_salary {
     public static int maxSalary(int arr[][]) {
          int sal = Integer.MIN_VALUE , sum=0;
          for(int i=0 ; i<arr.length ; i++){
              sum=0;
            for(int j=0; j<arr[i].length;j++){
                sum = sum + arr[i][j];
            }
            if(sal < sum)
            {
                sal = sum ;
            }
           
        }
      return sal;
        
    }
    


    public static void main(String[] args) {
        int[][] sal = {
        {1,2,3},
        {4,5,6,5},
        {3,6,4},
        {9,9}
        };
     int max = maxSalary(sal);
     System.out.println(max);
    }
}
