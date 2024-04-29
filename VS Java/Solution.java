class Solution {
    
    public static void main(String args[]) {
        int nums[]={7,2,5,10,8};
        int k=2;
       int answer =  searchSpace(nums, k);
       System.out.print(answer);
        
    }

    // static int maxNumber(int arr[])
    // {
    //          int sum=0;

    //     for(int i=0;i<arr.length-1;i++)
    //     {
    //        sum=+arr[i];
    //     }  
    //     return sum;
    // }


    static int searchSpace(int arr[], int k)
    {
        int start=0;
        int sum=0;
          

        for(int i=0;i<arr.length-1;i++)
        {
           sum+=arr[i];
        }  
        
        int end=sum;
        int mid = start+(end-start)/2;
         int ans=-1;
          

        while(start<=end)
        {
           
            if(isPossible(arr,k,mid))
            {
              ans=mid;
             end= mid-1;

            }
            else
            {
                start=mid+1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int arr[],int k,int mid)
    {
          int aLength=arr.length;

        int kCount=1;
        int arraySum=0;

        for(int i=0;i<aLength;i++)
        {
          if(arraySum+arr[i] <= mid)
          { 
           arraySum+=arr[i];
          }
          else
          {
              kCount++;
              if(kCount>k)
              {
                  return false;
              }
              arraySum=arr[i];
          }

        }
        return true;
    }

}