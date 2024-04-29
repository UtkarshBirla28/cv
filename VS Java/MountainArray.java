public class MountainArray {
    

    public static void main(String args[])
    {     int peakArray[]={0,3,4,5,6,10,9,8,7,6};
          int peak = findPeak(peakArray);
          int length= peakArray.length-1;
          

        int printBeforePeak = beforePeak(peakArray,6,0,peak);
        int printafterPeak = afterPeak(peakArray, 6, peak, length);
        

        System.out.println(printBeforePeak);
        System.out.print(printafterPeak);
    }


    static int findPeak(int arr[])
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

    static int beforePeak(int arr[],int target,int s,int e)
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

     static int afterPeak(int arr[],int target,int s,int e)
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
              else if(arr[mid]>target)
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
