import java.util.*;
import java.util.Arrays;

class MissingArray 
{
    
    public static int MissingNumber(int arr[])
    {
        int n=arr.length;
        int total = 1;
        for (int i = 2; i <= (n + 1); i++) {
            total += i;
            total -= arr[i - 2];
        }
        return total;
    }
 
    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 5, 3 };
        System.out.println(MissingNumber(arr));
    }
}
 


