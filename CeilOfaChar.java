import java.util.*;
public class CeilOfaChar {
        public static int ceil(char a[],char target) {
            int start=0,end=a.length-1;
            while(start<=end){
                int mid = ( start + end )/2;
                
                 if(target < a[mid])
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
            char arr[] = {'a','b','c','d'};
            Scanner in = new Scanner(System.in);
            System.out.println("the target element");
            char target=in.next().charAt(0);
            int index = ceil(arr,target);
            if(index<arr.length)
            System.out.println(arr[index]);
            else{
                System.out.println("elememt not exist");
            }
    
        }
    }