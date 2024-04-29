public class firstLast {
    
    public static void main(String args[])
    {
          int givenArray[] = {5,7,7,7,7,7,7,7,8,8,8,8,8,10};
          
          int printfirstElement = firstElement(givenArray,8);
           int printLastElement  = lastElement(givenArray, 8);
          System.out.print(printfirstElement);
          System.out.print(printLastElement);
    }

    static int firstElement(int arr[], int target)
    {
        int s=0;
        int e=arr.length-1;
       int ans=-1;
        while(s<=e)
        {
             int mid = s+(e-s)/2;
             if(target>arr[mid])
             {
                s=mid+1;
             }
             else if(target<arr[mid])
             {
                e=mid-1;
             }
             else
             {
                  ans=mid;
                  e=mid-1;
             }
        }
        return ans;
    }

    static int lastElement(int arr[], int target)
    {
        int s=0;
        int e=arr.length-1;
       int ans=-1;
        while(s<=e)
        {
             int mid = s+(e-s)/2;
             if(target>arr[mid])
             {
                s=mid+1;
             }
             else if(target<arr[mid])
             {
                e=mid-1;
             }
             else
             {
                  ans=mid;
                  s=mid+1;
             }
        }
        return ans;
    }



}
