import java.util.Arrays;

class MergeSortedArray {

    public static double[] mergearray(double[] a1, double[] a2) {
        double[] a3 = new double[a1.length+a2.length];
        int first = 0, second = 0, third = 0;
        while(first<a1.length&&second<a2.length)
        {
            if(a1[first]<=a2[second]){
                a3[third]=a1[first];
                first++;
            }
            else{
                a3[third]=a2[second];
                second++;
            }
            third++;
        }
      while(first<a1.length){
        a3[third]=a1[first];
        first++;
        third++;
    }
    while(second<a2.length){
        a3[third]=a2[second];
        second++;
        third++;
    }
    System.out.println(first+" "+second+" "+third);
        return a3;
        
    }
    public static void main(String[] args) {
        double[] arr1 = {1,3};
        double[] arr2 = {2};
        double[] arr3 = new double[arr1.length+arr2.length];
        arr3=mergearray(arr1, arr2);
        System.out.println(Arrays.toString(arr3));
        double median;
        if(arr3.length%2!=0)
        {
            median=arr3[arr3.length/2];
            System.out.println("Median is : "+median);
        }
        else{
            median=(arr3[arr3.length/2]+arr3[(arr3.length/2)-1])/2;
            System.out.println("Median is : "+median);
        }



    }
}
