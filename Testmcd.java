import java.util.*;
public class lab4_saipreetham {

    // returns the minimmum common denominator
    public static int mcd(int a, int b) {
    if(a==b)
        return a;
    else if (a>b) 
        return mcd(a-b,b);
    else
        return mcd(b-a,a);
    }

    public static int largest(int arr[]){
    assert(arr.length>0);
    int curLargest=arr[0];
    for(int i=1; i<arr.length; ++i) {
        if(arr[i]>curLargest) 
        curLargest=arr[i];
    }
    return curLargest;
    }

    public static void main(String args[]) {
    int arr[]={1,3,4,5,6,7,15,13,2};
    
    System.out.println("Hello SE ,I am saipreethambasana");
    
    System.out.println("The content of arr is");
    for(int i=0;i<arr.length;i++)
    {
        System.out.print(arr[i]+" ");
    }
    
    System.out.print("\n*********");

    System.out.println("\nThe largest number in array is "+largest(arr));
    
    }
}
