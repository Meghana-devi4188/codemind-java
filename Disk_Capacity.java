import java.io.*;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
      int d,a,b,c;
      Scanner sc=new Scanner(System.in);
      d=sc.nextInt();
      a=sc.nextInt();
      b=sc.nextInt();
      c=2*d*a*b*512;
      System.out.println(c);
    }
}
