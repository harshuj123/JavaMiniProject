package Rest;
import java.util.Scanner;

public class Restarant {
	public static Scanner input = new Scanner(System.in);
	public static int choice,Quantity=1;
	public static String again;
	public static double total=0,Pay;
	public static void menu() {
		System.out.println("-_-_-_-_-_-_-_");
		System.out.println("\tWELCOME to Our Restaurant");
		System.out.println("\tRestaurant Menu :");
		System.out.println("\t1.Barger BDT $80.00");
		System.out.println("\t2.Pizza  BDT $100.00");
		System.out.println("\t3.Coffee BDT $60.00");
		System.out.println("\t4.Cancel ");
	}
	public static void order() {
		System.out.println("1 to Barge1 || 2 to Pizza || 3 to Coffee");
		System.out.println("Press you want to order :");
		choice=input.nextInt();
		if(choice==1) {
			System.out.println("You choice Barger");
			System.out.println("How many Barger you to want :");
			Quantity=input.nextInt();
			total=total+(Quantity*80);
			System.out.println("You want ot buy Again :");
			System.out.println("Press Y for[Yess} and N for [No]:");
			again=input.next();
			if (again.equalsIgnoreCase("Y"))
				order();
			else
				System.out.println("Enter payment :");
				Pay=input.nextDouble();
				if(Pay<total)
					System.out.println("No,Need more");
				else {
					System.out.println("total="+total);
					total=Pay-total;
					System.out.println("Customer's return "+total);
					}
		}
	
	else if(choice==2) {
		System.out.println("You choice Pizza");
		System.out.println("How many Pizza you to want :");
		Quantity=input.nextInt();
		total=total+(Quantity*100);
		System.out.println("You want ot buy Again :");
		System.out.println("Press Y for[Yess} and N for [No]:");
		again=input.next();
		if (again.equalsIgnoreCase("Y"))
			order();
		else
			System.out.println("Enter payment :");
			Pay=input.nextDouble();
			if(Pay<total)
				System.out.println("No,Need more");
			else {
				System.out.println("total="+total);
				total=Pay-total;
				System.out.println("Customer's return "+total);
				
			}
	
}
else if(choice==3) {
	System.out.println("You choice Coffee");
	System.out.println("How many Coffee you want to order :");
	Quantity=input.nextInt();
	total=total+(Quantity*60);
	System.out.println("You want ot buy Again :");
	System.out.println("Press Y for[Yess} and N for [No]:");
	again=input.next();
	if (again.equalsIgnoreCase("Y"))
		order();
	else
		System.out.println("Enter payment :");
		Pay=input.nextDouble();
		if(Pay<total)
			System.out.println("No,Need more");
		else {
			System.out.println("total="+total);
			total=Pay-total;
			System.out.println("Customer's return "+total);
			}
		
	}
	else if(choice==4){	
		System.exit(0);
	}
	else {
		System.out.println("Choose a Food in this items :");
		order();
		
	}
	}
	

	public static void main(String[] args) {
		menu();
		order();
		

	}

}
