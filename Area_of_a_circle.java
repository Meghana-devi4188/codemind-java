import java.io.*;
import java.util.Scanner;
class Sample
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
    int pi,r;
    float area;
    r=sc.nextInt();
    area=(float)(3.14*r*r);
    System.out.format("%.2f",area);
    }
}