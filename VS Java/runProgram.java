import java.util.*;

 class Practice {
    
int a;
String b;
float c;


Practice(int A,String B, float C)
{
  a=A;
  b=B;
  c=C;
}


void printValues()
{
  System.out.println("Value of A is "+a);
  System.out.println("Name of B is "+b);
  System.out.println("Decimal value of C is "+c);
}
 void setInt()
 {
   Scanner sc = new Scanner(System.in);
  System.out.print("Enter of Value of a:");
    a = sc.nextInt();
 }

 void setString()
 {
   Scanner sc = new Scanner(System.in);
  System.out.print("Enter of name of b:");
    b = sc.nextLine();
 }

 void printValue()
 {
    System.out.println("Value of A is "+a);
    System.out.print("Name of B is "+b);
 }

}


public class runProgram{

    public static void main(String[] args)
    {
        Practice obj1 = new Practice(2,"Utkarsh",1.2f);
        obj1.printValues();
        obj1.setInt();
        obj1.setString();
        obj1.printValue();
        
    } 
}
