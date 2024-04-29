public class infiniteSortedArray {
    
    public static void main(String args[])
    {int sortedArray[] = {12,34,56,76,77,87,89,90};
        int printSorted = infiniteSorted(sortedArray, 87);
        System.out.print(printSorted);
    }

    static int infiniteSorted(int arr[],int target)
    {
        int s=0;
        int e=1;
int ans=-1;
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(target>arr[e])
                {
                s=e+1;
                e=e*2;
            }
            else if(target<arr[mid])
            {
                e=mid-1;
            }
            else if(target>arr[mid])
            {
                s=mid+1;
            }
            else
            {
                ans=mid;
            }
        }
        return ans;
        
    }
}
