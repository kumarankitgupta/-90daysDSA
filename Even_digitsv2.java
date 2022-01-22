import java.lang.*;

public class Even_digitsv2 {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        int c=0;
        for(int element : nums)
        {
            if(((int)(Math.log10(element)) +1)%2==0){
                c++;
            }
        }
        System.out.println(c);
        int m = Integer.MIN_VALUE;
        System.out.println(m);
    }
    
}
