public class CeilingNumber {
    

    public static void main(String args[])
    {
        int ceilingArray[] = {2,4,6,8,13,45};
        int ansCeiling = ceiling(ceilingArray, 1);
        System.out.print(ansCeiling);
    }

    static int ceiling(int arr[], int target)
    {  int ans=0;
        int start=0;
        int end=arr.length-1;
        while(start<=end)
        {  int mid = start+(end-start)/2;   
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
                ans=mid;
                end=mid-1; 
            }
        }
        return ans;
        
    }
}
