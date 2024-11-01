import java.util.Scanner;
public class IT24103577Lab3Q1A{
public static void main(String[] args)
{
Scanner scan = new Scanner(System.in);
System.out.print("Enter the price of 1kg of rice: ");
double PriceOF1Kg=scan.nextDouble();
System.out.print("Enter the number of kilograms you want to buy:");
double NumberOfkilograms=scan.nextDouble();
double Totalamount=PriceOF1Kg*NumberOfkilograms;
System.out.print("The total amount is: "+Totalamount);
 }
}






