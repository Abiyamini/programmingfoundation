import java.util.Scanner;

public class Main {
	public static float add(float a, float b) {
		return a+b;
	}
public static float sub(float a, float b) {
	return a-b;

}
public static float mul(float a, float b) {
	return a*b;
}
public static float div(float a, float b) {
	return a/b;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to show all methods to the user
		//switch case
		
		
		while(true) {
			System.out.println("Enter your choice"+" 1. Add \n 2. Sub\n 3.Mult\n 4.Div\n 5.Default");
			Scanner scanner = new Scanner(System.in);
		
		int choice = scanner.nextInt();
		switch(choice){
			case 1: {
				System.out.println("addition case");
				System.out.println("Pls enter 2 numbers ");
				float number1 = scanner.nextFloat();
				float number2= scanner.nextFloat();
				
				System.out.println(number1);
				System.out.println(number2);
				
				float result = add(number1,number2);
				
				System.out.println("addition result"+result);
				
			}
		
				break;
				case 2:{
	System.out.println("subtractionn case");
System.out.println("Pls enter 2 numbers ");
float number1 = scanner.nextFloat();
float number2= scanner.nextFloat();
//					
System.out.println(number1);
System.out.println(number2);
//					
float result = sub(number1,number2);
//					
System.out.println("Sub result"+result);
					
				}
			break;
				case 3:{
					System.out.println("Multiplication case");
					System.out.println("Pls enter 2 numbers ");
					float number1 = scanner.nextFloat();
					float number2= scanner.nextFloat();
//										
					System.out.println(number1);
					System.out.println(number2);
//										
					float result = mul(number1,number2);
//										
					System.out.println("Multiplication result"+result);
					
				}
				break;
				case 4:{
					System.out.println("Division case");
					System.out.println("Pls enter 2 numbers ");
					float number1 = scanner.nextFloat();
					float number2= scanner.nextFloat();
//										
					System.out.println(number1);
					System.out.println(number2);
//										
					float result = div(number1,number2);
//										
					System.out.println("Division result"+result);
					
					System.out.println("print number 4");
				}
					break;
				case 5:{
					System.exit(0);
				break;
				
				}
					
				}
				}
		
       //to print a message
	}
}

