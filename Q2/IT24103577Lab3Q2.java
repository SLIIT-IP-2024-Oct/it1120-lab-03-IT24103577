import java.util.Scanner;
public class IT24103577Lab3Q2{
public static void main(String[] args)
{
 Scanner scan=new Scanner(System.in);
 System.out.print("Enter the monthly salary:");
 double Monthlysalary=scan.nextDouble();
 System.out.print("Enter the number of OT hours:");
 double OT_hours=scan.nextDouble();
 System.out.print("Enter the OT hourly rate:");
 double OT_Hourly_Rate=scan.nextDouble();
 double OT_Amount=(OT_hours* OT_Hourly_Rate);
 double Total_salary=(Monthlysalary +  OT_Amount);
 System.out.print("The total salary including OT is:" + Total_salary);
 }
}

   
  