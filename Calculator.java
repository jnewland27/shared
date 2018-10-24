import java.util.Scanner;

public class Calculator{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int quit = 1;	
		int user = 0;
		
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;

		while(quit == 1){
			System.out.println("1. Sum, 2. Average, 3. Max, 4. Min and 0 to quit");
			user = input.nextInt();

			if(user == 1){
				
				System.out.println("Enter 3 numbers into the calculator");
				num1 = input.nextInt();
				num2 = input.nextInt();
				num3 = input.nextInt();
				System.out.println(sum(num1, num2, num3));
			}
			
			else if(user == 2){
				
				System.out.println("Enter 3 numbers into the calculator");
				num1 = input.nextInt();
				num2 = input.nextInt();
				num3 = input.nextInt();
				System.out.println(average(num1, num2, num3));
			}
			
			else if(user == 3){
				
				System.out.println("Enter 3 numbers into the calculator");
				num1 = input.nextInt();
				num2 = input.nextInt();
				num3 = input.nextInt();
				System.out.println(maximum(num1, num2, num3));
			}
			
			else if(user == 4){

				System.out.println("Enter 3 numbers into the calculator");
				num1 = input.nextInt();
				num2 = input.nextInt();
				num3 = input.nextInt();
				System.out.println(minimum(num1, num2, num3));
			}
			
			else if(user == 0){
				System.out.println("Turning off Calculator...");
				quit = 0;
			}
		}
	}

	public static int sum(int a, int b, int c){
		System.out.println("Sum: ");

		int d = a + b + c;
		return d;
	}

	public static double average(int a, int b, int c){
		System.out.println("Average: ");

		double d = (a + b + c)/3.0;
		return d;
	}

	public static int maximum(int a, int b, int c){
		System.out.println("Maximum: ");

		int d = a;
		if(d < b){
			d = b;
			if(d < c){
				d = c;
			}	
		}

		else if(d < c){
			d = c;
			if(d < b){
				d = b;
			}
		}

		return d;
	}

	public static int minimum(int a, int b, int c){
		System.out.println("Minimum: ");

		int d = a;
		if(d > b){
			d = b;
			if(d > c){
				d = c;
			}	
		}

		else if(d > c){
			d = c;
			if(d > b){
				d = b;
			}
		}

		return d;
	}





















}