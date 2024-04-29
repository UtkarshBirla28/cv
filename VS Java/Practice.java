import java.util.*;

public class Practice {
    
int a;
String b;
float c;




 void setValues()
 {
   Scanner sc = new Scanner();
  System.out.print("Enter of Value of a:");
    a = sc.nextInt();
 }

 void printValue()
 {
    System.out.print("Value of A is"+a);
 }

}


public class runProgram{

    public static void main(String[] args)
    {
        Practice obj1 = new Practice();
        obj1.setValues();
        obj1.printValue();

    }
}
