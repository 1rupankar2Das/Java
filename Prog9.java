import java.util.Scanner;
public class Prog9 {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter Quality");
        int qty=Sc.nextInt();
        System.out.println("Enter Price");
        float price=Sc.nextFloat();
        float amt = qty*price;
        System.out.println("Total sales="+amt); 
    }
} 
