import java.io.*;
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        float c,F;
        Scanner sc=new Scanner(System.in);
        c=sc.nextFloat();
        F=32+(c*9/5);
        System.out.format("%.2f",F);
    }
}