

public class splitArrayLargestSum {
    


    public static void main(String args[])
    {
           int arr[] = {7,2,5,10,8};
           int start = 0;
           int end = sum(arr);
           int mid = start+(end-start)/2;
           int m=2;
           int ans=-1;
           while(start<end)
           {    
            if(isPossible(arr, arr.length-1, m, mid))
            {
                ans=mid;
                end=mid-1;
            }
            else
            {
                start=mid+1;
            }
            return ans;
           }
           
    }

    static int maximumElement(int arr[])
    {   int max = arr[0];
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]> max)
            {
               max=arr[i];
            }
        }
        return max;
    }
    static int sum(int arr[])
    {   int sumAdd=0;
        for(int i=0; i<arr.length; i++)
        {
            sumAdd += arr[i];
        }
        return sumAdd;
    }

    public static boolean isPossible(int arr[],int n, int m, int mid)
    {
         int kCount=0;
         int sumOfSubaaray=0;

         for(int i=0;i<n;i++)
         {
            if(sumOfSubaaray+arr[i]<=mid)
            { 
                 sumOfSubaaray+=arr[i];
            }
            else 
            {
                kCount++;
                if(sumOfSubaaray>m || arr[i]>m)
                {
                    return false;
                }
                sumOfSubaaray=arr[i];
            }
         } return true;
    }
   
}
