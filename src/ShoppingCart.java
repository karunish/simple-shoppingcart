import java.util.Scanner;
public class ShoppingCart {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Getting the number of items in the cart
		System.out.println("Welcome to Shopping cart!");
		System.out.print("Please enter the amount of items in the cart: ");
		int numOfItem= input.nextInt();
		System.out.println();
		double total=0;
		
		//Loop for cart
		for (int i =1 ;i <= numOfItem; i++ ){
		System.out.print("Please enter the price of item "+i+": ");
		double price= input.nextDouble();
		System.out.print("Please enter the quantity of item "+i+": ");
		int quantity = input.nextInt();
		System.out.println();
		total += price*quantity;

		}
		
		System.out.println("Your subtotal is "+total+"\n");
		
		double discAmt=0;
		
		//Discount classification
		if (total>100){
			System.out.println("You're eligible for a 15% discount!");
			 discAmt= total*0.15; 
			 total -= discAmt;
			 System.out.printf("Your new subtotal is %.2f\n", total);
			 System.out.printf("You have saved %.2f!\n", discAmt);
			 System.out.println();
		}
			else if (total>=50 && total<=100) {
				System.out.println("You're eligible for a 10% discount!");
				discAmt= total*0.1; 
			 	total -=  discAmt;
			 	System.out.printf("Your new subtotal is %.2f\n", total);
			 	System.out.printf("You have saved %.2f!\n", discAmt);
				System.out.println();
			}
			else if (total<50){
				System.out.println("No applicable discounts found!");
				System.out.println();
	}
		System.out.println("Thank you for shopping with us!");
	}

}