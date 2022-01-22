public class Even_digits {
    public static void main(String[] args) {
        
        int arr[] = {12,345,2,6,7896};
        for(int elements : arr)
        {
           int i=0;
           int data=elements;
           while(data!=0)
           {
            i++;
            data = data / 10;
           }
           if(i%2==0)
           {
             System.out.print(elements+" ");
           }
        }

    }
}
