import java.util.Scanner;
public class Prog8 {
    public static void main(String args[])
    {
        System.out.println("Program to display Roll and name");
        Scanner Sc= new Scanner (System.in);
        System.out.println("Enter Roll:"); 
        int roll=Sc.nextInt();
        System.out.println("Enter Name:");
        String name=Sc.next();
        System.out.println("Roll="+roll);
        System.out.println("Name="+name);
    }
} 


