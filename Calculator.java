import java.lang.*;
import java.util.*;
class Calculator{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    System.out.println("Enter 1 to add,2to subtract);
   int t1,t2;
                       t1=s.nextInt();
                       t2=s.nextInt();
                       int option=s.nextInt();
                       switch(option);
                       {
                         case 1:System.out.println(t1+t2);
                         break;
                         case 2:System.out.println(t1-t2);
                         break;
