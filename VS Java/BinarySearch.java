 public class BinarySearch {
    

    public static void main(String args[])
{
    int binaryArray[]={10,23,45,67,78,96};
    int answer = binarySearch(binaryArray, 67);
    System.out.print(answer);

}

 static int binarySearch(int arr[], int target)
{

      int start=0;
   int end=arr.length-1;
   

    while(start<=end){

   int middle =start+(end-start)/2; 

   if(arr[middle]==target)
   {
    return middle;
   }
   else if(arr[middle]<target)
   {
    start=middle+1;
   }
   else{
    end=middle;
   }

}
return -1;
}


}
