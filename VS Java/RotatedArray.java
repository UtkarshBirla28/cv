public class RotatedArray {
    

    public static void main(String args[])
    {   int nums[] = {4,5,6,7,0,1,2};
         int peak = findPeak(nums);
         int target=3;
         int length=nums.length-1;
         int firstTry = beforePeak(nums, target, 0, peak);
         int secondTry = beforePeak(nums, target, peak+1, length);
         if(nums[0]<=target)
         {
            System.out.print(firstTry);
         }
         else{
            System.out.print(secondTry);
         }

    }

  
   
    public static int findPeak(int arr[])
    {
        int s=0;
        int e=arr.length-1;

        while(s<e)
        {
            int mid=s+(e-s)/2;

            if(arr[mid]<arr[mid+1])
            {
                s=mid+1;
            }
            else
            {
                e=mid;
            }

        }
        return s;
    }

    public static int beforePeak(int arr[],int target,int s,int e)
    {
        int start=s;
        int end=e;
        while(start<=end)
        {
              int mid = start+(end-start)/2;
               if(arr[mid]==target)
               {
                return mid;
               }  
              else if(arr[mid]<target)
              {
                start=mid+1;
              }
              else
              {
                end=mid-1;
              }


        }
        return -1;
    }




    
}
