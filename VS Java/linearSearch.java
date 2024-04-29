
class linearSearch{

    

public static void main(String args[])
    {
        int arrLength[] = {1,14,56,78,31};
        int answer = linearSearchAnswer(arrLength,31);
        System.out.print(answer);
    }
    static int linearSearchAnswer(int arr[], int target)
    {
    

          for(int i=0;i<arr.length;i++)
          {
            if(arr[i]==target)
            {
                return i;
            }        
          }
          return -1;
}}

